public class Lutador {
    //metodo construtor
    public Lutador(String no, String nacio, Float altu, int ida, String pe, int vito, int derro, int empa){
        nome = no;
        nacionalidade = nacio;
        altura = altu;
        idade = ida;
        setPeso(peso);
        vitorias = vito;
        derrotas = derro;
        empates = empa;

    }


    private String nome;
    private String nacionalidade;
    private Float altura;
    private int idade;
    private String peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    public void apresentar(){

    }

    public void status(){

    }

    public void ganharLuta(){

    }

    public void perderLuta() {

    }

    public void empatarLuta(){

    }

    //métodos especiais


    public String getNome() {
        return nome;
    }

    public void setNome(String no) {
        this.nome = no;
    }

    public String getPeso() {
        return peso;
    }

    public void setPeso(String pe) {
        this.peso = pe;
        setCategoria();
    }

    public void setCategoria(String cate) {
        this.categoria = categoria;
    }
}
