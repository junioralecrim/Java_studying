import java.util.Scanner;

public class Main {
    public static int fatorial(int num){
        int fat = 1;

        for(int i = 1; i < num; i++){
            fat *= (i+1);
        }
        return fat;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite um número para saber o seu fatorial: ");
        int num = in.nextInt();
        System.out.println("O fatorial de " + num + " é " + fatorial(num));
    }
}