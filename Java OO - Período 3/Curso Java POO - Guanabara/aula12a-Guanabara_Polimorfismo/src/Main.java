public class Main {
    public static void main(String[] args) {
        Mamifero mam = new Mamifero();
        Canguru can = new Canguru();
        Cachorro cach = new Cachorro();

        mam.setPeso(21.2f);
        mam.setIdade(12);
        mam.setMembros(4);
        mam.locomover();
        mam.alimentar();
        mam.emitirSom();

        can.setIdade(11);
        can.setPeso(150.40f);
        can.setMembros(4);
        can.setCorPelo("Marrom");
        can.usarBolsa();
        can.locomover(); //polimofirsmo
        can.alimentar();


    }
}