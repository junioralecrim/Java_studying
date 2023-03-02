package org.example;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestaListaDeAula {
    public static void main(String[] args) {
        Aula a1 = new Aula("Revisitando os ArrayLists", 21);
        Aula a2 = new Aula("Listas de objetos", 15);
        Aula a3 = new Aula("Relacionamento de listas e objetos", 15);
        Aula a4 = new Aula("Aula de teste ordenação", 1);

        ArrayList<Aula> aulas = new ArrayList<>();

        aulas.add(a1);
        aulas.add(a2);
        aulas.add(a3);
        aulas.add(a4);

        System.out.println(aulas);

        System.out.println("----------------- Antes do sort por titulo -----------------");
        aulas.forEach(aula -> {
            System.out.println(aula.getTitulo());
        });

        Collections.sort(aulas);

        System.out.println("----------------- Depois do sort por titulo -----------------");
        aulas.forEach(aula -> {
            System.out.println(aula.getTitulo());
        });

        System.out.println("----------------- Agora comparando o por tempo usando Comparator.comparing -----------------");

        Collections.sort(aulas, Comparator.comparing(Aula::getTempo));

        aulas.forEach(aula -> {
            System.out.println(aula.getTempo());
        });
    }
}
