import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Conta contaPessoa = new Conta();
        Scanner in = new Scanner(System.in);

        System.out.println("--- BEM VINDO A CONTA FACIL ---\nDigite e confirme a opção que deseja seguir:\n" +
                "1 - Abrir conta\n" +
                "2 - Fechar conta\n" +
                "3 - Depositar\n" +
                "4 - Sacar\n" +
                "5 - Pagar Mensalidade\n" +
                "0 - Sair do sistema ");
        int opcao = in.nextInt();

        switch (opcao) {

            case 1:
            System.out.println("Seu nome: ");
            String nome = in.next();
            System.out.println("CPF: ");
            int cpf = in.nextInt();
            System.out.println("Agora, digite uma senha de 4 dígitos: ");
            int senha = in.nextInt();
            contaPessoa.abrirConta(nome, cpf, senha);
                break;

            case 2:
            System.out.println("Ainda em desenvolvimento...");

                break;

            case 3:
            System.out.println("Ainda em desenvolvimento...");

                break;

            case 4:
            System.out.println("Ainda em desenvolvimento...");

                break;

            case 5:
            System.out.println("Ainda em desenvolvimento...");

                break;

            case 0:
            System.out.println("Ainda em desenvolvimento...");
                break;



            default:
            System.out.println("Ainda em desenvolvimento...");

        }
    }
}