import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String sexo, opcao;
        int idade, opcaoCorCabelo, homensEscolhidos = 0, mulheresEscolhidas = 0;

        do {
            System.out.print("===========================\n     SELETOR DE PESSOAS    \n===========================\nQual o sexo? [M/F] ");
            sexo = in.next().toUpperCase();
            System.out.println("Qual a idade? ");
            idade = in.nextInt();
            System.out.println("Qual a cor do cabelo?\n-----------------------\n[1] Preto\n[2] Castanho\n[3] Loiro\n[4] Ruivo\n");
            opcaoCorCabelo = in.nextInt();
            System.out.println("DESEJA CONTINUAR? [S/N] ");
            opcao = in.next().toUpperCase();

            if(sexo.equals("M")){
                if (idade > 18){
                    if (opcaoCorCabelo == 2){
                        homensEscolhidos += 1;
                    }
                }
            }

            if(sexo.equals("F")){
                if (idade > 25 && idade < 30){
                    if (opcaoCorCabelo == 3){
                        mulheresEscolhidas += 1;
                    }
                }
            }
        } while (opcao.equals("S"));

        System.out.println("\nHomens, com mais de 18 e cabelo castanho: " + homensEscolhidos + "\nMulheres, com idade entre 25 e 30 e loiras: " + mulheresEscolhidas);

    }
}