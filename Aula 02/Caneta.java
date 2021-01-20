public class Caneta {
    String modelo;
    String cor;
    float ponta;
    int carga;
    boolean tampada;

    //teste a
    void rabiscar(){
        if(this.tampada)
        {
            System.out.println("A caneta tá tampada animal");
        }
        else
        {
            System.out.println("Tamo rabiscando!!!");
        }
    }
    void tampar(){
        this.tampada = true;  //this é uma referencia ao objeto instanciado, nesse caso é equivalente a c1.tampada = true

    }
    void destampar(){
        this.tampada = false;

    }
    void escrever(){
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
