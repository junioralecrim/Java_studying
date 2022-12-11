package org.example;

public class Pessoa {
    private int id;
    protected String nome;

    Departamento departamento;

    public Pessoa(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
