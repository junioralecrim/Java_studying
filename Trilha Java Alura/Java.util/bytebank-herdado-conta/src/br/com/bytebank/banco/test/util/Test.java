package br.com.bytebank.banco.test.util;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {

        //<> --> Generics
        ArrayList<Conta> lista = new ArrayList<>();

        Conta cc = new ContaCorrente(11, 12);
        lista.add(cc);

        Conta cc2 = new ContaCorrente(15,16);
        lista.add(cc2);

        Conta cc3 = new ContaCorrente(15,16);
        //lista.add(cc3);

        boolean exist = lista.equals(cc3);

        System.out.println("Já existe? " + exist);

        for (Conta conta : lista){
                System.out.println("Já tenho essa referencia " + conta);
        }
    }
}
