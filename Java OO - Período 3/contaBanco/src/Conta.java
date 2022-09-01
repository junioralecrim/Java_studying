public class Conta {
    private int numero;
    private int senha;
    public String tipo;
    public String dono;
    private float saldo;
    protected boolean status;

    //setMethods
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    //getMethods
    public int getNumero() {
        return numero;
    }

    public float getSaldo() {
        return saldo;
    }

    public String getDono() {
        return dono;
    }

    //otherMethods
    /*
    *   abrirConta()
        fecharConta()
        depósito()
        saque()
        extrato()
        pagarMensal()*/

    public void abrirConta(String nome, int cpf, int senha){
        System.out.println("" + nome + "" + cpf + "" + senha);


    }
}
