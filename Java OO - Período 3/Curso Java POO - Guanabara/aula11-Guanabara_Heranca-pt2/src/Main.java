public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Funcionario funcionario = new Funcionario();
        Professor professor = new Professor();
        Aluno aluno = new Aluno();

        pessoa.setNome("Pedro");
        funcionario.setNome("Maria");
        professor.setNome("Cláudio");
        aluno.setNome("Fabiana");

        aluno.setCurso("ADS");
        professor.setSalario(4000.00);
        funcionario.setSetor("Estoque");

        aluno.setIdade(24);

        System.out.println(pessoa.toString());
        System.out.println(aluno.toString());
        System.out.println(funcionario.toString());
        System.out.println(professor.toString());
    }
}