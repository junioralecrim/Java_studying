import java.util.Scanner;

public class ControleTelevisao {
    //instanciar objeto tv aqui pra alterar lá no outro
    Televisao tv1 = new Televisao();
    public int mudarVolume;
    public int mudarCanal;

    public void aumentarVolume(){
        tv1.volume += mudarVolume + 1;
        tv1.mostrarVolume();
    }

    public void baixarVolume(){
        tv1.volume += mudarVolume - 1;
        tv1.mostrarVolume();
    }

    public void mudarCanalCima(){
        tv1.canal += mudarCanal + 1;
        tv1.mostrarCanal();
    }

    public void mudarCanalBaixo(){
        tv1.canal += mudarCanal - 1;
        tv1.mostrarCanal();
    }

    public void escolherCanal(int receberCanal){
        tv1.canal = receberCanal;
        tv1.mostrarCanal();
    }
}
