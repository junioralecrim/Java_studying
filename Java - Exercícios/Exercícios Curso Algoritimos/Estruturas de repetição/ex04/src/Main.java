import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String nomeAluno, melhorAluno = "";
        int notaAluno, maiorNotaAluno = 0;

        System.out.println("--------------------- ESCOLA SANTA MARIA ---------------------\n");
        System.out.println("Digite quantos alunos você deseja cadastrar: ");
        int quantAlunos = in.nextInt();

        for (int i = 0; i < quantAlunos; i++){
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.println("Nome aluno: ");
            nomeAluno = in.next();

            System.out.println("Nota: ");
            notaAluno = in.nextInt();
            if (maiorNotaAluno < notaAluno){
                melhorAluno = nomeAluno;
                maiorNotaAluno = notaAluno;
            }
        }

        System.out.println("========================= MELHOR ALUNO =========================\nNome: " + melhorAluno + "\nNota: " + maiorNotaAluno);
    }
}
