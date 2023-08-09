package med.voll.api.controller;

import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import med.voll.api.domain.dto.DadosCadastroMedico;
import med.voll.api.domain.Medico;
import med.voll.api.domain.dto.DadosListagemMedico;
import med.voll.api.domain.repository.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/medicos")
@Slf4j
public class CadastroMedicoController {

    @Autowired
    private MedicoRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastroMedico body){ //(DTO) A anotação é para dizer que o spring deve pegar o body da requisição
        try {
            repository.save(new Medico(body));;// devo converter o DTO para um objeto do tipo médico
            log.info("Dados cadastrados com sucesso {}", body);
        } catch (Exception e){
            log.error("Erro inesperado ao realizar transação de cadastro : {[]}", e.getMessage());
        }
    }

    @GetMapping
    public List<DadosListagemMedico> listar(){
        return repository.findAll(); //retorna os dados da tabela
    }
}
