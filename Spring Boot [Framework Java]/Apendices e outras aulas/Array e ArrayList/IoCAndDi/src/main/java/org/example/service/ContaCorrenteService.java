package org.example.service;

import org.example.Cliente;
import org.example.ContaCorrente;
import org.springframework.stereotype.Component;

@Component
public class ContaCorrenteService {

    public void depositar(Cliente cliente, ContaCorrente conta, double valor){
        System.out.printf("Cliente %s, efetuando depósito de %.2f na conta %d do cliente %s\n", cliente.getNome(), valor,
                conta.getNumero(), conta.getCliente().getNome());
        conta.setSaldo(conta.getSaldo() + valor);
    }
}
