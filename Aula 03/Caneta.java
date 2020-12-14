public class Caneta {
    public String modelo;
    public String cor;
    private float ponta;
    protected int carga;
    protected boolean tampada;


    public void rabiscar(){
        if(this.tampada)
        {
            System.out.println("A caneta tá tampada animal");
        }
        else
        {
            System.out.println("Tamo rabiscando!!!");
        }
    }
    public void tampar(){
        this.tampada = true;  //this é uma referencia ao objeto instanciado, nesse caso é equivalente a c1.tampada = true

    }
    public void destampar(){
        this.tampada = false;

    }
    public void escrever(){
        if(this.tampada)
        {
            System.out.println("A caneta tá tampada animal");
        }
        else
        {
            System.out.println("Tamo escrevendo!!!");
        }

    }
    void status(){
        System.out.println("Uma caneta " + this.cor);
        System.out.println("Esta tampada? " + this.tampada);
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Ponta " + this.ponta);
        System.out.println("Carga de " + this.carga);

    }
}
