import java.util.Scanner;

public class Main {

    private static void parOuImpar(int numb) {
        if (numb%2 == 0){
            System.out.println(numb + " é par");
        } else {
            System.out.println(numb + " é impar");
        }

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite o número: ");
        int numb = in.nextInt();

        parOuImpar(numb);
    }


}