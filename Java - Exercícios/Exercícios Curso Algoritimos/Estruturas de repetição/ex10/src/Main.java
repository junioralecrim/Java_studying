import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n\n=====================\n|      M E N U      |\n=====================\n|   [1] De 1 a 10   |\n|   [2] De 10 a 1   |\n" +
                    "|   [3] Sair        |\n=====================\n");
                opcao = in.nextInt();

                if(opcao == 1){
                    int cont = 0;
                    while (cont < 10){
                        System.out.print((cont+1) + "... ");
                        cont += 1;
                    }

                } else if (opcao == 2) {
                    int cont = 10;
                    while (cont > 0) {
                        System.out.print(cont + "... ");
                        cont -= 1;
                    }

                }
        } while (opcao != 3);

    }
}