public abstract class PagarMensal extends DefineConta{
    public void pagarMensalidade(){
        if (isStatus()){
            if (getSaldo() > 0){
                if (getTipo().equals("cc")){
                    if (getSaldo() >= 12){
                        setSaldo(getSaldo() - 12);
                        System.out.println("MENSALIDADE DE R$ 12.00 PAGA COM SUCESSO");
                    } else {
                        System.out.println("SALDO INSUFICIENTE PARA PAGAR A MENSALIDADE. POR FAVOR, FAÇA O DEPÓSITO NA CONTA.\nSALDO = R$" + getSaldo());
                    }
                } if (getTipo().equals("cp")){
                    if (getSaldo() >= 20){
                        setSaldo(getSaldo() - 20);
                        System.out.println("MENSALIDADE DE R$ 20.00 PAGA COM SUCESSO");
                    } else {
                        System.out.println("SALDO INSUFICIENTE PARA PAGAR A MENSALIDADE. POR FAVOR, FAÇA O DEPÓSITO NA CONTA.\nSALDO = R$" + getSaldo());
                    }
                }
            } else {
                System.out.println("VOCÊ ESTÁ SEM SALDO");
            }
        } else {
            System.out.println("OPS! VOCÊ AINDA NÃO ABRIU UMA CONTA!");
        }
    }
}
