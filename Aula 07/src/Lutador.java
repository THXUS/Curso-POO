public class Lutador {
    private String nome;
    private String nacionalidade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    public Lutador(String nome, String nac, float altura, float peso, String cat, int vit, int der, int emp){
        this.nome  = nome;
        this.nacionalidade = nac;
        this.altura = altura;
        this.setPeso(peso);
        this.categoria = cat;
        this.vitorias = vit;
        this.derrotas = der;
        this.empates = emp;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return this.nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public float getAltura() {
        return this.altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return this.peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        setCategoria();
    }

    public String getCategoria() {
        return this.categoria;
    }

    public void setCategoria() {
        if(this.getPeso()< 52.2f){
            this.categoria = "Inválido";
        }
        else if(this.getPeso() <=70.3){
            
        }
    }

    public int getVitorias() {
        return this.vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getDerrotas() {
        return this.derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getEmpates() {
        return this.empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }
    public void apresentar(){

    }   
    public void status(){

    } 
    public void ganharLuta(){

    }
    public void perderLuta(){

    }
    public void empatarLuta(){

    }
}
