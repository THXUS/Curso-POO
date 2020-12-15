public class Aula05 {
    public static void main(String[] args) {
        ContaBanco p1 = new ContaBanco();
        p1.setDono("Rodolfo");
        p1.setNumero(666);
        p1.abrirConta("CC");
        p1.fecharConta();
        p1.estadoAtual();
        p1.sacar(50f);
        p1.fecharConta();
        p1.estadoAtual();
    }
}
