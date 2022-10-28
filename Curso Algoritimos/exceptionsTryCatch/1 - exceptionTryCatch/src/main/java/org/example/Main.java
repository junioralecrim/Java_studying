package org.example;

public class Main {
    public static void main(String[] args) {

        try {
            int[] vetor = new int[4];
            System.out.println("Antes de exception (try)");

            vetor[4] = 1;

            System.out.println("Esse texto não deverá ser impresso, pois ele é " +
                    "após a exception");

        } catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Excção ao acessar um índice do vetor que não existe");
        }

        System.out.println("Esse texto será impresso após a exception");

    }
}

