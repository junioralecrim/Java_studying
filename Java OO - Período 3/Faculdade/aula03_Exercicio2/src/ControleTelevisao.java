public class ControleTelevisao {
    //instanciar objeto tv aqui pra alterar lá no outro

    Televisao tv1 = new Televisao();

    public int mudarVolume;
    public int mudarCanal;

    public void aumentarVolume(){
        tv1.volume = mudarVolume + 1;
    }
    public void baixarVolume(){
        tv1.volume = mudarVolume - 1;
    }
    public void mudarCanalCima(){

    }

    public void mudarCanalBaixo(){

    }
}
