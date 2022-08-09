import java.util.Scanner;

public class Q6 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double salario = 0, valPrestacao = 0, valorControle = 0;

        System.out.println("Digite o valor que você recebe: ");
        salario = in.nextFloat();

        System.out.println("Digite o valor da prestação que você deseja pagar: ");
        valPrestacao = in.nextFloat();

        valorControle = salario*0.2;

        if(valPrestacao > valorControle){
            System.out.println("Empréstimo não concedido.");
        } else {
            System.out.println("Empréstimo condedido.");
        }


    }
}
