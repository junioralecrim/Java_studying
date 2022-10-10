import java.util.Scanner;

public class Main {

    public static String parOuImpar(int numb){
        String result = "impar";

        if (numb%2 == 0){
            result = "par";
            return result;
        } else {
            return result;
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite um número para verificar se é par ou impar: ");
        int numb = in.nextInt();
        System.out.println("O número que você digitou é " + parOuImpar(numb));
    }
}