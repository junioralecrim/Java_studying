import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int contNumPar = 0;

        System.out.println("Digite o número inicial: ");
        int numInicio = in.nextInt();

        System.out.println("Digite o número final: ");
        int numFinal = in.nextInt();
        if (numInicio < numFinal){
            for(int i = numInicio; i <= numFinal; i++){
                if (i%2 == 0){
                    contNumPar += 1;
                }
            }
        } else {
            for(int i = numInicio; i >= numFinal; i--){
                if (i%2 == 0){
                    contNumPar += 1;
                }
            }
        }


        System.out.println(contNumPar);
    }
}