package classes;

public class App {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Rodolfo", 22, "Masculino");
        Livro l1 = new Livro("Moby Dick", "H.G Els", p1, 500);

        l1.abrir();

        l1.avancarPag();
        l1.folhear(500);
        l1.voltarPag();
        l1.folhear(500);
        l1.fechar();
        l1.avancarPag();
        l1.abrir();
        l1.folhear(8);
        p1.fazerAniver();
        l1.folhear(493);
        l1.detalhes();
    }
}
