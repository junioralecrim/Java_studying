public class Ave extends Animal{
    private String corPena;
    public void fazerNinho(){
        System.out.println("Construiu um ninho");
    }

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }

    @Override
    protected void locomover() {
        System.out.println("Voando");
    }

    @Override
    protected void alimentar() {
        System.out.println("Comendo frutas");
    }

    @Override
    protected void emitirSom() {
        System.out.println("Som de ave");
    }


}
