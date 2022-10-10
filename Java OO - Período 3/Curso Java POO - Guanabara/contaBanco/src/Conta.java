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

    public Conta() {
        this.saldo = 0;
        this.status = false;
    }


    //otherMethods
    /*
    *   abrirConta() //
        fecharConta()
        depósito()
        saque()
        extrato()
        pagarMensal()*/

    public void abrirConta(String nome, String tipo, String cpf, int senha){
        setStatus(true);
        setTipo(tipo);

        if (this.getTipo().equals("cc")){
            setSaldo(50.00f);
        } else if (this.getTipo().equals("cp")) {
            setSaldo(150.00f);
        } else {
            System.out.println("Você não digitou um tipo válido!");
        }

        setDono(nome);
        setSenha(senha);
        setCpf(cpf);

    }

    public void fecharConta(){
        if (isStatus() == true){
            if (getSaldo() > 0){
                System.out.println("Você tem ainda um saldo de R$" + getSaldo() + " na sua conta. Por favor, faça o saque " +
                        "antes de fecha-la.");
            } else if (getSaldo() < 0) {
                System.out.println("Você tem um débito de " + getSaldo() + " no banco! Por favor, pague a mensalidade " +
                        "antes de fechar a conta.");
            } else {
                setStatus(false);
                System.out.println("Conta fechada com sucesso!");
            }
        } else {
            System.out.println("OPS! VOCÊ AINDA NÃO TEM UMA CONTA ABERTA!!");
        }

    }

    public void depositar(float valorDep){
        if (isStatus() == true){
            if (valorDep > 0.00){
                setSaldo(getSaldo() + valorDep) ;
                System.out.println("DEPÓSITO BEM SUCEDIDO!");
            } else {
                System.out.println("O VALOR DO DEPÓSITO TEM QUE SER MAIOR QUE 0.00");
            }
        } else {
            System.out.println("OPS! VOCÊ AINDA NÃO ABRIU UMA CONTA!");
        }
    }

    public void sacar(float valorSaque){
        if (isStatus() == true){
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

    public void pagarMensalidade(){
        if (isStatus() == true){
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

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
}


