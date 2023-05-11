package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();

        int i = 0;
        while (i < 10){
            User actual = new User("Nome " + i, "Sobrenome " + i);
            users.add(actual);


            System.out.println(users.get(i).getFirstName());
            System.out.println(users.get(i).getLastName() + "\n");
            i++;
        }


        User user11 = new User("Nome 11", "Sobrenome 11");
        users.add(user11);

        System.out.println(users.get(10).getFirstName());
        System.out.println(users.get(10).getLastName());


        System.out.println("------------------- buscando item especifico pelo metodo get -------------------");
        for (i = 0; i < users.size(); i++){ //size é para retornar o número de elementos de uma lista, tipo o length
            System.out.println("\n\n");
            System.out.println(users.get(i));
        }

        //passando o elemento para descobrir o índice por meio de correspondência de String
        List<String> nomes = new ArrayList<>();

        nomes.add("Junior");
        nomes.add("Daniel");
        nomes.add("Germana");
        nomes.add("1");

        int index = nomes.indexOf("1");

        System.out.println(index);


        //retorna se a lista está ou não vazia
        List<String> teste = new ArrayList<>();
        System.out.println(users.isEmpty());
        System.out.println(teste.isEmpty());
    }
}