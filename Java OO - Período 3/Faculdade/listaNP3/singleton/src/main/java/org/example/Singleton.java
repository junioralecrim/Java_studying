package org.example;

public class Singleton {

    private static Singleton instance;

    public static Singleton getInstance(){
        if (instance == null){
            instance = new Singleton();
        } else {
            System.out.println("Ja tem instancia");
        }

        return instance;
    }

}
