public class Garrafa {
    int volume;
    boolean tampada;
    boolean cheia;
    String cor;
    String modelo;
    void encher(){
        if(this.tampada)
        {
            System.out.println("Destampa a garrafa animal");
        }
        else if(this.cheia)
        {
            System.out.println("A garrafa já está cheia, seu bundão");
        }
        else
        {
            System.out.println("A garrafa foi preenchida!!");
            this.cheia = true;
        } 
    }
    void esvaziar(){
        if(this.tampada)
        {
            System.out.println("Destampa a garrafa animal");
        }
        else if(!this.cheia)
        {
            System.out.println("A garrafa já está vazia animal");
        }
        else
        {
            System.out.println("A garrafa foi esvaziada!!");
            this.cheia = false;
        } 

    }
    void status()
    {
                
        System.out.println("Qual o volume ? " + this.volume);
        System.out.println("O modelo é " + this.modelo);
        System.out.println("A cor é " + this.cor);
        System.out.println("Está cheia? " + this.cheia);
        System.out.println("Está tampada? " + this.tampada);
    }





}
