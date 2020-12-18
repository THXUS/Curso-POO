package classes;

public class Visualisacao {
    private Gafanhoto espectador;
    private Video filme;

    public Gafanhoto getEspectador() {
        return this.espectador;
    }

    public void setEspectador(Gafanhoto espectador) {
        this.espectador = espectador;
    }

    public Video getFilme() {
        return this.filme;
    }

    public void setFilme(Video filme) {
        this.filme = filme;
    }

    public Visualisacao(Gafanhoto gafanhoto, Video filme) {
        this.setEspectador(gafanhoto);
        this.setFilme(filme);
        this.getEspectador().setTotAssitido(this.getEspectador().getTotAssitido() + 1);
        this.getFilme().setViews(this.getFilme().getViews() + 1);
    }

    public void avaliar() {
        this.getFilme().setAvaliacao(5);
    }

    public void avaliar(int nota) {
        this.getFilme().setAvaliacao((int) nota);
    }

    public void avaliar(float porc) {
        float tot = 0;
        if (porc <= 10)
            tot = 2;
        else if (porc <= 30)
            tot = 5;
        else if (porc <= 50)
            tot = 7;
        else if (porc <= 90)
            tot = 8;
        else
            tot = 10;
        this.getFilme().setAvaliacao((int) tot);
    }
}
