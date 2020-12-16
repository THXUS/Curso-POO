import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        Lutador l[] = new Lutador[6];
        l[0] = new Lutador("Pretty boy", "França", 1.75f, 68.9f, 11, 2, 1, 31);
        l[1] = new Lutador("Putscript", "Brasil", 1.68f, 57.8f, 14, 2, 3, 29);
        l[2] = new Lutador("Snapshadow", "EUA", 1.65f, 80.9f, 12, 2, 1, 35);
        l[3] = new Lutador("Dead Code", "Austrália", 1.93f, 81.6f, 13, 0, 2, 28);
        l[4] = new Lutador("UFOCobol", "Brasil", 1.70f, 119.3f, 5, 4, 3, 37);
        l[5] = new Lutador("Patriiart", "Sérvia", 2.15f, 120.0f, 20, 0, 0, 34);

        l[3].status();
        l[5].status();
        l[5].setPeso(90.5f);
        l[5].status();
    }

}