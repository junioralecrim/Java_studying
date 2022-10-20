import java.util.Scanner;

public class Main {

    public static void opcoes(){
        System.out.println("1 - Abrir conta\n" +
                "2 - Fechar conta\n" +
                "3 - Depositar\n" +
                "4 - Sacar\n" +
                "5 - Pagar Mensalidade\n" +
                "0 - Sair do sistema \n");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Count count = new Count();


        System.out.println("--- BEM VINDO A CONTA FACIL ---\nDigite e confirme a opção que deseja seguir:\n");
        opcoes();
        int opcao = in.nextInt();

        while (opcao != 0) {
            switch (opcao) {
                case 1:
                    in.nextLine();
                    System.out.print("Seu nome: ");
                    String nome = in.nextLine();
                    System.out.print("\nCPF: ");
                    String cpf = in.next();
                    System.out.print("\nDigite o tipo de conta que você deseja\nCC - Conta corrente\nCP - Conta poupança\n ");
                    String tipo = in.next().toLowerCase();
                    System.out.print("Agora, digite uma senha de 4 dígitos: ");
                    int senha = in.nextInt();
                    count.abrirConta(nome, tipo, cpf, senha);
                    break;

                case 2:
                    count.fecharConta();
                    break;

                case 3:
                    System.out.print("Digite o valor do depósito: ");
                    float valorDep = in.nextFloat();
                    count.depositar(valorDep);
                    break;

                case 4:
                    System.out.println("Digite o valor do saque: ");
                    float valorSaque = in.nextFloat();
                    count.sacar(valorSaque);
                    break;

                case 5:
                    count.pagarMensalidade();
                    break;


                default:
                    System.out.println("\nDIGITE ALGUMA OPÇÃO VÁLIDA");

            }
            opcoes();
            opcao = in.nextInt();
        }


    }
}
