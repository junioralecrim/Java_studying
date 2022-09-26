import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("NP1 = ");
        int np1 = in.nextInt();

        System.out.println("NP2 = ");
        int np2 = in.nextInt();

        System.out.println("NP3 = ");
        int np3 = in.nextInt();

        if (np3 < 400){
            System.out.println("Reprovado por regressão");
        } else {
            float media = (np1 + np2 + np3)/3;
            System.out.println("--------------------------- NOTA ---------------------------\nMEDIA: " + media);
                if (media < 500){
                    System.out.println("F");

                    } else if (media >= 500 && media < 600){
                        System.out.println("APROVEITAMENTO: E");

                            } else if (media >= 600 && media < 700) {
                                System.out.println("APROVEITAMENTO: D");

                                    } else if (media >= 700 && media < 800) {
                                        System.out.println("APROVEITAMENTO: C");

                                            } else if (media >= 800 && media < 900) {
                                                System.out.println("APROVEITAMENTO: B");

                                                    } else if (media >= 900 && media <= 1000) {
                                                            System.out.println("APROVEITAMENTO: A");
                                                                } else {
                                                                    System.out.println("~~~~~~~~~~~~~~~~~~~~ ERRO ~~~~~~~~~~~~~~~~~~~~");
                                                                }

        }

    }
}