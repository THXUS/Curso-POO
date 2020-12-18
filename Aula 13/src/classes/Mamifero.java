package classes;

public class Mamifero extends Animal {
    protected String corPelo;

    public String getCorPelo() {
        return this.corPelo;
    }

    public void setCorPelo(String corPelo) {
        this.corPelo = corPelo;
    }

    @Override
    public void emitirSom() {
        // TODO Auto-generated method stub
        System.out.println("som de Mamífero");
    }
}
