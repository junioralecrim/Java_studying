import java.util.Scanner;

public class Q1 {

    static float imc(float peso, float altura) {
        float result = 0;
        result = peso/(altura*altura);
        return result;
    }

    static double pesoIdeal(double altura, String sexo){
        double result = 0;

        if(sexo == "h"){
            result = (72.7*altura) - 58;
        } else {
            result = (62.1*altura) - 44.7;
        }

        return result;

    }


    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        float peso = 0, altura = 0;
        String sexo;

        System.out.println("Digite o seu peso (em KG): ");
        peso = in.nextFloat();

        System.out.println("Digite a sua altura (em Metros): ");
        altura = in.nextFloat();


        System.out.println("A o seu IMC é: " + imc(peso,altura));

        System.out.println("Digite o seu sexo (h/m): ");
        sexo = in.next();

        System.out.println("A o seu peso ideal é: " + pesoIdeal(altura,sexo));

    }
}
