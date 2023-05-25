package med.voll.api.controller;

import jakarta.transaction.Transactional;
import med.voll.api.domain.dto.DadosCadastroMedico;
import med.voll.api.domain.Medico;
import med.voll.api.domain.repository.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/medicos")
public class CadastroMedicoController {

    @Autowired
    private MedicoRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody DadosCadastroMedico dados){ //(DTO) A anotação é para dizer que o spring deve pegar o body da requisição
        repository.save(new Medico(dados));;// devo converter o DTO para um objeto do tipo médico
    }
}
