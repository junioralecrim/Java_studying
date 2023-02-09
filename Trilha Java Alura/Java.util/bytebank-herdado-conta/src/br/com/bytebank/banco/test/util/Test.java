package br.com.bytebank.banco.test.util;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

import java.util.ArrayList;

public class Test {

    public static void main(String[] args) {
        ArrayList lista = new ArrayList<>();

        Conta cc = new ContaCorrente(11, 12);
        lista.add(cc);

        Conta cc2 = new ContaCorrente(15,16);
        lista.add(cc2);

//        System.out.println(lista.get(1));
//
//        lista.remove(0);
//
//        System.out.println(lista.size());

        Conta cc3 = new ContaCorrente(20, 21);
        lista.add(cc);

        Conta cc4 = new ContaCorrente(17,19);
        lista.add(cc2);

        for (int i = 0; i < lista.size(); i++){
            Object oRef = lista.get(i);
            System.out.println(oRef);
        }

        System.out.println("-------------------------");

        for (Object o : lista){
            System.out.println(o);
        }
    }
}
