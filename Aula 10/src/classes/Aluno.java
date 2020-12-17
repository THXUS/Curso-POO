package classes;

public class Aluno extends Pessoa {
    private String matricula;
    private String curso;

    public String getMatricula() {
        return this.matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return this.curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public void cancelarMatr() {
        this.setMatricula(null);
        System.out.println("Matrícula Cancelada");
    }
}
