public interface Controlador { //apenas a interface fica visível ao programa
    public abstract void ligar();/*Métodos abstratos não tem seu código implementado
    diretamente nele.*/
    public abstract void desligar();
    public abstract void abrirMenu();
    public abstract void fecharMenu();
    public abstract void maisVolume();
    public abstract void menosVolume();
    public abstract void ligarMudo();
    public abstract void desligarMudo();
    public abstract void play();
    public abstract void pause();
}
