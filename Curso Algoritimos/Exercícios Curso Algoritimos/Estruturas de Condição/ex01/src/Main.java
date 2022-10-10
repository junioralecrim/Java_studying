import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Em que ano eu nasci?");
        int anoNascimento = in.nextInt();

        System.out.println("Em que ano estamos?");
        int anoAtual = in.nextInt();

        System.out.println("------------- QUANTIDADE DE VELINHAS PRO BOLO -------------\nVelinhas: " + (anoAtual - anoNascimento));
    }
}