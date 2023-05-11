package org.example;

public class Main {
    public static void main(String[] args) {

        Contador contador = new Contador();
        Contador contador1 = new Contador();


        contador.incremetCount();
        System.out.println(contador.retornarValorCount());
        System.out.println(contador1.retornarValorCount());


        contador.zerarContador();
        System.out.println("\n\n" + contador.retornarValorCount());

        System.out.println(contador1.retornarValorCount());


    }
}