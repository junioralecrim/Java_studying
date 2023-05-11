package org.example.model;

import java.util.Random;

public class ContaCorrente {
    private long numero;
    private double saldo = 0.00;
    private Cliente cliente;
    private Banco banco;

    public ContaCorrente(Cliente cliente, Banco banco) {
        this.cliente = cliente;
        this.banco = banco;
        Random r = new Random(1000);
        this.numero = Math.abs(r.nextLong()); //quero apenas valores positivos
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Banco getBanco() {
        return banco;
    }

    public long getNumero() {
        return numero;
    }
}
