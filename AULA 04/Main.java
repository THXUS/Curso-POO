

public class Main {
    public static void main(String[] args) {
        Caneta c1 = new Caneta();
        /*
        c1.setModelo("Pentel nanquim");
        c1.setPonta(0.7f);
        */
        c1.status();
        Caneta c2 = new Caneta(false,"Pentel Nanquim",1.1f);
        c2.status();
    }
}
