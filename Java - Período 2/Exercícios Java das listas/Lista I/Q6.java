import java.util.Scanner;
 
/**
 * App
 */
public class Q6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
                /* declarando variáveis para calcular a área de um circulo */
        double num = 0, quad = 0, raiz = 0;
 
        System.out.print("Digite um número positivo para obter o seu quadrado e raíz: ");
        num = in.nextFloat();
 
        if (num > 0){
            quad = num*num;
            raiz = Math.sqrt(num);



        } else {
            System.out.print("O número digitado não é positivo.");
        }
 
/*        System.out.println("\nO número digitado foi " + num + ", o seu quadrado é " + quad + " e sua raíz é " + raiz);
*/
System.out.printf("\nO número digitado foi " + num + " o seu quadrado é " + quad + " e sua raíz é %.2f", raiz);
 
    }
 
   
}
