package classes;

public class Gafanhoto extends Pessoa {
    public Gafanhoto(String nome, int idade, String sexo, String login) {
        super(nome, idade, sexo);
        this.setLogin(login);
        this.setTotAssitido(0);
    }

    private String login;
    private int totAssitido;

    public String getLogin() {
        return this.login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public int getTotAssitido() {
        return this.totAssitido;
    }

    public void setTotAssitido(int totAssitido) {
        this.totAssitido = totAssitido;
    }

    public void viuMaisUm() {

    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString() + " " + this.getLogin() + " " + Integer.toString(this.getTotAssitido());
    }
}
