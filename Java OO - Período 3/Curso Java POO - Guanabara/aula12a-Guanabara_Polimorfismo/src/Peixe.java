public class Peixe extends Animal{
    private String corEscama;

    public void soltarBolha(){
        System.out.println("Soltou uma bolha");
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    @Override
    protected void locomover() {
        System.out.println("Nadando");
    }

    @Override
    protected void alimentar() {
        System.out.println("Comendo substâncias");
    }

    @Override
    protected void emitirSom() {
        System.out.println("Peixe não faz som");
    }

}
