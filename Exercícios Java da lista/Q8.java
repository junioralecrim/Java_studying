import java.util.Scanner;

public class Q8{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double salarioHora = 0, horasMes = 0, salarioTotalBruto = 0, impostoRenda = 0, inss = 0, sindicato = 0, salarioTotalLiquido = 0;

        System.out.println("Digite o quanto você ganha por hora: ");
        salarioHora = in.nextFloat();

        System.out.println("Digite quantas horas por mês você trabalha: ");
        horasMes = in.nextFloat();

        salarioTotalBruto = horasMes * salarioHora;
        impostoRenda = salarioTotalBruto * 0.11;
        inss = salarioTotalBruto * 0.08;
        sindicato = salarioTotalBruto * 0.05;
        salarioTotalLiquido = salarioTotalBruto - (impostoRenda + inss + sindicato);       

        System.out.println("Salário total bruto: " + salarioTotalBruto + "\nDesconto do IR: " + impostoRenda + "\nDesconto INSS: " + inss + "\nDesconto Sindicato: " + sindicato + "\n\nSalário final (líquido): " + salarioTotalLiquido);


    }
}
