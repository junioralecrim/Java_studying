/*Sistema de distribuição ótima, caixa eletrônico*/

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int valRecebido = 0, valSolicitado = 0, aux = 0, i = 0, cedCinquenta = 0, cedDez = 0, cedCinco = 0, cedUm = 0, quantCed = 0;

        System.out.println("Digite o valor que você deseja sacar: ");
        valRecebido = in.nextInt();
        valSolicitado = valRecebido;

        while (valRecebido > 0) {

            if(valRecebido >= 50){
                valRecebido = valRecebido - 50;
                cedCinquenta += 1; 
            }

            if((valRecebido >= 10) && (valRecebido < 50)){
                valRecebido = valRecebido - 10;
                cedDez += 1;
            }

            if((valRecebido >= 5) && (valRecebido < 10 )){
                valRecebido = valRecebido - 5;
                cedCinco += 1;
            }

            if(valRecebido < 5){
                valRecebido = valRecebido - 1;
                cedUm += 1;    
            }
        }
        quantCed = cedUm + cedDez + cedCinquenta + cedCinco;

        System.out.println("\nValor solicitado: R$" + valSolicitado + "\n\nCédulas de R$ 50,00: " + cedCinquenta + "\nCédulas de R$10,00: " + cedDez + "\nCédulas de R$5,00: " + cedCinco + "\nCédulas de R$1,00: " + cedUm + "\n\nQuantidade de Cédulas retiradas: " + quantCed);

    }
}
