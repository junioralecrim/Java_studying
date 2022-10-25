public class Gafanhoto extends Pessoa{

    private String login;
    private int totAssistido;

    @Override
    public String toString() {
        return "Gafanhoto" +
                "\nlogin = " + login +
                "\ntotAssistido = " + totAssistido +
                "\nnome = " + nome +
                "\nidade = " + idade +
                "\nsexo = " + sexo +
                "\nexperiencia = " + experiencia;
    }


    public Gafanhoto(String nome, int idade, Sexo sexo, boolean experiencia, String login, int totAssistido) {
        super(nome, idade, sexo, experiencia);
        this.login = login;
        this.totAssistido = totAssistido;
    }

    public void viuMaisUm(){
        setTotAssistido(getTotAssistido() + 1);
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssistido() {
        return totAssistido;
    }

    public void setTotAssistido(int totAssistido) {
        this.totAssistido = totAssistido;
    }
}
