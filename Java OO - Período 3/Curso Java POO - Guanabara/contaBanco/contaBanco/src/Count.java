public class Count {
    CountControler countControler = new CountControler();

    public void abrirConta(String nome, String tipo, String cpf, int senha){
        countControler.abrirConta(nome, tipo, cpf, senha);
    }

    public void fecharConta(){
        countControler.fecharConta();
    }

    public void pagarMensalidade(){
        countControler.pagarMensalidade();
    }

    public void depositar(float valorDep){
        countControler.depositar(valorDep);
    }

    public void sacar(float valorSaque){
        countControler.sacar(valorSaque);
    }

}
