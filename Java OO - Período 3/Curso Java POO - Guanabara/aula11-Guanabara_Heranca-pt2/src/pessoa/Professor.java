package pessoa;

public class Professor extends Pessoa{

    private String especialidade;
    private Double salario;

    public void receberAum(double aum){
        setSalario(getSalario() + aum);
    }



    //métodos especiais

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
}
