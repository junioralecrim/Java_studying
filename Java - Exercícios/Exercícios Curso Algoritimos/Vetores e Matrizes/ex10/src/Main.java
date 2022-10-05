import java.util.Scanner;

public class Main {

    public static int[] result(String[][] matrizVelha){
        int contX = 0, contO = 0;
        int vals[] = new int[2];
        for (int linha = 0; linha < 3; linha++){
            if (contX == 3 || contO == 3){
                break;
            } else {
                contX = 0;
                contO = 0;
                for (int coluna = 0; coluna < 3; coluna++){
                    if (matrizVelha[linha][coluna].toLowerCase().equals("x")){
                        contX += 1;
                        vals[0] = contX;
                    } else if (matrizVelha[linha][coluna].toLowerCase().equals("o")) {
                        contO += 1;
                        vals[1] = contO;
                    }
                }
            }
        }
        return vals;
    }

    public static String[][] play(String simbolo, String[][] matrizVelha, String coordenada){
        for (int linha = 0; linha < 3; linha++){
            for (int coluna = 0; coluna < 3; coluna++){
                if (simbolo.toLowerCase().equals("x")){
                    if (matrizVelha[linha][coluna].equals(coordenada)){
                        matrizVelha[linha][coluna] = "x";
                        break;
                    }
                } else if (simbolo.toLowerCase().equals("o")){
                    if (matrizVelha[linha][coluna].equals(coordenada)){
                        matrizVelha[linha][coluna] = "o";
                        break;
                    }
                }
            }
        }
        return matrizVelha;
    }

    public static void printStatus(String[][] matrizVelha){
        System.out.println("+---+---+---+\n" +
                "|  "+matrizVelha[0][0]+"|  "+matrizVelha[0][1]+"|  "+matrizVelha[0][2]+"|\n" +
                "+---+---+---+\n" +
                "|  "+matrizVelha[1][0]+"|  "+matrizVelha[1][1]+"|  "+matrizVelha[1][2]+"|\n" +
                "+---+---+---+\n" +
                "|  "+matrizVelha[2][0]+"|  "+matrizVelha[2][1]+"|  "+matrizVelha[2][2]+"|\n" +
                "+---+---+---+");
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int valsContResult[] = new int[2];
        String matrizVelha[][] = {{"1", "2", "3"}, {"4", "5", "6"}, {"7", "8", "9"}};

        boolean vitoria = false;
        int jogadorX, jogadorY;



        do {
            printStatus(matrizVelha);
            System.out.println("=========================");

            System.out.println("-- Teste de jogada e verificação -- ");
            System.out.println("ONDE QUER COLOCAR O X?");
            String x = in.next();
            matrizVelha = play("x", matrizVelha, x);
            valsContResult = result(matrizVelha);
            if (valsContResult[0] == 3){
                System.out.println("\n");
                printStatus(matrizVelha);
                System.out.println("=========================");
                System.out.println("VITÓRIA DO JOGADOR X!");
                vitoria = true;
            } else if (valsContResult[1] == 3) {
                System.out.println("\n");
                printStatus(matrizVelha);
                System.out.println("=========================");
                System.out.println("VITÓRIA DO JOGADOR O!");
                vitoria = true;
            }
        } while (vitoria != true);

    }
}

