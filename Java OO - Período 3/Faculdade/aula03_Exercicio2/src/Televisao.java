public class Televisao {
    public int canal;
    public int volume;

    public void mostrarVolume(){
        if((this.volume <= 100) && (this.volume >= 1)){
            System.out.println("\nVolume do canal: " + this.volume);
        } else {
            System.out.println("O volume tem que estar entre 100 e 0");
        }
    }

    public void mostrarCanal(){
        if((this.canal <= 100) && (this.canal >= 1)){
            System.out.println("Canal: " + this.canal);
        } else {System.out.println("Digite um canal entre 0 e 100");
        }
    }

}
