package Aula13B;

public class Aula013 {
    public static void main(String[] args) {
        Cachorro c = new Cachorro();
        Lobo l = new Lobo();

        c.reagir("Olá");
        c.reagir("Vai apanhar");
        c.reagir(11, 45);
        c.reagir(21, 00);
        c.reagir(false);
        c.reagir(2, 12.5f);
        c.reagir(17, 4.5f);
    }
}
