public class Main {
    
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        c1.modelo = "Bic Crystal";
        c1.cor = "Amarelo";
        //c1.ponta = 0.5f;
        c1.carga = 100; //não da erro pois estamos usando um objeto Caneta na método main
        c1.destampar();
        c1.status();
    }
}
