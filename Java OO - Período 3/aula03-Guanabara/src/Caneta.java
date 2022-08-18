public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    private boolean tampada;

    public void rabiscar(){
        if (this.tampada == true){
            System.out.println("ERRO! Não posso rabiscar");
        } else {
            System.out.println("Estou Rabiscando");
        }
    }

    public void tampar(){
        this.tampada = true;
    }

    public void destampar(){
        this.tampada = false;
    }

    public void status(){
        System.out.println("Cor: " + this.cor);
        System.out.println("Tampada?: " + this.tampada);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Carga: " + this.carga);
        System.out.println("Ponta: " + this.ponta);

    }
}