package med.voll.api.controller;

import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import med.voll.api.domain.dto.DadosAtualizacaoMedico;
import med.voll.api.domain.dto.DadosCadastroMedico;
import med.voll.api.domain.Medico;
import med.voll.api.domain.dto.DadosDetalhamentoMedico;
import med.voll.api.domain.dto.DadosListagemMedico;
import med.voll.api.domain.repository.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;


@RestController
@RequestMapping("/medicos")
@Slf4j
public class CadastroMedicoController {

    @Autowired
    private MedicoRepository repository;

    @PostMapping
    @Transactional
    public ResponseEntity cadastrar(@RequestBody @Valid DadosCadastroMedico body, UriComponentsBuilder uriBuilder){ //(DTO) A anotação é para dizer que o spring deve pegar o body da requisição
        var medico = new Medico(body);
        try {
            repository.save(medico);// devo converter o DTO para um objeto do tipo médico
            log.info("Dados cadastrados com sucesso {[]}", body);
        } catch (Exception e){
            log.error("Erro inesperado ao realizar transação de cadastro : {[]}", e.getMessage());
        }
        var uri = uriBuilder.path("/medicos/{id}").buildAndExpand(medico.getId()).toUri(); //devolvendo cabeçalho location com a uri (basicamente o path de onde tá chamando)
        return ResponseEntity.created(uri).body(new DadosDetalhamentoMedico(medico));
    }

    @GetMapping("/listar")
    public ResponseEntity<Page<DadosListagemMedico>> listar(@PageableDefault(size = 10, sort = {"nome"}) Pageable paginacao){ //pageable é para fazer a paginação de forma simples
        //converte uma lista de medicos para uma lista de DadosListagemMedico, que é o DTO
        var page = repository.findAllByAtivoTrue(paginacao).map(DadosListagemMedico::new); //existe um padrão na JPA que se eu fizer nesse sentido findAllByAlgumaCoisa, ele constrói
        //automaticamente a consulta da forma que eu desejar. No caso, ele está procurando pelo atributo ativo e somente os que está como True.
        return ResponseEntity.ok(page);
    }

    @PutMapping("/atualizar")
    @Transactional
    public ResponseEntity atualizar(@RequestBody @Valid DadosAtualizacaoMedico dados){
//        Quando a jpa carrega um classe/objeto do banco de dados e detecta que teve alguma alteração,
//        ela faz essa alteração sozinha. Então o put é feito de maneira automatica
        var medico = repository.getReferenceById(dados.getId());
        log.info("Informações enviadas para atualizar" + medico);
        medico.atulizarInformacoes(dados);
        log.info("Informações atualiadas : " + medico);
        return new ResponseEntity<>(new DadosDetalhamentoMedico(medico), HttpStatus.OK);
    }

    @DeleteMapping("/excluir/{id}")
    @Transactional
    public ResponseEntity excluir(@PathVariable Long id){ //o @PathVariable está setando o id da url como parametro do metodo
        var medico = repository.getReferenceById(id); //recuperando medico do banco de dados
        medico.excluir();
        return ResponseEntity.noContent().build(); //constrói um objeto ResponseEntity
    }
//    @DeleteMapping("/excluir/{id}")
//    @Transactional
//    public void excluir(@PathVariable Long id){ //o @PathVariable está setando o id da url como parametro do metodo
//        repository.deleteById(id);
//    }


}
