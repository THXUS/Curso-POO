package classes;

public class Ave extends Animal {
    private String corPena;

    public void fazerNinho() {
        System.out.println("Construindo ninho...");
    }

    @Override
    public void locomover() {
        // TODO Auto-generated method stub
        System.out.println("Voando...");
    }

    public String getCorPena() {
        return corPena;
    }

    public void setCorPena(String corPena) {
        this.corPena = corPena;
    }

    @Override
    public void alimentar() {
        // TODO Auto-generated method stub
        System.out.println("Comendo Frutas...");
    }

    @Override
    public void emitirSom() {
        // TODO Auto-generated method stub
        System.out.println("Som de ave");
    }

}
