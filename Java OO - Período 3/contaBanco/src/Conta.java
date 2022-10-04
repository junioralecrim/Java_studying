import java.util.Scanner;

public class Conta {
    Scanner in;

    public int numero;
    private int senha;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status = false;

    //outhers
    private String cpf;


    //otherMethods
    /*
    *   abrirConta() //
        fecharConta()
        depósito()
        saque()
        extrato()
        pagarMensal()*/

    public void abrirConta(String nome, String tipo, String cpf, int senha){
        this.status = true;

        if (tipo.equals("cc")){
            this.saldo = 50.00f;
        } else if (tipo.equals("cp")) {
            this.saldo = 150.00f;
        } else {
            System.out.println("Você não digitou um tipo válido!");
        }

        this.dono = nome;
        this.senha = senha;
        this.cpf = cpf;


    }

    public void fecharConta(){
        if (status == true){
            if (saldo > 0){
                System.out.println("Você tem ainda um saldo de R$" + saldo + " na sua conta. Por favor, faça o saque " +
                        "antes de fecha-la.");
            } else if (saldo < 0) {
                System.out.println("Você tem um débito de " + saldo + " no banco! Por favor, pague a mensalidade " +
                        "antes de fechar a conta.");
            } else {
                status = false;
                System.out.println("Conta fechada com sucesso!");
            }
        } else {
            System.out.println("OPS! VOCÊ AINDA NÃO TEM UMA CONTA ABERTA!!");
        }

    }

    public void depositar(float valorDep){
        if (status == true){
            if (valorDep > 0.00){
                saldo += valorDep;
                System.out.println("DEPÓSITO BEM CONCLUÍDO!");
            } else {
                System.out.println("O VALOR DO DEPÓSITO TEM QUE SER MAIOR QUE 0.00");
            }
        } else {
            System.out.println("OPS! VOCÊ AINDA NÃO ABRIU UMA CONTA!");
        }
    }

    public void sacar(float valorSaque){
        if (status == true){
            if (valorSaque <= saldo){
                saldo = saldo - valorSaque;
                System.out.println("SAQUE DE R$" + valorSaque + " CONCLUÍDO. VOCÊ AGORA TEM R$" + saldo + " NA SUA CONTA");
            } else {
                System.out.println("SALDO INSUFICIENTE! \nSALDO = R$" + saldo);
            }
        } else {
            System.out.println("OPS! VOCÊ AINDA NÃO ABRIU UMA CONTA!");
        }
    }

    public void pagarMensalidade(){
        if (status == true){
            if (saldo > 0){
                if (tipo.equals("cc")){
                    if (saldo >= 12){
                        saldo = saldo - 12;
                        System.out.println("MENSALIDADE DE R$ 12.00 PAGA COM SUCESSO");
                    } else {
                        System.out.println("SALDO INSUFICIENTE PARA PAGAR A MENSALIDADE. POR FAVOR, FAÇA O DEPÓSITO NA CONTA.\nSALDO = R$" + saldo);
                    }
                } if (tipo.equals("cp")){
                    if (saldo >= 20){
                        saldo = saldo - 20;
                        System.out.println("MENSALIDADE DE R$ 20.00 PAGA COM SUCESSO");
                    } else {
                        System.out.println("SALDO INSUFICIENTE PARA PAGAR A MENSALIDADE. POR FAVOR, FAÇA O DEPÓSITO NA CONTA.\nSALDO = R$" + saldo);
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
