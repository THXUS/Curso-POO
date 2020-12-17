package classes;

public class App {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        Aluno p2 = new Aluno();
        Professor p3 = new Professor();
        Funcionario p4 = new Funcionario();

        /*
         * Aluno p2 = new Aluno(); Professor p3 = new Professor(); Funcionario p4 = new
         * Funcionario(); p1.setNome("Pedro"); p2.setNome("Maria"); p3.setNome("José");
         * p4.setNome("Júnior");
         * 
         */
        p1.setNome("Ronaldo");
        p2.setNome("Magnolia");
        p3.setNome("Juventino");
        p4.setNome("Laerte");
        p1.setSexo("Masculino");
        p2.setSexo("Feminino");
        p4.setIdade(25);
        p2.setCurso("Informática");
        p3.setSalario(2000.00f);
        p4.setSetor("Estoque");

        p4.mudarTrabalho();
        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println(p4.toString());
    }
}
