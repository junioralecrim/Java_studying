package org.example;

public class  Acoes{

    private static int num, result;

    public static void soma(int num) {
        setResult((getNum()) + num);
    }

    public static void soma(int num1, int num2) {
        setResult(num1 + num2);
    }

    public static void subtracao(int num) {
        setResult(getNum() + num);
    }

    public static void subtracao(int num1, int num2) {
        setResult(num1 - num2);
    }


    public static void multiplicacao() {

    }

    public static void divisao() {

    }


    public static void potencia() {

    }

    public static int getNum() {
        return num;
    }

    public static void setNum(int num) {
        Acoes.num = num;
    }

    public static int getResult() {
        return result;
    }

    public static void setResult(int result) {
        Acoes.result = result;
    }
}
