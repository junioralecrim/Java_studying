public class ControleRemoto implements Controlador{/*a classe ControleRemoto implementa a interface
controlador*/

    // Atributos
    private int volume;
    private boolean ligado;
    private boolean tocando;

    // Métodos especiais

    public ControleRemoto() {
        this.volume = 50;
        this.ligado = true;
        this.tocando = false;
    }

    private int getVolume() {
        return volume;
    }

    private void setVolume(int volume) {
        this.volume = volume;
    }

    private boolean isLigado() {
        return ligado;
    }

    private void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    private boolean isTocando() {
        return tocando;
    }

    private void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    @Override /*significa que eu estou sobreescrevendo o método criado anteriormente no controlador. Ou seja:
    vou desconsiderar a programação feita na interface e a utilizada vai ser apenas a feita aqui no @Override*/

    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("Está ligado? " + this.isLigado());
        System.out.println("Está tocando? " + this.isTocando());
        System.out.print("Volume " + this.getVolume() + "\n");
        for (int i = 0; i <= this.getVolume(); i++){
            System.out.print("|");
        }
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando menu... ");
    }

    @Override
    public void maisVolume() {
        if (this.isLigado() == true && this.getVolume() <= 100){
            this.setVolume(this.getVolume() + 5);
        } else {
            System.out.println("OPS. IMPOSSÍVEL AUMENTAR VOLUME!");
        }
    }

    @Override
    public void menosVolume() {
        if (this.isLigado() == true && this.getVolume() >= 5){
            this.setVolume(this.getVolume() - 5);
        } else {
            System.out.println("OPS. IMPOSSÍVEL DIMINUIR VOLUME!");
        }
    }

    @Override
    public void ligarMudo() {
        if ((this.isLigado() == true) && (this.getVolume() > 0)){
            this.setVolume(0);
        } else {
            System.out.println("IMPOSSÍVEL LIGAR MUDO");
        }
    }

    @Override
    public void desligarMudo() {
        if ((this.isLigado() == true) && (this.getVolume() == 0)){
            this.setVolume(50);
        } else {
            System.out.println("IMPOSSÍVEL DESLIGAR MUDO");
        }
    }

    @Override
    public void play() {
        if (this.isLigado() == true && !(this.isTocando())){ //! = nesse caso, significa algo como "se NÃO estiver tocando"
            this.setTocando(true);
        } else {
            System.out.println("IMPOSSÍVEL DAR PLAY");
        }
    }

    @Override
    public void pause() {
        if (this.isLigado() == true && this.isTocando()){
            this.setTocando(false);
        } else {
            System.out.println("IMPOSSÍVEL DAR PAUSE");
        }
    }

    //Implementando métodos abstratos


}
