import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int quantValPar = 0;

        System.out.print("Digite o tamanho do vetor = ");
        int n = in.nextInt();

        int vet[] = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Digite o " + (i+1) + "° valor = ");
            vet[i] = in.nextInt();
        }

        for (int i = 0; i < n; i++) {
            System.out.println("------------------------------\nVet[" + (i+1) + "] = " + vet[i]);

            if (vet[i]%2 == 0){
                   quantValPar += 1;
            }
        }

        System.out.println("\nAs posições dos valores pares são: ");

        for (int i = 0; i < n; i++){
            if (vet[i]%2 == 0){
                System.out.print("\nvet[" + i + "]");
            }
        }


        System.out.println("\n=================================\nQuant valores pares = " + quantValPar);

    }
}