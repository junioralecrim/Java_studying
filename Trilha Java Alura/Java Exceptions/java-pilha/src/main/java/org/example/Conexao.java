package org.example;

public class Conexao {
    public Conexao() {
        System.out.println("Abrindo conexão");
    }

    public void leDados(){
        System.out.println("Recebendo dados");
        throw new IllegalStateException(); //estado inconsistente - unchecked
    }

    public void fecha(){
        System.out.println("Fechando conexão");
    }
}
