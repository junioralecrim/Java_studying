public class Reptil extends Animal{
    private String corEscama;

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    @Override
    protected void locomover() {
        System.out.println("Rastejando");
    }

    @Override
    protected void alimentar() {
        System.out.println("Comendo vegetais");
    }

    @Override
    protected void emitirSom() {
        System.out.println("Som de reptil");
    }


}
