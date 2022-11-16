package org.example.web;

import org.example.Teste;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class ContaCorrenteController {

    @Autowired
    private Teste teste;

    @GetMapping("/conta-corrente/depositar")
    public String depositar(){
        teste.teste();
        return "Operação efetuada com sucesso!";
    }
}
