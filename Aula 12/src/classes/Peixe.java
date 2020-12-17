package classes;

public class Peixe extends Animal {
    private String corEscama;

    public void soltarBolha() {
        System.out.println("Soltando bolha...");
    }

    public String getCorEscama() {
        return corEscama;
    }

    public void setCorEscama(String corEscama) {
        this.corEscama = corEscama;
    }

    @Override
    public void locomover() {
        // TODO Auto-generated method stub
        System.out.println("Nadando...");
    }

    @Override
    public void alimentar() {
        // TODO Auto-generated method stub
        System.out.println("Comendo susbtâncias...");
    }

    @Override
    public void emitirSom() {
        // TODO Auto-generated method stub
        System.out.println("blbulbjlbu...");
    }

}
