public class AssistirAula {
    String disciplina;
    String professor;
    String material;
    boolean dentroSala;
    int duracao;
    int sala;

    void irSala() {
        if(this.dentroSala == true){
            System.out.println("Erro!!! Voce já está dentro da sala");
        } else {
            System.out.println("Indo para a sala " + this.sala);
            this.dentroSala = true;
        }

    }

    void sairSala(){
        if (this.dentroSala == true){
            System.out.println("Saindo da sala");
        } else {
            System.out.println("Erro!!! Você já está fora da sala");
        }
    }

    void verAula(){
        if (this.dentroSala == false){
            System.out.println("Erro!!! Voce esta fora da sala");
        }
    }

}
