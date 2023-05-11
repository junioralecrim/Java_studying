package org.example.web;

import org.example.Teste;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController()
public class ContaCorrenteController {

    @Autowired
    private Teste teste;

    /* Posso usar esse ex quando quiser os dados da conta-corrente de algum cliente com id específico.
    EX: passei alguns dados de login e a query por url vai retornar os dados dele pelo model*/
    @GetMapping("/conta-corrente/{codigoContaCorrente}")
    public String depositar(@PathVariable Long codigoContaCorrente){
        return "Conta corrente " + codigoContaCorrente + " válido";
    }

    /* Depositar eu coloco via Post */
    @GetMapping("/conta-corrente/depositar/{valor}")
    public String depositar(@PathVariable Double valor){
        System.out.println("Depositando " + valor);
        teste.teste(valor);
        return "Operação efetuada com sucesso!";
    }

    /* O certo, para depósito no caso, seria melhor usar quest parameter */

    @GetMapping("/conta-corrente/depositar-valor")
    public String depositarValor(@RequestParam Double valor){

        System.out.println("Depositando valor " + valor);
        teste.teste(valor);
        return "Operação efetuada com sucesso!";
    }

}
