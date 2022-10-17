package pessoa.aluno;

import pessoa.Aluno;

public class Tecnico extends Aluno {
    private String registroProfissional;

    public void praticar(){
        System.out.println("O aluno técnico " + this.getNome() + " está praticando...");
    }

    public String getRegistroProfissional() {
        return registroProfissional;
    }

    public void setRegistroProfissional(String registroProfissional) {
        this.registroProfissional = registroProfissional;
    }
}
