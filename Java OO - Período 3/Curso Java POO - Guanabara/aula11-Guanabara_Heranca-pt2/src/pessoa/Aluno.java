package pessoa;

import pessoa.Pessoa;

//HERANÇA PRA DIFERENÇA (vai implementar tudo de onde herdou + algumas diferenças)
public class Aluno extends Pessoa {
    private String matr;
    private String curso;

    public void pagarMensalidade(){
        System.out.println("Pagando mensalidade do aluno " + this.getNome());
    }


    //gets and sets
    public String getMatr() {
        return matr;
    }

    public void setMatr(String matr) {
        this.matr = matr;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }
}
