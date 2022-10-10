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
                "0 - Sair do sistema \n");
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
                    contaPessoa.abrirConta(nome, tipo, cpf, senha);
                    break;

                case 2:
                    contaPessoa.fecharConta();
                    break;

                case 3:
                    System.out.print("Digite o valor do depósito: ");
                    float valorDep = in.nextFloat();
                    contaPessoa.depositar(valorDep);
                    break;

                case 4:
                    System.out.println("Digite o valor do saque: ");
                    float valorSaque = in.nextFloat();
                    contaPessoa.sacar(valorSaque);
                    break;

                case 5:
                    contaPessoa.pagarMensalidade();
                    break;


                default:
                    System.out.println("\nDIGITE ALGUMA OPÇÃO VÁLIDA");

            }
            System.out.println(
                    "\n1 - Abrir conta\n" +
                            "2 - Fechar conta\n" +
                            "3 - Depositar\n" +
                            "4 - Sacar\n" +
                            "5 - Pagar Mensalidade\n" +
                            "0 - Sair do sistema \n");
            opcao = in.nextInt();
        }


    }
}
