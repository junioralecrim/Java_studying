import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String resp;

        do {
            System.out.println("VOCÊ ESTÁ DE CASTIGO!!!!!\n");
            System.out.println("Já arrumou o quarto? [S/N]");
            resp = in.next().toUpperCase();

        } while (resp.equals("N"));
    }
}