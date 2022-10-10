import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Quer contar até quanto? ");
        int x = in.nextInt();

        System.out.println("Qual será o valor do salto? ");
        int y = in.nextInt();

        for (int i = 0; i < x;){
            i += + y;
            System.out.println("-- " + (i));
        }

    }
}