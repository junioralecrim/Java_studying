public class Video implements AcoesVideo{
    private String titulo;
    private int avaliacao;
    private double views;
    private double curtidas;
    private boolean reproduzindo;

    @Override
    public void play() {
        setReproduzindo(true);
    }

    @Override
    public void pause() {
        setReproduzindo(false);
    }

    @Override
    public void like() {
        setCurtidas(getCurtidas() + 1);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }

    public double getViews() {
        return views;
    }

    public void setViews(double views) {
        this.views = views;
    }

    public double getCurtidas() {
        return curtidas;
    }

    public void setCurtidas(double curtidas) {
        this.curtidas = curtidas;
    }

    public boolean isReproduzindo() {
        return reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }
}
