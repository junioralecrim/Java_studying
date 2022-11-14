package org.example;

import org.example.model.Banco;
import org.example.model.Cliente;
import org.example.model.ContaCorrente;
import org.example.service.ContaCorrenteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Teste {
        @Autowired
        ContaCorrente servico;

        public void teste(){
            ContaCorrenteService service = new ContaCorrenteService();//invertendo controle, dando o mesmo para o serviço criado e retirando do cliente
            //porém a dependência está fortemente acoplada

            Cliente clienteMagaton = new Cliente("Gabriel Magaton");


            Banco banco = new Banco("BV", 413);
            Cliente cliente = new Cliente("Francisco Junior Alecrim");
            ContaCorrente conta = new ContaCorrente(cliente, banco);

            System.out.println("O cliente " + conta.getCliente().getNome() + " possui a conta " + conta.getNumero()+
                    " no banco " + conta.getBanco().getNome() + " de codigo " + conta.getBanco().getCodigo() + "");
            System.out.println("A conta corrente de " + conta.getCliente().getNome() + " possui saldo " + conta.getSaldo());

            service.depositar(clienteMagaton, conta, 1000);

            System.out.println("A conta corrente " + conta.getCliente().getNome() + " possui saldo " + conta.getSaldo());

        }
}
