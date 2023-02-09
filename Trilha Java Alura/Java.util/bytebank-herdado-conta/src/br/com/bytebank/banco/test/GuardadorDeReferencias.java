package br.com.bytebank.banco.test;

public class GuardadorDeReferencias {
    int quantReferencias;
    int refAtual = 0;
    Object[] objects;

    public GuardadorDeReferencias(int quantReferencias) {
        this.quantReferencias = quantReferencias;
        objects = new Object[quantReferencias];
    }

    public void adicionarReferencia(Object ref){
        objects[getRefAtual()] = ref;
        refAtual++;
    }

    public int getRefAtual() {
        return refAtual;
    }

    public Object getObjects(int ref) {
        return objects[ref];
    }
}

