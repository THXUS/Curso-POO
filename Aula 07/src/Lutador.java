
public class Lutador {
    private String nome;
    private String nacionalidade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;
    private int idade;

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Lutador(String nome, String nac, float altura, float peso, int vit, int der, int emp, int id) {
        this.nome = nome;
        this.nacionalidade = nac;
        this.altura = altura;
        this.setPeso(peso);
        this.vitorias = vit;
        this.derrotas = der;
        this.empates = emp;
        this.idade = id;
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

    private void setCategoria() { // metodos internos são normalmente privados
        if (this.getPeso() < 52.2f || this.getPeso() > 120.2f) {
            this.categoria = "Inválido";
        } else if (this.getPeso() <= 56.7f) {
            this.categoria = "Mosca";
        } else if (this.getPeso() <= 61.2f) {
            this.categoria = "Galo";
        } else if (this.getPeso() <= 65.8f) {
            this.categoria = "Pena";
        } else if (this.getPeso() <= 70.3f) {
            this.categoria = "Leve";
        } else if (this.getPeso() <= 77.1f) {
            this.categoria = "Meio-Médio";
        } else if (this.getPeso() <= 83.9f) {
            this.categoria = "Médio";
        } else if (this.getPeso() <= 92.9f) {
            this.categoria = "Médio-Pesado";
        } else {
            this.categoria = "Pesado";
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

    public void apresentar() {
        System.out.println("Lutador: " + this.getNome());
        System.out.println("Origem: " + this.getNacionalidade());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Altura: " + this.getAltura() + "m");
        System.out.println("Pesando: " + this.getPeso() + "kgs");
        System.out.println("Vitórias: " + this.getVitorias());
        System.out.println("Derrotas: " + this.getDerrotas());
        System.out.println("Empates: " + this.getEmpates());
    }

    public void status() {
        System.out.println("============STATUS==================");
        System.out.println("Categoria: " + this.getCategoria());
        System.out.println(this.getVitorias() + " vitórias");
        System.out.println(this.getDerrotas() + " derrotas");
        System.out.println(this.getEmpates() + " empates");
    }

    public void ganharLuta() {
        this.setVitorias(this.getVitorias() + 1);

    }

    public void perderLuta() {
        this.setDerrotas(this.getDerrotas() + 1);
    }

    public void empatarLuta() {
        this.setEmpates(this.getEmpates() + 1);
    }
}
