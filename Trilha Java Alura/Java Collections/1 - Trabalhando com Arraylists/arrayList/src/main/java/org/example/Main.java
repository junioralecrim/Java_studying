package org.example;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        String aula01 = "Conhecendo mais de listas";
        String aula02 = "Modelando a classe Aula";
        String aula03 = "Trabalhando com Cursos e Sets";

        ArrayList<String> aulas = new ArrayList<>();
        aulas.add(aula01);
        aulas.add(aula02);
        aulas.add(aula03);

        System.out.println(aulas);

        aulas.remove(0);

        System.out.println(aulas);

        for (String aula : aulas) { //"para cada string aula dentro de aulas"
            System.out.println("Aula: " + aula);
        }

        System.out.println("A primeira aula é: " + aulas.get(0));

        System.out.println("###############################################");
        aulas.forEach(aula -> {
            System.out.println("Percorrendo : " + aula);
        });

        aulas.add("Aumentando no nosso conhecimento");


        System.out.println("--------- Antes da ordenação ---------");
        System.out.println(aulas);

        Collections.sort(aulas);

        System.out.println("--------- Depois da ordenação ---------");
        System.out.println(aulas);
    }
}