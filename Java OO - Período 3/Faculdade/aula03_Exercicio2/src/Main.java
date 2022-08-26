import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int i = 1;

    System.out.println("1 - Ligar TV\n");
    i = in.nextInt();

    while(i == 1){
        System.out.println("\n0 - Desligar TV\n");
        i = in.nextInt();

    }

    }
}