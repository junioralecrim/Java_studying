package controller;

import java.util.Scanner;

public class ToSend {
    Decisions decisions = new Decisions();
    Scanner in = new Scanner(System.in);
    private String decisao;
    public void iniciarJogo(){
        decisions.decisaoContinuarJogo();
        try {
            if (decisions.isVenceu()){
                ativarEnvio();
            }
        } catch (InterruptedException exception){
            System.out.println("Exception erro: " + exception);
        }
    }

    public void ativarEnvio() throws InterruptedException {
        decisions.connection.texts.textVenceu();
        decisao = in.next();
        if (decisao.equalsIgnoreCase("c")){
            decisions.connection.texts.retornoTextosMensagemSleep();
        }
    }
}
