import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m[][] = new int[3][2];

        for (int linha = 0; linha < 3; linha++){
            for (int coluna = 0; coluna < 2; coluna++) {
                System.out.print("[" + linha + ", " + coluna + "]: ");
                m[linha][coluna] = in.nextInt();
            }
        }
        for (int linha = 0; linha < 3; linha++){
            for (int coluna = 0; coluna < 2; coluna++) {
                System.out.print(m[linha][coluna] + " ");
            }
            System.out.println("\n");
        }
    }
}