package classes;

public class Mamifero extends Animal {
    private String corPelo;

    public String getCorPelo() {
        return this.corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

    @Override
    public void locomover() {
        // TODO Auto-generated method stub
        System.out.println("Andando..");
    }

    @Override
    public void alimentar() {
        // TODO Auto-generated method stub
        System.out.println("Mamando...");
    }

    @Override
    public void emitirSom() {
        // TODO Auto-generated method stub
        System.out.println("Som de mamífero...");
    }
}
