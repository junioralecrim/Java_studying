package org.example;

public class TesteContaComExcecaoChecked {
    public static void main(String[] args) {
        Conta c = new Conta();
        try {
            c.depositar();
        } catch (MinhaExecao execao){

        }

        /*
        * Quem usa um método que é do tipo exception checked, é obrigado a lidar com a exceção de alguma forma.
        * */
    }
}
