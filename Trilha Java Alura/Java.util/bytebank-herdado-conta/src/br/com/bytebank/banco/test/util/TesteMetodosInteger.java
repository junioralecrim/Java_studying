package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.List;

public class TesteMetodosInteger {
    public static void main(String[] args) {
        int[] idades = new int[5];
        String[] nomes = new String[5];

        int idade = 29;

        Integer idadeRef = Integer.valueOf(10); //adicionar valor ao Integer por boxing
        int valor = idadeRef.intValue(); //adiciona valor ao int por unboxing

        String s = args[0]; //"10"

        Integer numero = Integer.valueOf(s);
        System.out.println(numero);

        List<Number> lista = new ArrayList<>(); //number cabe todos os tipos literais numericos
        lista.add(15);
        lista.add(35.4);
        lista.add(15.2f);
    }
}
