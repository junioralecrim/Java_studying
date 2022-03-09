import java.util.Scanner;
 
/**
 * App
 */
public class Q10{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /*declarando variáveis para calcular as raízes da equação do segundo grau*/
        double a = 0, b = 0, c = 0, delta = 0, x1 = 0, x2 = 0;

        System.out.println("------- CÁLCULO DAS RAÍZES DA EQUAÇÃO DO SEGUNDO GRAU -------");
        System.out.println("\nFormato da equação: ax^2 + bx + c");
        System.out.printf("\nDigite o A da equação: ");
        a = in.nextFloat();
        System.out.printf("\nDigite o B da equação: ");
        b = in.nextFloat();
        System.out.printf("\nDigite o C da equação: ");
        c = in.nextFloat();

        if (a == 0){
            System.out.println("Não existe raíz real, pois o A não pode ser igual a 0.");
        } else {

            delta = ((b*b) - (4*a*c));
            x1 = (-b + Math.sqrt(delta))/2*a;
            x2 = (-b - Math.sqrt(delta))/2*a;

            if(delta < 0){
                System.out.println("Não existe raíz real, pois do Delta deu um valor negativo.");

            }
            if (delta == 0){
                System.out.println("Apenas uma raíz real: " + x1);
            }

            if (delta > 0){
                System.out.println("Existem duas raízes reais\n1° RAÍZ: " + x1 + "\n2° RAÍZ: " + x2);
            }

            }

        }
    }
 
   


