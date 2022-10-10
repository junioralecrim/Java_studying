import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Quantos reais eu tenho? ");
        float reais = in.nextFloat();

        System.out.println("--------------------- QUANTIDADE DE DÓLARES QUE VOCÊ TEM ---------------------" +
                "\nReais: " + reais + "\nDólares: " + reais * 4.50);
    }
}