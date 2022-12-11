package org.example;

public class PessoaFisica extends Pessoa{

    private String cpf;


    public PessoaFisica(int id, String nome) {
        super(id);
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}
