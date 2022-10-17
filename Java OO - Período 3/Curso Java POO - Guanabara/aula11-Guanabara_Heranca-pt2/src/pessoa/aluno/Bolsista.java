package pessoa.aluno;

import pessoa.Aluno;

public class Bolsista extends Aluno {
    private float bolsa;

    public void RenovarBolsa(){
        System.out.println("Renovando bolsa do aluno " + this.getNome());
    }

    /*sobreescrevendo o método pagar mensalidade do aluno. O aluno normal vai pagar mensalidade de um jeito, já
    o aluno bolsista vai pagar a mensalidade de outra forma

    isso já é uma característica do polimorfismo
    */
    @Override
    public void pagarMensalidade(){
        System.out.println(this.getNome() + " é bolsista! Pagamento facilitado!");
    }

    public float getBolsa() {
        return bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }
}
