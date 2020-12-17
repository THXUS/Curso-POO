package classes;

public class Pessoa {
    private String nome;
    private int idade;
    private String sexo;

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return this.idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return this.sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void fazerAniver() {
        this.setIdade(this.getIdade() + 1);
    }

    public void Status() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("Idade: " + this.getIdade());
        System.out.println("Sexo: " + this.getSexo());
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "Pessoa{" + this.getNome() + ", " + this.getIdade() + ", " + this.getSexo() + "}";
    }

}
