package controller;

import java.util.Scanner;

public class Decisions {

    Connection connection = new Connection();
    Scanner in = new Scanner(System.in);
    private String decisao;
    public int ponts;

    public boolean venceu;

    public void decisaoContinuarJogo() {
        connection.texts.getTextIntroducao();
        decisao = in.next();
        if(decisao.equalsIgnoreCase("s")){
            connection.texts.getTextP1();
            decisao = in.next();
            perguntaQ1Resut(decisao);
        } else {
            connection.texts.getTextNegacao();
            System.out.println("\n");
            connection.texts.getTextP1();
            decisao = in.next();
            perguntaQ1Resut(decisao);
        }
    }


    public void perguntaQ1Resut(String decisao) {
        if(decisao.equalsIgnoreCase("a")){
            this.ponts += 1;
            perguntaQ2();
        } else {
            perguntaQ2();
        }
    }

    public void perguntaQ2() {
        connection.texts.getTextP2();
        decisao = in.next();
        if(decisao.equalsIgnoreCase("b")){
            this.ponts += 1;
            perguntaQ3();
        } else {
            perguntaQ3();
        }
    }

    public void perguntaQ3(){
        connection.texts.getTextP3();
        decisao = in.next();
        if (decisao.equalsIgnoreCase("c")){
            this.ponts += 1;
            getPonts();
        }
    }

    public void getPonts(){
        if (ponts == 3){
            venceu = true;
        } else {
            System.out.println("Triste. Cê fez " + ponts + " pontos. Mas tenta dnv até acertar! Vou reiniciar as perguntas. Bo bo <3\n");
            connection.texts.getReinicioAposErro();
            decisao = in.next();
            perguntaQ1Resut(decisao);
        }
    }

    public boolean isVenceu() {
        return venceu;
    }

    public String getDecisao() {
        return decisao;
    }

    public void setDecisao(String decisao) {
        this.decisao = decisao;
    }
}
