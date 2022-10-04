public class Main {

    public static int increment(String[][] matrizVelha){
        int contX = 0, contO = 0;

        for (int linha = 0; linha < 3; linha++){
            for (int coluna = 0; coluna < 3; coluna++){
                if (matrizVelha[linha][coluna].equals("x")){
                    return contX += 1;
                } else if (matrizVelha[linha][coluna].equals("o")) {
                    return contO += 1;
                }
            }
        }
    }

    public static void main(String[] args) {
        String matrizVelha[][] = {{"1", "2", "3"}, {"4", "5", "6"}, {"7", "8", "9"}};
        int contX = 0, contO = 0;
        boolean result = false;
        System.out.println("+---+---+---+\n" +
                           "|  1|  2|  3|\n" +
                           "+---+---+---+\n" +
                           "|  4|  5|  6|\n" +
                           "+---+---+---+\n" +
                           "|  7|  8|  9|\n" +
                           "+---+---+---+");

        do {
            for (int linha = 0; linha < 3; linha++){
                for (int coluna = 0; coluna < 3; coluna++){
                }
            }
        } while (result = false);

    }
}

