public class Main {
    public static void main(String[] args) {

        Caneta c1 = new Caneta();
        c1.cor = "Azul";
        c1.ponta = 0.5f;
        c1.destampar();
        c1.rabiscar();
        c1.status();

        Caneta c2 = new Caneta();
        c2.modelo = "Bic";
        c2.ponta = 0.8f;
        c2.cor = "Rosa";
        c2.tampar();
        c2.rabiscar();
        c2.status();
    }
}