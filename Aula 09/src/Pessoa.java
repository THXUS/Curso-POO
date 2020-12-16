public class Pessoa {

    private String nome;
    private int idade;
    private String sexo;

    public String getNome() {
        return this.nome;
    }

    private void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }

    private void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return this.sexo;
    }

    private void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public Pessoa(String nome, int idade, String sexo) {
        this.nome = nome;
        this.idade = idade;
        this.sexo = sexo;
    }

    public void fazerAniver() {
        this.setIdade(this.getIdade() + 1);
    }
}