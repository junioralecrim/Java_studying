package org.example;

public class Financiamento {
    private double valorTotal;
    private double entrada;
    private int parcelas;


    public double prestacao(){
        return ((getValorTotal() - getEntrada())/getParcelas());
    }


    public Financiamento(double valorTotal, double entrada, int parcelas) {

        if (entrada < valorTotal * 0.2){
            throw new RuntimeException("A entrada deve ser pelo menos 20% do valor total");
        } else if (parcelas < 6) {
            throw new RuntimeException("O número mínimo de parcelas deve ser 6");
        }
        this.valorTotal = valorTotal;
        this.entrada = entrada;
        this.parcelas = parcelas;

    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public double getEntrada() {
        return entrada;
    }

    public void setEntrada(double entrada) {
        this.entrada = entrada;
    }

    public int getParcelas() {
        return parcelas;
    }

    public void setParcelas(int parcelas) {
        this.parcelas = parcelas;
    }
}
