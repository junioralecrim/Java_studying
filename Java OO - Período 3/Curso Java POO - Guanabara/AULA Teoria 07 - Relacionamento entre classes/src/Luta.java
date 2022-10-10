import java.util.Random;

public class Luta {

    //Eu vou estar criando logo abaixo um relacionamento com a classe Lutador.

    //RELACIONAMENTO DO TIPO "TEM UM"
    //A classe Luta "TEM UM" (que na verdade é mais de um) ATRIBUTO que é da classe Lutador.

    private Lutador desafiado; //vai ser uma instância da classe lutador. Ou seja, vai ser um objeto da classe lutador.
    //Aqui eu estou fazendo a definição do atributo como sendo do tipo abstrato de dado
    private Lutador desafiante; //outra instância da classe lutador. Agora eu tenho o objeto desafiante.
    private int rounds;
    private boolean aprovada;


    public void marcarLuta(Lutador l1, Lutador l2){
        //se a categoria for igual e os lutadores diferentes
        if ((l1.getCategoria().equals(l2.getCategoria())) && (l1 != l2)){ //posso usar os métodos do objeto l1/l2 tranquilamente
            //já que vinheram da classe lutador
            aprovada = true;
            desafiado = l1;
            desafiante = l2;
        } else {
            aprovada = false;
            desafiado = null;
            desafiante = null;
        }
    }

    public void lutar(){
        if (aprovada){
            System.out.println("### DESAFIADO ###");
            desafiado.apresentar(); //COMO DESAFIADO É UM OBJETO DO TIPO LUTADOR, eu posso usar os métodos dessa classe
            //sem problemas.
            System.out.println("\n### DESAFIANTE ###");
            desafiante.apresentar();

            Random gerador = new Random();

            int vencedor = gerador.nextInt(3); //AINDA PRECISO CRIAR UM GERADOR DE NÚMERO ALEATÓRIO
            switch (vencedor){
                case 0:
                    System.out.println("\nEmpatou");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1:
                    System.out.println("\nVencedor: " + this.desafiado.getNome());
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2:
                    System.out.println("\nVencedor: " + this.desafiante.getNome());
                    this.desafiado.perderLuta();
                    this.desafiante.ganharLuta();
                    break;
            }

        } else {
            System.out.println("Luta não pode acontecer");
        }
    }

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }
}
