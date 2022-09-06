public class Conta {
    public int numero;
    private int senha;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

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

    public void abrirConta(String nome, String tipo, String cpf, int senha){
        tipo.equals()

        System.out.println("" + nome + "" + tipo + "" + cpf + "" + senha);


    }
}
