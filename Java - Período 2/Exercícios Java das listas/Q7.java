import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float somaQuad = 0, aux = 10, quadSoma = 0;

        while(aux > 0){
        somaQuad += aux*aux;
        
        quadSoma += +aux;

        if(aux == 1){
            quadSoma = quadSoma*quadSoma;
        }  
        aux = aux - 1;

        }

        System.out.println(quadSoma - somaQuad);

    }
}
