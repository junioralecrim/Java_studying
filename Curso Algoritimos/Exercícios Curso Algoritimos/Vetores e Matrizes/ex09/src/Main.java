public class Main {
    public static void main(String[] args) {
        int m[][] = new int[4][4];
        int cont = 0, som = 0, prod = 1;

        for (int linha = 0; linha < 4; linha++){
            for (int coluna = 0; coluna < 4; coluna++) {
                cont += 1;

                if (linha == coluna){
                    m[linha][coluna] = cont;
                    som += m[linha][coluna];
                } else {
                    m[linha][coluna] = cont;
                }

                if (linha == 1){
                    prod *= cont;
                }
                System.out.print(m[linha][coluna] + " ");
            }
            System.out.println();
        }

        int maior = 0;
        for (int linha = 0; linha < 4; linha++){
            for (int coluna = 0; coluna < 4; coluna++) {
                if (coluna == 2){
                    if (m[linha][coluna] > maior){
                        maior = m[linha][coluna];
                    }
                }
            }
        }

        System.out.println("\nSoma da diagonal principal: " + som + "\nProduto da diagonal principal: " + prod + "\nMaior número da terceira coluna: " + maior);
    }
}