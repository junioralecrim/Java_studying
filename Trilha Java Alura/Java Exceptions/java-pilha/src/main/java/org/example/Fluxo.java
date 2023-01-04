package org.example;

public class Fluxo {

    public static void main(String[] args) {
        System.out.println("Ini do main");
        try {
            metodo1();
        } catch (ArithmeticException | NullPointerException | MinhaExecao e){
            System.out.println("Exception " + e.getMessage());
            e.printStackTrace();
        }
        System.out.println("Fim do main");
    }

    private static void metodo1() {
        System.out.println("Ini do metodo1");
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() throws MinhaExecao{ //esse tipo de exception necessita que seja explicito na assinatura do método
        //por extender de exception
        System.out.println("Ini do metodo2");

        throw new MinhaExecao("deu muito errado");

        //throw aritEx; //código sai abruptamente daqui
        //só posso jogar exceções na pilha

        //System.out.println("Fim do metodo2");
    }
}