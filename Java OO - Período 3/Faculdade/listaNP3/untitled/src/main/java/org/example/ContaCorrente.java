package org.example;

public class ContaCorrente implements OperacoesBancarias{
    private Double montante = 0.0;

    @Override
    public void depositar(Double quantia) {
        setMontante(saldo() + quantia);
    }

    @Override
    public void sacar(Double quantia) {
        if (quantia <= montante){
            setMontante((saldo() - quantia) - quantia*0.05);
        } else {
            System.out.println("QUANTIA INSUFICIENTE");
        }
    }

    @Override
    public Double saldo() {
        return montante;
    }

    public ContaCorrente(Double montante) {
        this.montante = montante;
    }

    public ContaCorrente(){
    }

    public void setMontante(Double montante) {
        this.montante = montante;
    }
}
