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
        if ((l1.getCategoria() == l2.getCategoria()) && (l1 != l2)){
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
            desafiado.apresentar(); //COMO DESAFIADO É UM OBJETO DO TIPO LUTADOR, eu posso usar os métodos dessa classe
            //sem problemas.

            desafiante.apresentar();
            int vencedor = 1; //AINDA PRECISO CRIAR UM GERADOR DE NÚMERO ALEATÓRIO




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
