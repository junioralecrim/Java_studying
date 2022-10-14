public class Aluno extends Pessoa{
    private String matr;
    private String curso;

    public void cancelarMatr(){
        System.out.println("Matrícula será cancelada");
        setMatr(null);
    }


    //métodos especiais

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
