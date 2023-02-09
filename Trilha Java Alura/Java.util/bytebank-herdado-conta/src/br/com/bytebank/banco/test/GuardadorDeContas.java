package br.com.bytebank.banco.test;
import br.com.bytebank.banco.modelo.Conta;

public class GuardadorDeContas {
    private int posicaoLivre;
    private Conta[] referencias;


    public GuardadorDeContas() {
        this.referencias = new Conta[10];
        this.posicaoLivre = 0;
    }

    public void adicionar(Conta ref){
        referencias[posicaoLivre] = ref;
        posicaoLivre++;
    }

    public int getQuantidadeDeElementos(){
        return referencias.length;
    }


}
