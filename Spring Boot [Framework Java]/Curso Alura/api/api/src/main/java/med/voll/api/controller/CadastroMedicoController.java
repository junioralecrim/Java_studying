package med.voll.api.controller;

import med.voll.api.model.medico.DadosCadastroMedico;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/medicos")
public class CadastroMedicoController {

    @PostMapping
    public void cadastrar(@RequestBody DadosCadastroMedico dados){ //A anotação é para dizer que o spring deve pegar o body da requisição
        System.out.println(dados);
    }
}
