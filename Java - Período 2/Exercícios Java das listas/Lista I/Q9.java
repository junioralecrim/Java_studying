import java.util.Scanner;

public class Q9 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double salario = 0, prestacaoEmprestimo = 0, vintePorcentoSalario = 0;

        System.out.println("Digite o quanto você ganha ao mês: ");
        salario = in.nextFloat();

        System.out.println("Digite o quanto você quer pagar ao mês nas parcelas do seu empréstimo: ");
        prestacaoEmprestimo = in.nextFloat();

        vintePorcentoSalario = salario * 0.2;

        if (vintePorcentoSalario <= prestacaoEmprestimo){
            System.out.println("Empréstimo aprovado!");
            System.out.println("Valor de 20% do seu salário: " + vintePorcentoSalario + "\nValor da parcela que você quer pagar: " + prestacaoEmprestimo);
        } else {
            System.out.println("Empréstimo recusado!");
            System.out.println("\nValor de 20% do seu salário: " + vintePorcentoSalario + "\nValor da parcela que você quer pagar: " + prestacaoEmprestimo);
        }




    }
}
