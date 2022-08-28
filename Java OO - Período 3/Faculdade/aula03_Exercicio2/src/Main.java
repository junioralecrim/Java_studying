import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    ControleTelevisao controleTv = new ControleTelevisao();
    System.out.println("1 - Ligar TV\n");
    int i = in.nextInt();

    while(i >= 1){
        System.out.println("" +
                "\n0 - Desligar TV\n" +
                "3 - Diminuir volume\n" +
                "4 - Aumentar Volume\n" +
                "5 - Trocar Canal -1\n" +
                "6 - Trocar Canal +1\n" +
                "7 - Especificar canal\n\n");
        i = in.nextInt();
        if (i == 3){
            controleTv.baixarVolume();
        }
        if (i == 4){
            controleTv.aumentarVolume();
        }
        if (i == 5){
            controleTv.mudarCanalBaixo();
        }
        if (i == 6){
            controleTv.mudarCanalCima();
        }
        if (i == 7){
            System.out.println("Digite o canal que você quer: ");
            int receberCanal = in.nextInt();
            controleTv.escolherCanal(receberCanal);
        }
    }

    }
}