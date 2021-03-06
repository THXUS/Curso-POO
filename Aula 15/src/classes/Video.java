package classes;

public class Video implements AcoesVideo {

    private String titulo;
    private int avaliacao;
    private int views;
    private int curtidas;
    private boolean reproduzindo;

    public Video(String titulo) {
        this.setTitulo(titulo);
        this.setAvaliacao(1);
        this.setViews(0);
        this.setCurtidas(0);
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAvaliacao() {
        return this.avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        int novaAvaliacao;
        novaAvaliacao = (int) ((this.getAvaliacao() + avaliacao) / this.getViews());
        this.setAvaliacao(novaAvaliacao);
    }

    public int getViews() {
        return this.views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getCurtidas() {
        return this.curtidas;
    }

    public void setCurtidas(int curtidas) {
        this.curtidas = curtidas;
    }

    public boolean isReproduzindo() {
        return this.reproduzindo;
    }

    public void setReproduzindo(boolean reproduzindo) {
        this.reproduzindo = reproduzindo;
    }

    @Override
    public void play() {
        // TODO Auto-generated method stub
        if (!this.isReproduzindo())
            this.setReproduzindo(true);
    }

    @Override
    public void pause() {
        // TODO Auto-generated method stub
        if (this.isReproduzindo())
            this.setReproduzindo(false);
    }

    @Override
    public void like() {
        // TODO Auto-generated method stub
        this.setCurtidas(this.getCurtidas() + 1);
    }

}
