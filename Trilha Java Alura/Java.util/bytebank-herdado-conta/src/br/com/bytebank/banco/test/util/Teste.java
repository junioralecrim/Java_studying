package br.com.bytebank.banco.test.util;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Teste {
    public static void main(String[] args) {
        Conta cc1 = new ContaCorrente(22, 33);
        cc1.deposita(333.0);

        Conta cc2 = new ContaPoupanca(22, 44);
        cc2.deposita(444.0);

        Conta cc3 = new ContaCorrente(22, 11);
        cc3.deposita(111.0);

        Conta cc4 = new ContaPoupanca(22, 22);
        cc4.deposita(222.0);

        List<Conta> lista = new ArrayList<>();
        lista.add(cc1);
        lista.add(cc2);
        lista.add(cc3);
        lista.add(cc4);

        for (Conta c: lista) {
            System.out.println(c);
        }

        NumeroDaContaComparator comparator = new NumeroDaContaComparator();
        lista.sort(comparator);

        System.out.println("------------------------------");

        for (Conta c: lista
             ) {
            System.out.println(c);
        }
    }

    public static class NumeroDaContaComparator implements Comparator<Conta> { /*preciso implementar uma classe que contenha um comparator
        implementado para puxar o critério de comparação e adicionar no método .sort*/
        @Override
        public int compare(Conta c1, Conta c2) {

            if (c1.getNumero() < c2.getNumero()){
                return -1;
            }
            if (c1.getNumero() > c2.getNumero()){
                return 1;
            }

            return 0;
        }
    }

}
