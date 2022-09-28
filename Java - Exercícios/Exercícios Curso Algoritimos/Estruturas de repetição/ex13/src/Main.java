import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int contRange = 0, contImpares = 0;

        for (int i = 0; i < 6; i++){
            System.out.println("Digite o " + (i+1) + "° número: ");
            int num = in.nextInt();
            if (num >= 0 && num <= 10){
                contRange += 1;
                if (num%2 != 0){
                    contImpares += num;
                }
            }
        }

        System.out.println("================================================\nQuantidade de números digitados que estão entre 0 e 10: " + contRange + "" +
                "\nSoma dos números ímpares: " + contImpares + "\n\"================================================");
    }
}