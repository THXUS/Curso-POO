public class Caneta{
    
 
    public String modelo;
    private float ponta;
    private boolean tampar;
        
    Caneta(boolean t, String m, float p){
        this.setTampar(t);
        this.setModelo(m);
        this.setPonta(p);
    }
    Caneta() //construtor!!!!
    {
        this.setTampar(true);
        this.setModelo("Bic Vagabunda");
        this.setPonta(0.5f);
        
    }
    public void setTampar(boolean t){
        this.tampar = t;
    }
    public void setModelo(String m){
        this.modelo = m;
    }
    public void setPonta(float p){
        this.ponta = p;
    } 
    public String getModelo(){
        return this.modelo;
    }
    public float getPonta(){
        return this.ponta;
    }
    public boolean getTampada(){
        return this.tampar;
    }
    public void status(){
        System.out.println("O modelo é " + this.getModelo());
        System.out.println("A ponta é " + this.getPonta());
    }

}
