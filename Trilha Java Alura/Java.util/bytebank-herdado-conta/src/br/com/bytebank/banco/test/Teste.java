package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class Teste {
    public static void main(String[] args) {
        TesteContas testeContas = new TesteContas();
        TesteSaca testeSaca = new TesteSaca();
        ContaCorrente contaCorrente = new ContaCorrente(11, 10);

        GuardadorDeReferencias refs = new GuardadorDeReferencias(3);

        refs.adicionarReferencia(testeSaca);
        refs.adicionarReferencia(testeContas);
        refs.adicionarReferencia(contaCorrente);

        System.out.println(refs.getRefAtual());
        System.out.println(refs.getObjects(2));

    }
}
