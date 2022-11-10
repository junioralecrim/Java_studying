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
            i++;
        }

        System.out.println(users.get(0).getFirstName());
        System.out.println(users.get(0).getLastName());
    }
}