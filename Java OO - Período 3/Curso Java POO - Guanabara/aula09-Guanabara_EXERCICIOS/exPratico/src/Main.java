public class Main {
    public static void main(String[] args) {
        Pessoa[] pessoas = new Pessoa[2];
        Livro[] livros = new Livro[3];

        pessoas[0] = new Pessoa("Junior", 18, "M");
        pessoas[1] = new Pessoa("Daniel", 22, "M");

        livros[0] = new Livro("As Vantagens de Ser Invisível", "Stephen Chbosky", 300, pessoas[0]);
        livros[1] = new Livro("200 Histórias de Mitologia Grega", "Desconhecido", 500, pessoas[0]);
        livros[2] = new Livro("God Of War 2", "Desconhecido", 169, pessoas[1]);

        System.out.println(livros[1].detalhes());
    }
}