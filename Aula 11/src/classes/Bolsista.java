package classes;

public class Bolsista extends Aluno {
    private float bolsa;

    public float getBolsa() {
        return this.bolsa;
    }

    public void setBolsa(float bolsa) {
        this.bolsa = bolsa;
    }

    public void renovarBolsa() {
        System.out.println("Renovando a bolsa de " + this.getNome());
    }

    @Override
    public void pagarMensalidade() {
        System.out.println("Pagando Mensalidade com desconto");
    }
}
