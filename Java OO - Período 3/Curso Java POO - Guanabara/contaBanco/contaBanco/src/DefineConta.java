public class DefineConta extends Conta {

    public void abrirConta(String nome, String tipo, String cpf, int senha){
        setStatus(true);
        setTipo(tipo);

        if (this.getTipo().equals("cc")){
            setSaldo(50.00f);
        } else if (getTipo().equals("cp")) {
            setSaldo(150.00f);
        } else {
            System.out.println("Você não digitou um tipo válido!");
        }

        setDono(nome);
        setSenha(senha);
        setCpf(cpf);

    }

    public void fecharConta(){
        if (isStatus()){
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
}
