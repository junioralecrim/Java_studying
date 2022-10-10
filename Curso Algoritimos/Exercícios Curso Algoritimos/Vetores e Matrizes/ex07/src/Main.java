import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String cadeirasB[] = {"[ B 1 ]", "[ B 2 ]", "[ B 3 ]", "[ B 4 ]", "[ B 5 ]", "[ B 6 ]", "[ B 7 ]", "[ B 8 ]", "[ B 9 ]", "[ B 10 ]"};
        String opcao;

        do {
            for (int j = 0; j < cadeirasB.length; j++) {
                System.out.print(cadeirasB[j]);
            }

            System.out.println("\n\n-----------------------------------------------------------------------\n" +
                    "DESEJA RESERVAR ALGUMA CADEIRA? [S/N]");
            opcao = in.next().toLowerCase();

            if (opcao.equals("n")){
                break;
            }

            System.out.println("Reservar cadeira: ");
            String opcaoCadeira = in.next().toUpperCase();

            int auxFlag = 0;
            for (int i = 0; i < cadeirasB.length; i++){
                String cadeira = cadeirasB[i].replace(" ", "").replace("[", "").replace("]", "");
                if (cadeira.equals(opcaoCadeira)){
                    cadeirasB[i] = "[ --- ]";
                } else {
                    auxFlag += 1;
                }
            }
            if (auxFlag == cadeirasB.length){
                System.out.println("ERRO! A CADEIRA SELECIONADA ESTÁ INDISPONÍVEL OU NÃO EXISTE!\n\n");
            }

        } while (opcao.equals("s"));
    }
}