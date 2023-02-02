package br.com.bytebank.banco.teste;

import java.awt.*;

public class TesteString {
    public static void main(String[] args) {
        String nome = "       Alura          ";//object literal
        //String outro = new String("Alura");
        String nomeVazio = "       ";

        String nomeAlura = "Alura";
        String teste = "Alu";

        nome = nome.replace("A", "a");

        System.out.println(nomeVazio.isEmpty());

        nomeVazio = nomeVazio.trim();

        System.out.println(nomeVazio.isEmpty());
/*
        nome.toUpperCase();

        int pos = nome.indexOf("ur");
*/

        System.out.println(nome);

        //------------------------------------------

        System.out.println(nome.contains("Alu"));







    }
}
