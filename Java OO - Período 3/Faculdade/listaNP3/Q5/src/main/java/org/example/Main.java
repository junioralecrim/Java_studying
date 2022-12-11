package org.example;

public class Main {
    public static void main(String[] args) {

    Departamento departamento = new Departamento(1);
    PessoaFisica pessoaFisica = new PessoaFisica(2, "Danigay");
    
    departamento.setPessoas(pessoaFisica);

    departamento.mostrarPessoas();
    }
}