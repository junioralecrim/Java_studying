import java.util.Scanner;

public class Main {

    private static void clearBuffer(Scanner scanner) {
        if (scanner.hasNextLine()) {
            scanner.nextLine();
        }
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String melhorAluno = "";
        int notaAluno, maiorNotaAluno = 0;

        System.out.println("--------------------- ESCOLA SANTA MARIA ---------------------\n");
        System.out.println("Digite quantos alunos você deseja cadastrar: ");
        int quantAlunos = in.nextInt();

        for (int i = 0; i < quantAlunos; i++){
            System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
            System.out.print("Nome aluno: ");
            String nomeAluno = in.nextLine();

            clearBuffer(in);
            System.out.print("Nota: ");
            notaAluno = in.nextInt();
            if (maiorNotaAluno < notaAluno){
                melhorAluno = nomeAluno;
                maiorNotaAluno = notaAluno;
            }
        }

        System.out.println("========================= MELHOR ALUNO =========================\nNome: " + melhorAluno + "Nota: " + maiorNotaAluno);
        
    }
}
