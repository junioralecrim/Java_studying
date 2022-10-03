import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String gabarito[] = new String[5];
        int mediaGeral = 0;

        System.out.println("============================ CADASTRO GABARITO ============================");
        for (int i = 0; i < 5; i ++){
            System.out.print("QUESTÃO " + (i+1) + "- ");
            gabarito[i] = in.next();

        }
        System.out.println("DESEJA VERIFICAR O GABARITO DE QUANTOS ALUNOS? ");
        int n = in.nextInt();

        String alunoNome[] = new String[n];
        int alunoMedia[] = new int[n];

        for (int i = 0; i < n; i++){
            System.out.println("Aluno " + (i+1) + "\n---------------------------\nNome: ");
            alunoNome[i] = in.next();
            int contAcertos = 0;

            for (int j = 0; j < 5; j++){
                System.out.print("Q" + (j+1) + "- ");
                String questao = in.next();
                if (questao.equals(gabarito[j])){
                    contAcertos += 2;
                }
            }
            alunoMedia[i] = contAcertos;
            mediaGeral += contAcertos;
        }

        for (int i = 0; i < n; i++){
            System.out.println("\nNOME: " +alunoNome[i]+ "\nNOTA TOTAL: " + alunoMedia[i]);
        }
        System.out.println("MEDIA GERAL: " + (mediaGeral/n));


    }
}