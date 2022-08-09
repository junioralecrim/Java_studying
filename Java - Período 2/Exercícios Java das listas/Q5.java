import java.util.Scanner;

public class Q5 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        double altura = 0, pesoIdeal = 0;
        String sexo;

        System.out.println("Digite a sua altura: ");
        altura = in.nextDouble();

        System.out.println("Digite o seu sexo (h/m): ");
        sexo = in.next();
        
        
        if(sexo == "h"){
            pesoIdeal = ((72.7*altura) - 58);
            System.out.println("O seu peso ideal é: " + pesoIdeal);
            
        }else{
                pesoIdeal = ((62.1*altura) - 44.7);
                System.out.println("O seu peso ideal é: " + pesoIdeal);
            }


    }
}
