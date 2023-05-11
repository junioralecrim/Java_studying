package org.example;

import org.example.model.Banco;
import org.example.model.Cliente;
import org.example.model.ContaCorrente;
import org.example.service.ContaCorrenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class Teste {

    @Autowired
        ContaCorrenteService servico; //invertendo controle, dando o mesmo para o serviço criado e retirando do cliente

        public void teste(Double valor){
            Cliente clienteMagaton = new Cliente("Gabriel Magaton");


            Banco banco = new Banco("BV", 413);
            Cliente cliente = new Cliente("Francisco Junior Alecrim");
            ContaCorrente conta = new ContaCorrente(cliente, banco);

            System.out.println("O cliente " + conta.getCliente().getNome() + " possui a conta " + conta.getNumero()+
                    " no banco " + conta.getBanco().getNome() + " de codigo " + conta.getBanco().getCodigo() + "");
            System.out.println("A conta corrente de " + conta.getCliente().getNome() + " possui saldo " + conta.getSaldo());

            servico.depositar(clienteMagaton, conta, valor);

            System.out.println("A conta corrente " + conta.getCliente().getNome() + " possui saldo " + conta.getSaldo());

        }
}
