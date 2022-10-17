package pessoa;
import pessoa.aluno.Bolsista;

public class Main {
    public static void main(String[] args) {
        Professor professor = new Professor();
        Aluno aluno = new Aluno();
        Bolsista bolsista = new Bolsista();
        Visitante visitante = new Visitante();

        visitante.setIdade(18);
        visitante.setNome("Daniboi");
        visitante.setSexo("M");

        System.out.println(visitante.toString());

        aluno.setNome("Rodriguin Gameprais");
        aluno.setCurso("SI");
        aluno.setMatr("21.2.00000");
        aluno.setSexo("M");
        aluno.setIdade(22);

        System.out.println(aluno.toString());
        aluno.pagarMensalidade();

        bolsista.setNome("Junior Lindo");
        bolsista.setCurso("ADS");
        bolsista.setMatr("21.2.05000");
        bolsista.setSexo("M");
        bolsista.setIdade(22);
        bolsista.setBolsa(12.5f);


        System.out.println(bolsista.toString());
        bolsista.pagarMensalidade();


    }
}