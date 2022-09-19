public class Disciplina {
    String nome;
    int codigo_disciplina;
    Professor professor;

    public Disciplina(String nome, int codigo_disciplina, Professor professor) {
        this.nome = nome;
        this.codigo_disciplina = codigo_disciplina;
        this.professor = professor;
    }

    public String getNome() {
        return nome;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public String getProfessor() {
        return professor.getNome();
    }

    public int getCodigo_disciplina() {
        return codigo_disciplina;
    }
}
