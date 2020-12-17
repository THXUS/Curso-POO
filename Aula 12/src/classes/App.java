package classes;

public class App {
    public static void main(String[] args) {
        /*
         * Mamifero m = new Mamifero(); Reptil r = new Reptil(); Peixe p = new Peixe();
         * Ave a = new Ave();
         * 
         * m.setPeso(85.3f); m.setIdade(2); m.setMembros(2); m.locomover();
         * m.alimentar(); m.emitirSom();
         * 
         * p.setPeso(0.35f); p.setIdade(1); p.setMembros(0); p.locomover();
         * p.alimentar(); p.emitirSom(); p.soltarBolha();
         * 
         * a.setPeso(0.89f); a.setIdade(2); a.setMembros(2); a.locomover();
         * a.alimentar(); a.emitirSom(); a.fazerNinho();
         */
        Mamifero m = new Mamifero();
        Cachorro c = new Cachorro();
        Canguru k = new Canguru();

        m.setPeso(5.70f);
        m.setIdade(8);
        m.setMembros(4);
        m.locomover();
        m.alimentar();
        m.emitirSom();
        System.out.println("");
        k.setPeso(55.30f);
        k.setIdade(3);
        k.setMembros(4);
        k.locomover();
        k.alimentar();
        k.emitirSom();
        System.out.println("");
        c.setPeso(3.95f);
        c.setIdade(5);
        c.setMembros(4);
        c.locomover();
        c.alimentar();
        c.emitirSom();

    }
}
