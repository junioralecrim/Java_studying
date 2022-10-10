public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    void rabiscar(){
        if (this.tampada == true){
            System.out.println("ERRO! Não posso rabiscar");
        } else {
            System.out.println("Estou Rabiscando");
        }
    }

    void tampar(){
        this.tampada = true;
    }

    void destampar(){
        this.tampada = false;
    }

    void status(){
        System.out.println("Cor: " + this.cor);
        System.out.println("Tampada?: " + this.tampada);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Carga: " + this.carga);
        System.out.println("Ponta: " + this.ponta);

    }
}
