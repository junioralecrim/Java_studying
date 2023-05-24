package med.voll.api.controller;

import med.voll.api.model.medico.Medico;
import med.voll.api.model.medico.dto.DadosCadastroMedico;
import med.voll.api.model.medico.repository.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/medicos")
public class CadastroMedicoController {

    @Autowired
    private MedicoRepository repository;

    @PostMapping
    public void cadastrar(@RequestBody DadosCadastroMedico dados){ //(DTO) A anotação é para dizer que o spring deve pegar o body da requisição
        repository.save(new Medico(dados));// devo converter o DTO para um objeto do tipo médico
    }
}
