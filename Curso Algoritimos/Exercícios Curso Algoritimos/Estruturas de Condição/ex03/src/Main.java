import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Qual o meu peso?\n");
        float massa = in.nextFloat();

        System.out.println("Qual a minha altura? ");
        float altura = in.nextFloat();

        float x = massa/(altura*altura);

        System.out.println("~~~~~~~~~~~~~~ MEU IMC ~~~~~~~~~~~~~~\n" + x);
        if (x < 17){
            System.out.println("Muito abaixo do peso");

                } else if ((x >= 17) && (x < 18.5)) {
                    System.out.println("Abaxio do peso");

                    } else if ((x >= 18.5) && (x < 25)){
                        System.out.println("Peso ideal");

                        } else if ((x >= 25) && (x < 30)){
                            System.out.println("Sobrepeso");

                            } else if ((x >= 30) && (x < 35)){
                                System.out.println("Obesidade");

                                } else if ((x >= 35) && (x < 40)){
                                    System.out.println("Obesidade Severa");

                                        } else if (x >= 40){
                                            System.out.println("Obesidade Mórbida");
                                            }

    }
}