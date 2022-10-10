import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = 0, somaNum = 0, mediaNum = 0, divFivNum = 0, qtNullNum = 0, qtParNum = 0;

        for (int i = 0; i < 5; i++){
            System.out.println((1+i) + "° valor");
            num = in.nextInt();
            somaNum += num;

            if (i == 4){
                mediaNum = somaNum/5;
            }
            if (num%5 == 0){
                divFivNum += 1;
            }
            if (num == 0){
                qtNullNum += 1;
            }
            if (num%2 == 0){
                qtParNum += 1;
            }
        }

        System.out.println("Soma dos valores: " + somaNum + "\nMédia dos números: " + mediaNum + "\nQuantidade de números divisíveis por 5: " + divFivNum + "" +
                "\nQuantidade de números nulos: " + qtNullNum + "\nQuantidade de números pares: " + qtParNum);
    }
}