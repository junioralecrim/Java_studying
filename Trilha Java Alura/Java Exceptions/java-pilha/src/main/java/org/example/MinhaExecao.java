package org.example;

public class MinhaExecao extends Exception{ //categoria checked é verificada pelo compilador

    //A UNCHECKED não é verificada pelo compilador (extendido diretamente de RuntimeException e não de exception, como a MinhaExcecao)
    public MinhaExecao(String msg){
        super(msg);
    }
}
