import org.apache.commons.lang3.StringUtils;

public class testApp {
    public static void main(String[] args) {
        String nome = "Francisco Junior Alecrim";

        /* Digamos que eu queira imprimir apenas as 5 primeiras letras do nome e precise de uma biblioteca
          terceira para isso.

          - Pra isso, vou usara a biblioteca Apache Commons Lang
            Vou abreviar o nome

          */

        System.out.println(nome);

        System.out.println(StringUtils.abbreviate(nome, 10));
    }
}
