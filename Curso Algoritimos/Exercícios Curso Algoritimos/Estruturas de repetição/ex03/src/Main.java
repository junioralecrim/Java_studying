import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("---------------------- CONTAGEM INTELIGENTE ----------------------");
        System.out.println("Começando em: ");
        int numeroInicial = in.nextInt();

        System.out.println("Terminando em: ");
        int numeroFinal = in.nextInt();

        if (numeroInicial < numeroFinal){
            for(int i = numeroInicial; i <= numeroFinal;){
                System.out.print(i + "... ");
            }
        } else {
            for(int i = numeroInicial; i >= numeroFinal; i--){
                System.out.print(i + "... ");
            }
        }
    }
}