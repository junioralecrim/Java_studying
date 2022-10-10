import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0, contPrim = 0, aux = 0;
        String result = "não é primo";
        System.out.println("Digite o número que vc quer saber se é ou não primo: ");
        num = in.nextInt();

        do {
            aux += +1;
            if (num%aux == 0){
                contPrim += +1;
            }
        } while (aux < num);


        if (contPrim == 2){
            result = "é primo";
        }


        System.out.println("O número " + num + " é divisível por " + contPrim + " números.\n\n" + result);
    }
}