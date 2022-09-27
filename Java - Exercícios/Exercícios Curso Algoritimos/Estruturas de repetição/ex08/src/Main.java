import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = 0, cont = 0, fat = 1;

        System.out.print("Digite o número que quer saber o fatorial: ");
        number = in.nextInt();
        cont = number;

        do {
            fat = fat * cont;
            cont = cont - 1;
        } while (cont >= 1);

        System.out.println("Número digitado para fazer o fatorial = " + number + "\nResultado do fatorial = " + fat);
    }
}