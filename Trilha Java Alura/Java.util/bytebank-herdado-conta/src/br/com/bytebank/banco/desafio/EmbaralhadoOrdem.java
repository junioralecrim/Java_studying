package br.com.bytebank.banco.desafio;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmbaralhadoOrdem {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        Collections.shuffle(list); //embaralhando elementos da lista

        System.out.println(list);

        Collections.shuffle(list); //embaralhando novamente

        System.out.println(list);
    }
}
