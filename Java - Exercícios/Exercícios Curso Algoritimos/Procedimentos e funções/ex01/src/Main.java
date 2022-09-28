import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {

    public static void soma(int a, int b){
        System.out.println("Valor A recebido: " + a + "\nValor B recebido: " + b + "\nSoma dos dois valores: " + (a+b));
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite o primeiro valor: ");
        int a = in.nextInt();
        System.out.println("Digite o segundo valor: ");
        int b = in.nextInt();
        soma(a, b);


    }
}