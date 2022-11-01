package org.example;

public class Contador {
    private static int count;


    public Contador() {
        setCount(getCount() + 1);
    }

    public void zerarContador(){
        setCount(0);
    }

    public void incremetCount(){
        setCount(getCount() + 1);
    }

    public int retornarValorCount(){
        return getCount();
    }

    private static int getCount() {
        return count;
    }

    private static void setCount(int count) {
        Contador.count = count;
    }
}
