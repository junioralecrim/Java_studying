import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int contNgt = 0, quantNumber;
        System.out.println("Quantos números você quer digitar?");
        quantNumber = in.nextInt();

        do {
            System.out.println("Número: ");
            int number = in.nextInt();
            if (number < 0){
                contNgt += + 1;
            }
            quantNumber += - 1;
        } while (quantNumber > 0);
        System.out.println("\nQuantidade de números negativos: " + contNgt);
    }
}