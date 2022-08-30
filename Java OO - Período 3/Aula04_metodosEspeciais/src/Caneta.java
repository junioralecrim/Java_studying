public class Caneta {
    private String modelo;
    private float ponta;
    private boolean tampada;
    private String cor;
    //criando um método construtor
    public Caneta(String m, String c, float p){//este é o método construtor. Esse método sempre tem o mesmo nome da classe
        this.modelo = m;
        this.cor = c;
        this.setPonta(p);
        this.Tampar();
    }

    public String getModelo(){
        return this.modelo;
    }
    public void setModelo(String m){
        this.modelo = m;
    }

    public float getPonta(){
        return this.ponta;
    }

    public void setPonta(float p){
        this.ponta = p;
    }

    public void Tampar(){
        this.tampada = true;
    }

    public void Destampar(){
        this.tampada = false;
    }

    public void statusCaneta(){
        System.out.println("STATUS DA CANETA:");
        System.out.println("Modelo: " + this.getModelo());
        System.out.println("Ponta: " + this.getPonta());
        System.out.println("Cor: " + this.cor);
        System.out.println("Tampada: " + this.tampada);
    }
}
