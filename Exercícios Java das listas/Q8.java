import java.util.Scanner;

public class Q8 {


    static long fatorial(long a){
        if (a==0){
            return 1;
        } else {
            return a * fatorial(a-1);
        }
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long n = 0, result = 0;

        System.out.println("Digite um número qualquer para obter o resultado de seu fatorial: ");
        n = in.nextInt();
        
        result = fatorial(n);

        System.out.println(result);
    }
}
