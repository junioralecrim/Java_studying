import java.util.Scanner;

public class Main {



    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int contMediaGeral = 0;

        System.out.print("Quantos alunos você quer cadastrar? ");
        int n = in.nextInt();

        String vetAlunosNome[] = new String[n];
        int vetNp1[] = new int[n];
        int vetNp2[] = new int[n];
        int vetMediaAluno[] = new int[n];

        System.out.println("===================== CADASTRO ALUNOS =====================");
        for (int i = 0; i < n; i++){
            System.out.println("----------------- FICHA " + (i+1) + "° ALUNO -----------------");
            System.out.print("Nome " + (i+1) + "° aluno : ");
            in.nextLine();
            vetAlunosNome[i] = in.nextLine();
            System.out.print("\nNP1 = ");
            vetNp1[i] = in.nextInt();
            System.out.print("\nNP2 = ");
            vetNp2[i] = in.nextInt();
            vetMediaAluno[i] = (vetNp1[i]+vetNp2[i])/2;
            contMediaGeral += vetMediaAluno[i];
            System.out.println("\n");
        }

        System.out.println("============================= ALUNOS A CIMA DA MÉDIA =============================");
        for (int i = 0; i < n; i++){
            if (vetMediaAluno[i] >= 7.0){
                System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~ FICHA DO(A) " + vetAlunosNome[i] + " ~~~~~~~~~~~~~~~~~~~~~~~~~~~");
                System.out.println("NP1 = " + vetNp1[i] + "\nNP2 = " + vetNp2[i] + "\nMÉDIA: " + vetMediaAluno[i]);
            }
        }
        System.out.println("MÉDIA GERAL DA TURMA ---> " + (contMediaGeral/n));


    }
}