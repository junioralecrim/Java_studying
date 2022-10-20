public abstract class Conta{
    private int numero;
    private int senha;
    private String tipo;
    private String dono;
    private float saldo;
    private boolean status = false;

    //outhers
    private String cpf;

    protected int getNumero() {
        return numero;
    }

    protected void setNumero(int numero) {
        this.numero = numero;
    }

    protected int getSenha() {
        return senha;
    }

    protected void setSenha(int senha) {
        this.senha = senha;
    }

    protected String getTipo() {
        return tipo;
    }

    protected void setTipo(String tipo) {
        this.tipo = tipo;
    }

    protected String getDono() {
        return dono;
    }

    protected void setDono(String dono) {
        this.dono = dono;
    }

    protected float getSaldo() {
        return saldo;
    }

    protected void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    protected boolean isStatus() {
        return status;
    }

    protected void setStatus(boolean status) {
        this.status = status;
    }

    protected String getCpf() {
        return cpf;
    }

    protected void setCpf(String cpf) {
        this.cpf = cpf;
    }
}


