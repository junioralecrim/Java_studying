package org.example;

public class Main {
    public static void main(String[] args) {
        double valorTotal = 1000.0;
        double entrada = 300.0;
        int parcelas = 5;

        try{ //"vou tentar fazer algo"
            Financiamento financiamento = new Financiamento(valorTotal, entrada, parcelas);
            System.out.println(financiamento.prestacao());
        } catch (RuntimeException e){ //caso eu não consiga, vou capturar a excessão e atribuíla a uma variavel e
            System.out.println(e.getMessage()); /*com isso, vou capturar a mensagem escrita no RuntimeException

            */
        }

    }
}