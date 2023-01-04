package org.example;

public class FluxoComTratamento {

    public static void main(String[] args) {
        System.out.println("Ini do main");
        metodo1();
        System.out.println("Fim do main");
    }

    private static void metodo1() {
        System.out.println("Ini do metodo1");
        try {
            metodo2();
        } catch (ArithmeticException e){
//            System.out.println("ArithmeticException" + e.getMessage());
            e.printStackTrace(); //rastro da pilha de execução
        } catch (NullPointerException exception){
            System.out.println("NullPointException " + exception.getMessage());
            exception.printStackTrace();
        }

        System.out.println("Fim do metodo1");
    }

    private static void metodo2() {
        System.out.println("Ini do metodo2");
        for (int i = 1; i <= 5; i++) {
            System.out.println(i);
//            int a = i / 0;
              Conta c = null;
              c.depositar(); //nullpoint
        }
    }
}