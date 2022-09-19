import java.util.ArrayList;

public class Curso {
    String nome_curso;
    int codigo_curso;

    ArrayList<Estudante> estudantes = new ArrayList<>();

    public Curso(String nome_curso, int codigo_curso) {
        this.nome_curso = nome_curso;
        this.codigo_curso = codigo_curso;
    }

    public void addEstudantes(Estudante estudante){
        this.estudantes.add(estudante);
    }

    public String getNome_curso() {
        return nome_curso;
    }

    public int getCodigo_curso() {
        return codigo_curso;
    }

    public void getTotalEstudantes(){
        for (Estudante s: estudantes) {
            System.out.println(s.getNome_estudante());
        }
    }
}
