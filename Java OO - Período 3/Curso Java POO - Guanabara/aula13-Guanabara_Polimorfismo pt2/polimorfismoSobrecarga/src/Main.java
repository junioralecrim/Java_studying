public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Cachorro cachorro = new Cachorro();

        cachorro.reagir(pessoa, "Amigavel");
        cachorro.reagir(false);

        cachorro.reagir(17, 4.5f);
    }
}