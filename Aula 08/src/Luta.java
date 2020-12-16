import java.util.Random;

public class Luta {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovado;

    public Lutador getDesafiado() {
        return this.desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return this.desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return this.rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public boolean isAprovado() {
        return this.aprovado;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }

    public void marcarLuta(Lutador l1, Lutador l2) {
        if (l1.getCategoria().equals(l2.getCategoria()) && l1 != l2) {
            this.aprovado = true;
            this.desafiado = l1;
            this.desafiante = l2;
        } else {
            this.aprovado = false;
            this.desafiado = null;
            this.desafiante = null;
        }
    }

    public void lutar() {
        if (this.aprovado) {
            this.desafiado.apresentar();
            this.desafiante.apresentar();
            Random rand = new Random();
            int vencedor = rand.nextInt(3);
            switch (vencedor) {

                case 0:
                    this.desafiado.empatarLuta();
                    this.desafiado.empatarLuta();
                    System.out.println("HOUVE EMPATE!!");
                    break;
                case 1:
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    System.out.println("O lutador " + this.desafiado.getNome() + " ganhou");
                    break;
                case 2:
                    this.desafiado.perderLuta();
                    this.desafiante.ganharLuta();
                    System.out.println("O lutador " + this.desafiante.getNome() + " ganhou");
                    break;
            }
        } else {
            System.out.println("A luta não pode acontecer");
        }
    }
}
