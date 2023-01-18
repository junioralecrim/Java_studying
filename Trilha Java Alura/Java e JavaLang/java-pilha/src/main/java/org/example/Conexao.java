package org.example;

public class Conexao implements AutoCloseable{
    public Conexao() {
        System.out.println("Abrindo conexão");
        //throw new IllegalStateException(); //objeto nunca será criado se houver uma exception no construtor
    }

    public void leDados(){
        System.out.println("Recebendo dados");
        throw new IllegalStateException(); //estado inconsistente - unchecked
    }


    @Override
    public void close(){
        System.out.println("Fechando conexão");
    }
}
