public class Visualizacao {
    private Gafanhoto espectador;
    private Video filme;

    public Visualizacao(Gafanhoto espectador, Video filme) {
        this.espectador = espectador;
        this.filme = filme;
        this.espectador.setTotAssistido(this.espectador.getTotAssistido() + 1);
        this.filme.setViews(this.filme.getViews() + 1);
    }

    @Override
    public String toString() {
        return "\n==== Visualizacao =====" +
                "\nespectador= " + espectador.getNome() +
                "\nfilme= " + filme.getTitulo() +
                "\nAvaliação = " + filme.getAvaliacao();
    }

    public void avaliar(){
        filme.setAvaliacao(5);
    };

    public void avaliar(int nota){
        if(nota > 0 && nota <= 10){
            filme.setAvaliacao(nota);
        } else {
            System.out.println("ERRO! NOTA PRECISA SER ENTRE 0 E 10.");
        }

    };

    public void avaliar(float porcentagem){

        porcentagem = Math.round((porcentagem*10)/100);

        if (porcentagem > 0.00f && porcentagem <= 10.00f){
            System.out.println("Entrando aqui "+porcentagem);
            filme.setAvaliacao((int) porcentagem);
        } else {
            System.out.println("ERRO! A PORCENTAGEM DA NOTA PRECISA SER ENTRE 0 E 100.");
        }

    };
}
