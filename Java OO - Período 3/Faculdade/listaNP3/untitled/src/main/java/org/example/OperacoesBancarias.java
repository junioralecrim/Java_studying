package org.example;

public interface OperacoesBancarias {
    abstract void depositar(Double quantia);
    abstract void sacar(Double quantia);
    abstract Double saldo();
}
