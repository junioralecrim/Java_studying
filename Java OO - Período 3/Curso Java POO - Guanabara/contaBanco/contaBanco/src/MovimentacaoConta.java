public class MovimentacaoConta extends Conta{
    public void depositar(float valorDep){
        if (isStatus()){
            if (valorDep > 0.00){
                setSaldo(getSaldo() + valorDep) ;
                System.out.println("DEPÓSITO CONCLUÍDO!");
            } else {
                System.out.println("O VALOR DO DEPÓSITO TEM QUE SER MAIOR QUE 0.00");
            }
        } else {
            System.out.println("OPS! VOCÊ AINDA NÃO ABRIU UMA CONTA!");
        }
    }

    public void sacar(float valorSaque){
        if (isStatus()){
            if (valorSaque <= getSaldo()){
                setSaldo(getSaldo() - valorSaque);
                System.out.println("SAQUE DE R$" + valorSaque + " CONCLUÍDO. VOCÊ AGORA TEM R$" + getSaldo() + " NA SUA CONTA");
            } else {
                System.out.println("SALDO INSUFICIENTE! \nSALDO = R$" + getSaldo());
            }
        } else {
            System.out.println("OPS! VOCÊ AINDA NÃO ABRIU UMA CONTA!");
        }
    }
}
