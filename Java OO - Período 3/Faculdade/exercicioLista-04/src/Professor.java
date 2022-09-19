public class Professor {
    String nome;
    int id_professor;
    Disciplina disciplina;

    public Professor(String nome, int id_professor) {
        this.nome = nome;
        this.id_professor = id_professor;
    }

    public String getNome() {
        return nome;
    }

    public int getId_professor() {
        return id_professor;
    }

}
