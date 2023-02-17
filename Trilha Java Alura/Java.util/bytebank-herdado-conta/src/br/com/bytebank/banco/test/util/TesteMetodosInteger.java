package br.com.bytebank.banco.test.util;

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
    }
}
