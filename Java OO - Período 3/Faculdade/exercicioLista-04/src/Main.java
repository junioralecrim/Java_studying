public class Main {
    public static void main(String[] args) {
        Professor professor1 = new Professor("Euristeniu", 66);
        Disciplina disciplina1 = new Disciplina("Algoritimos", 02, professor1);

        System.out.println("Nome Disciplina: " + disciplina1.getNome() + "\nCodigo Disciplina: " + disciplina1.getCodigo_disciplina() +
                "\nNome professor da disciplina: " + disciplina1.getProfessor());

    }
}