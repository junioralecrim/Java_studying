import java.util.Scanner;

public class Pessoa {
    //atributos públicos: nome, ano de nascimento e altura
    //
    //métodos públicos:
    //
    //Imprimir todos os dados de uma pessoa
    //
    //Calcular idade da pessoa com base no ano de nascimento

    public String nome;
    public int anoNascimento;
    public int altura;

    public void imprimirDados(){
        System.out.print("Nome: " + this.nome + "\nAno de nascimento: " + this.anoNascimento + "\nAltura (cm): " +
                this.altura);
    }

    public void calcularIdade(int anoNascimento){
        Scanner in = new Scanner(System.in);
        System.out.println("Digite o ano que voce esta: ");
        int anoAtual = in.nextInt();
        int idade = anoAtual - anoNascimento;
        System.out.println("" + idade);

    }

}
