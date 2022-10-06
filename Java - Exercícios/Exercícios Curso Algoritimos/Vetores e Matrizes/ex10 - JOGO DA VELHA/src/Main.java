import java.util.Scanner;

public class Main {

    public static boolean velhaVerify(String[][] matrizVelha){//verifica se deu velha após toda a matriz ser preenchida
        boolean velha = false;
        int contVerify = 0;
        for (int linha = 0; linha < 3; linha++) {
            for (int coluna = 0; coluna < 3; coluna++) {
                if (matrizVelha[linha][coluna].toLowerCase().equals("x") || matrizVelha[linha][coluna].toLowerCase().equals("o")){
                    contVerify += 1;
                }
                if (contVerify == 9){
                    velha = true;
                }
            }
        }

        return velha;
    }

    public static int[] limparVals(int[] vals){//limpa o vetor que contabiliza os x e o
        if (vals[0] < 3){
            vals[0] = 0;
        }
        if(vals[1] < 3){
            vals[1] = 0;
        }
        return vals = vals;
    }


    public static boolean vitoryResult(int[] valsContResult, String[][] matrizVelha){
        boolean vitoria = false;
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

        return vitoria;
    }

    public static int[] resultCount(String[][] matrizVelha){ /*roda toda a matriz diversas vezes procurando combinações de 3 na horizontal,
        vertical e diagonais*/
        int vals[] = new int[2];

        //count horizonatal
        for (int linha = 0; linha < 3; linha++){
            if (vals[0] == 3 || vals[1] == 3){
                break;

            } else {
                limparVals(vals);
                for (int coluna = 0; coluna < 3; coluna++){
                    if (matrizVelha[linha][coluna].toLowerCase().equals("x")){
                        vals[0] += 1;
                    } else if (matrizVelha[linha][coluna].toLowerCase().equals("o")) {
                        vals[1] += 1;
                    }
                }
            }
        }

        vals = limparVals(vals);
        //count vertical

        for (int linha = 0; linha < 3; linha++){

            if (vals[0] == 3 || vals[1] == 3){
                break;

            } else {
                limparVals(vals);
                for (int coluna = 0; coluna < 3; coluna++){
                    if (matrizVelha[coluna][linha].toLowerCase().equals("x")){
                        vals[0] += 1;
                    } else if (matrizVelha[coluna][linha].toLowerCase().equals("o")) {
                        vals[1] += 1;
                    }
                }
            }
        }

        //count diagonal à direita e à esquerda
        //diagonal da esquerda para direita
        vals = limparVals(vals);

        for (int linha = 0; linha < 3; linha++){
            if (vals[0] == 3 || vals[1] == 3){
                break;

            } else {

                for (int coluna = 0; coluna < 3; coluna++){
                if (linha == coluna){
                    if (matrizVelha[linha][coluna].toLowerCase().equals("x")){
                        vals[0] += 1;
                    } else if (matrizVelha[linha][coluna].toLowerCase().equals("o")) {
                        vals[1] += 1;
                        }
                    }
                }
            }
        }


        vals = limparVals(vals);
        int linha = 0, coluna = 2;
        //diagonal da direita para esquerda
        while (coluna >= 0) {
            if (vals[0] == 3 || vals[1] == 3){
                break;

            } else {

                if (matrizVelha[linha][coluna].toLowerCase().equals("x")){
                    vals[0] += 1;
                } else if (matrizVelha[linha][coluna].toLowerCase().equals("o")) {
                    vals[1] += 1;
                }
            }

            linha += 1;
            coluna -= 1;
        }

        return vals;
    }

    public static String[][] play(String simbolo, String[][] matrizVelha, String coordenada){//adicionar o simbolo x ou o na matriz
        for (int linha = 0; linha < 3; linha++){
            for (int coluna = 0; coluna < 3; coluna++){
                if (simbolo.toLowerCase().equals("x")){
                    if (matrizVelha[linha][coluna].equals(coordenada)){
                        matrizVelha[linha][coluna] = "x";
                        break;
                    } else {

                    }
                }

                if (simbolo.toLowerCase().equals("o")){
                    if (matrizVelha[linha][coluna].equals(coordenada)){
                        matrizVelha[linha][coluna] = "o";
                        break;
                    }
                }
            }
        }
        return matrizVelha;
    }

    public static boolean playVerify(String[][] matrizVelha, String coordenada){ //verificar se a jogada é válida
        boolean validMove = false;

        for (int linha = 0; linha < 3; linha++){
            for (int coluna = 0; coluna < 3; coluna++){
                if (matrizVelha[linha][coluna].equals(coordenada)){
                    validMove = true;
                }
            }
        }

        return validMove;
    }

    public static void printStatus(String[][] matrizVelha){//printar status do jogo
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
        String x, o;
        int valsContResult[] = new int[2];
        String matrizVelha[][] = {{"1", "2", "3"}, {"4", "5", "6"}, {"7", "8", "9"}};

        boolean vitoria = false;


        do {//do while para rodar o código até ter um vencedor no jogo
            boolean validPlay;
            //do while responsável por verificar se a jogada é válida e deixar o jogo prosseguir para o prox player
            do {
                printStatus(matrizVelha);
                System.out.println("=========================");
                System.out.println("ONDE QUER COLOCAR O X?");
                x = in.next();
                validPlay = playVerify(matrizVelha, x);
                if (validPlay == false) {
                    System.out.println("\nERRO: JOGADA INVÁLIDA!");
                } else {
                    matrizVelha = play("x", matrizVelha, x);
                    valsContResult = resultCount(matrizVelha);
                }
            } while (validPlay == false);

            if (vitoryResult(valsContResult, matrizVelha) == true) {
                break;
            } else if (velhaVerify(matrizVelha) == true){
                System.out.println("###################### DEU VELHA :) ######################");
                break;

            }

            do {
                printStatus(matrizVelha);
                System.out.println("=========================");
                System.out.println("ONDE QUER COLOCAR O O?");
                o = in.next();
                validPlay = playVerify(matrizVelha, o);
                if (validPlay == false) {
                    System.out.println("\nERRO: JOGADA INVÁLIDA!");
                } else {
                    matrizVelha = play("o", matrizVelha, o);
                    valsContResult = resultCount(matrizVelha);
                }
            } while (validPlay == false);


            if (vitoryResult(valsContResult, matrizVelha) == true) {
                break;
            } else if (velhaVerify(matrizVelha) == true){
                System.out.println("###################### DEU VELHA :) ######################");
                break;
            }

        } while (vitoria == false);//redundante. verificar melhorias...

    }
}

