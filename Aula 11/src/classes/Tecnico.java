package classes;

public class Tecnico {
    private String registroProfissional;

    public String getRegistroProfissional() {
        return this.registroProfissional;
    }

    public void setRegistroProfissional(String registroProfissional) {
        this.registroProfissional = registroProfissional;
    }

    public void praticar() {
        System.out.println("O aluno está praticando!!!");
    }
}
