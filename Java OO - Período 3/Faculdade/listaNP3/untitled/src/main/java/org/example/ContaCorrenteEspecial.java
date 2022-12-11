package org.example;

public class ContaCorrenteEspecial extends ContaCorrente{
    public ContaCorrenteEspecial(Double montante) {
        super(montante);
    }

    public ContaCorrenteEspecial() {
    }

    public void sacar(Double quantia){
        if (quantia <= saldo()){
            setMontante((saldo() - quantia) - quantia*0.01);
        } else {
            System.out.println("QUANTIA INSUFICIENTE");
        }
    }
}
