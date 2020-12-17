package classes;

public class Livro implements Publicacao {
    private String titulo;
    private String autor;
    private int totPaginas;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    public Livro(String titulo, String autor, Pessoa leitor, int totPag) {
        this.setTitulo(titulo);
        this.setAutor(autor);
        this.setLeitor(leitor);
        this.setTotPaginas(totPag);
        this.setPagAtual(0);
        this.setAberto(false);
    }

    private String getTitulo() {
        return this.titulo;
    }

    private void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    private String getAutor() {
        return this.autor;
    }

    private void setAutor(String autor) {
        this.autor = autor;
    }

    private int getTotPaginas() {
        return this.totPaginas;
    }

    private void setTotPaginas(int totPaginas) {
        this.totPaginas = totPaginas;
    }

    private int getPagAtual() {
        return this.pagAtual;
    }

    private void setPagAtual(int pagAtual) {
        this.pagAtual = pagAtual;
    }

    private boolean isAberto() {
        return this.aberto;
    }

    private void setAberto(boolean aberto) {
        this.aberto = aberto;
    }

    private Pessoa getLeitor() {
        return this.leitor;
    }

    private void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

    public void detalhes() {
        System.out.println("=======DETALHES========");
        System.out.println("TÍTULO: " + this.getTitulo());
        System.out.println("AUTOR: " + this.getAutor());
        System.out.println("PAGINA ATUAL: " + this.getPagAtual());
        System.out.println("TOTAL DE PAGINAS: " + this.getTotPaginas());
        System.out.println("LEITOR: " + this.getLeitor().getNome());
        System.out.println("IDADE: " + this.getLeitor().getIdade());
        System.out.println("SEXO: " + this.getLeitor().getSexo());
    }

    private void xingaEsseArrombado() {
        System.out.println("Tá aloprando arrombado!!");
    }

    @Override
    public void abrir() {
        // TODO Auto-generated method stub
        if (!this.isAberto()) {
            this.setAberto(true);
        }
    }

    @Override
    public void fechar() {
        // TODO Auto-generated method stub
        if (this.isAberto()) {
            this.setAberto(false);
            this.setPagAtual(0);
        }
    }

    @Override
    public void folhear(int pag) {
        // TODO Auto-generated method stub
        if (this.isAberto() && pag <= this.getTotPaginas() - this.getPagAtual()) {
            this.setPagAtual(this.getPagAtual() + pag);
        } else {
            this.xingaEsseArrombado();
        }
    }

    @Override
    public void avancarPag() {
        // TODO Auto-generated method stub
        if (this.isAberto() && this.getPagAtual() < this.getTotPaginas()) {

            this.setPagAtual(this.getPagAtual() + 1);
        } else {
            this.xingaEsseArrombado();
        }
    }

    @Override
    public void voltarPag() {
        // TODO Auto-generated method stub
        if (this.isAberto() && this.getPagAtual() > 0) {

            this.setPagAtual(this.getPagAtual() - 1);
        } else {
            this.xingaEsseArrombado();
        }
    }
}
