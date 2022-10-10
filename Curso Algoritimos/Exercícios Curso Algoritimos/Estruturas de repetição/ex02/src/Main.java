import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numero, maior = 0, aux = 0;

        System.out.println("Quantos números você deseja somar?");
        int quant = in.nextInt();

        for (int i = 0; i < quant; i++){
            System.out.println("Digite o número: ");
            numero = in.nextInt();
            aux += numero;

            if (numero > maior){
                maior = numero;
            }
        }

        System.out.println("Soma total: " + aux + "\nMaior número digitado: " + maior);
    }
}