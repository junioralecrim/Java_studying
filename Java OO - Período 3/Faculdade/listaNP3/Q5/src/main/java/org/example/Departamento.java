package org.example;
import java.util.ArrayList;

public class Departamento {
    private int id;
    public String descricao;
    ArrayList<Pessoa> pessoas = new ArrayList<>();

    public Departamento(int id) {
        this.id = id;
    }

    protected int getId() {
        return id;
    }

    public void setPessoas(Pessoa p) {
        this.pessoas.add(p);
    }

    public void  mostrarPessoas(){
        for (Pessoa p:pessoas
             ) {
            System.out.println(p.nome);
        }
    }
}
