import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int cont = 0, numb = 0;
        System.out.println("Digite o número que você quer a tabuada = ");
        numb = in.nextInt();

        do {
            cont += + 1;
            System.out.println(numb + " x " + cont + " = " + (numb*cont));
        } while (cont < 10);

    }
}