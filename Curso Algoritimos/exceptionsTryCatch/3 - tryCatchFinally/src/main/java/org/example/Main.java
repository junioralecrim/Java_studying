package org.example;

public class Main {
    public static void main(String[] args) {

        int[] numeros = {4, 8, 16, 32, 64, 128};
        int[] denominadores = {2, 0, 4, 8, 0};

        for (int i= 0; i < numeros.length; i++){
            try {
                System.out.println(numeros[i] + "/" + denominadores[i] + " = " + (numeros[i]/denominadores[i]));
            }
            catch (ArithmeticException | ArrayIndexOutOfBoundsException e){
                System.out.println("Aconteceu um erro");
                System.exit(0); /* Com o System.exit(0) o programa vai parar imediatamente a sua execução e
                 o finally não será executado*/
            }
            finally { /*Apesar do finally sempre ser executado*/
                System.out.println("Essa linha sempre é exibida após o try ou catch");
            }
        }

    }
}