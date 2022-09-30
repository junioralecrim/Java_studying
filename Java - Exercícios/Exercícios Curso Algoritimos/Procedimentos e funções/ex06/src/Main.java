import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite seu nome: ");
        String nome = in.nextLine();

        System.out.println( "SEU NOME COM TODAS AS LETRAS MAIÚSCULAS: " + nome.toUpperCase() + "\n" +
                "SEU NOME COM TODAS AS LETRAS MINÚSCULAS: " + nome.toLowerCase() + "\n" +
                "QUANTIDADE DE LETRAS NO NOME: " + (nome.replace(" ", "").length()) + "\n" +
                "PRIMEIRA LETRA DO SEU NOME É: " + (nome.substring(0, 1)) + "\n" +
                "A ÚLTIMA LETRA DO SEU NOME É: " + (nome.substring((nome.length()-1), nome.length())) + "\n" +
                "SEU NOME TEM A LETRA 'A' NA POSIÇÃO: " + (nome.toLowerCase().indexOf("a"))
        );

        System.out.println("\n -------------- ESCREVENDO O NOME AO CONTRÁRIO --------------\n");

        for (int i = nome.length(); i > 0; i--){
            System.out.print(nome.substring(i -1, i));
        }
    }
}