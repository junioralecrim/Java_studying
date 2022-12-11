package org.example;

public class Main {
    public static void main(String[] args) {
        ContaCorrente contaCorrente = new ContaCorrente();

        contaCorrente.depositar(10000.00);
        contaCorrente.sacar(1000.00);
        System.out.println(contaCorrente.saldo());

        ContaCorrenteEspecial contaCorrenteEspecial = new ContaCorrenteEspecial();

        contaCorrenteEspecial.depositar(10000.0);
        contaCorrenteEspecial.sacar(1000.0);

        System.out.println(contaCorrenteEspecial.saldo());

    }
}