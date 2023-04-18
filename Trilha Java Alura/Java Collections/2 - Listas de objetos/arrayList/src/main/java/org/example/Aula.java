package org.example;

public class Aula implements Comparable<Aula>{ //preciso dizer com oq é comparável
    private String titulo;
    private int tempo;

    public Aula(String titulo, int tempo) {
        this.titulo = titulo;
        this.tempo = tempo;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getTempo() {
        return tempo;
    }

    @Override
    public int compareTo(Aula outraAula) { //Eu vou comparar uma aula com outra
        return this.titulo.compareTo(outraAula.titulo); //por meio do atributo de título
    }
}
