import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num1, num2;

        System.out.println("Digite o primeiro número: ");
        num1 = in.nextInt();

        System.out.println("Digite o segundo número: ");
        num2 = in.nextInt();


        for (int i = num1; i <= num2; i++){
            for (int y = num1; y <= num2; y++){
                System.out.println(i + ", " + y);
            }
            System.out.println("\n");
        }


    }
}