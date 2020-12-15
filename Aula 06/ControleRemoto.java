public class ControleRemoto implements Controlador{
    private int volume;
    private boolean ligado;
    private boolean tocando;

    public int getVolume() {
        return this.volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isLigado() {
        return this.ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean isTocando() {
        return this.tocando;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    public ControleRemoto(){
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    @Override
    public void ligar() {
        // TODO Auto-generated method stub
        this.setLigado(true);

    }

    @Override
    public void desligar() {
        // TODO Auto-generated method stub
        this.setLigado(false);
    }

    @Override
    public void abrirMenu() {
        // TODO Auto-generated method stub
        System.out.println("Está ligado? " + this.isLigado());
        for(int i = 0; i<this.getVolume(); i+=10)
        {
            System.out.print("| ");
        }
        System.out.println("");
        System.out.println("Está tocando? " + this.isTocando());
    }

    @Override
    public void maisVolume() {
        // TODO Auto-generated method stub
        if(this.isLigado()){
            this.setVolume(this.getVolume()+1);
        }
        else{
            System.out.println("O controle está desligado!!!");
        }
    }  

    @Override
    public void menosVolume() {
        // TODO Auto-generated method stub
        if(this.isLigado()){
            this.setVolume(this.getVolume() - 1);
        }
        else{
            System.out.println("O controle está desligado!!!");
        }
    }

    @Override
    public void ligarMudo() {
        // TODO Auto-generated method stub
        if(this.isLigado() && (this.getVolume() > 0)){
            this.setVolume(0);
        }

    }

    @Override
    public void desligarMudo() {
        // TODO Auto-generated method stub
        if(this.isLigado() && (this.getVolume() == 0)){
            this.setVolume(50);
        }
    }

    @Override
    public void fecharMenu() {
        // TODO Auto-generated method stub
        System.out.println("Fechando Menu...");
    }

    @Override
    public void play() {
        // TODO Auto-generated method stub
        if(this.isLigado() && !this.isTocando()){
            this.setTocando(true);
        }
    }

    @Override
    public void pause() {
        // TODO Auto-generated method stub
        if(this.isLigado() && this.isTocando()){
            this.setTocando(false);
        }
    }

}
