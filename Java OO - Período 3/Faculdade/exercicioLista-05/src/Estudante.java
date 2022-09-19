public class Estudante {
    String nome_estudante;
    String matricula;

    public Estudante(String nome_estudante, String matricula) {
        this.nome_estudante = nome_estudante;
        this.matricula = matricula;
    }

    public String getNome_estudante() {
        return nome_estudante;
    }

    public void setNome_estudante(String nome_estudante) {
        this.nome_estudante = nome_estudante;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}
