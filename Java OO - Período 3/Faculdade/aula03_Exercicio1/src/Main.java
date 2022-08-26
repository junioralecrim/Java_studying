import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        Pessoa pessoa1 = new Pessoa();

        System.out.print("Digite seu nome: ");
        pessoa1.nome = in.next();

        System.out.print("Digite a sua altura: ");
        pessoa1.altura = in.nextInt();

        System.out.print("Digite ano que você nasceu: ");
        pessoa1.anoNascimento = in.nextInt();


        System.out.print("1 - Obter dados fornecidos\n2 - Obter sua idade\n");
        int opcao = in.nextInt();

        if (opcao == 1){
            pessoa1.imprimirDados();
        } else if (opcao == 2) {
            pessoa1.calcularIdade(pessoa1.anoNascimento);
        }

    }
}
