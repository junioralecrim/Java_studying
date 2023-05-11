package med.voll.api.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/medicos")
public class CadastroMedicoController {

    @PostMapping
    public void cadastrar(@RequestBody String json){ //A anotação é para dizer que o spring deve pegar o body da requisição
        System.out.println(json);
    }
}
