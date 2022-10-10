import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Quantos nomes você deseja cadastrar? ");
        int n = in.nextInt();
        String nomeVetAux[] = new String[n];
        in.nextLine();


        for (int i = 0; i < n; i++){
            System.out.print("DIGITE O " + (i+1) + "° N0ME : ");
            nomeVetAux[i] = in.nextLine();
        }

        System.out.println("\n-------------------- PESSOAS COM A INICIAL C --------------------");
        for (int i = 0; i < n; i++){
            String nome = nomeVetAux[i].substring(0, 1).toLowerCase();
            if (nome.equals("c")){
            System.out.println(nomeVetAux[i]);
            }
        }
    }
}