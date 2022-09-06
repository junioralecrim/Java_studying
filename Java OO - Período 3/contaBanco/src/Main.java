import java.util.Scanner;

public class Main {

    public static void limparbuff(Scanner sca){
        if(sca.hasNextLine()) {
            sca.nextLine();
        }
    }
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
            System.out.print("Seu nome: ");
            String nome = in.nextLine();
            limparbuff(in);
            System.out.print("CPF: ");
            String cpf = in.next();
            System.out.print("Digite o tipo de conta que você deseja\nCC - Conta corrente\nCP - Conta poupança\n ");
            String tipo = in.next();
            System.out.print("Agora, digite uma senha de 4 dígitos: ");
            int senha = in.nextInt();
            contaPessoa.abrirConta(nome, tipo, cpf, senha);
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
