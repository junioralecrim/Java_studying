package org.example.service;

import org.example.model.Cliente;
import org.example.model.ContaCorrente;
import org.springframework.stereotype.Component;


@Component
public class ContaCorrenteService {

    public void depositar(Cliente cliente, ContaCorrente conta, Double valor){
        System.out.printf("Cliente %s, efetuando depósito de %.2f na conta %d do cliente %s\n", cliente.getNome(), valor,
                conta.getNumero(), conta.getCliente().getNome());
        conta.setSaldo(conta.getSaldo() + valor);
    }
}
