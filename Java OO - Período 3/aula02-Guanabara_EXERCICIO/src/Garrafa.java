public class Garrafa {
    String corTampa;
    String corCorpo;
    String estampa;
    boolean tampaAberta;
    boolean bocaAberta;

    void abrirTampa(){
        this.tampaAberta = true;
    }

    void fecharTampa(){
        this.tampaAberta = false;
    }

    void abrirBoca(){
        this.bocaAberta = true;
    }

    void fecharBoca(){
        this.bocaAberta = false;
    }

    void encher(){
        if (this.tampaAberta == true){
            System.out.println("Garrafa cheia");
        } else {
            System.out.println("ERRO! A tampa da garrafa está fechada");
        }
    }

    void secar(){
        if (this.tampaAberta == true){
            System.out.println("Garrafa seca");
        } else {
            System.out.println("ERRO! A tampa da garrafa está fechada");
        }
    }

    void status(){
        System.out.println("Cor Tampa: " + this.corTampa);
        System.out.println("Cor Corpo: " + this.corCorpo);
        System.out.println("Estampa: " + this.estampa);
        System.out.println("Tampa está aberta?: " + this.tampaAberta);
        System.out.println("Boca está aberta?: " + this.bocaAberta);
    }
}
