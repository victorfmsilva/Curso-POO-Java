package Aula07B;

public class UltraEmojiCombat {
    public static void main(String[] args) {
        Lutador l[] = new Lutador[4];
        l[0] = new Lutador("Pretty Boy", "França", 31, 1.75f, 68.9f, 11,3,1);

        l[1] = new Lutador("Puts Script", "Brasil", 29, 1.68f, 57.8f, 14,2,3);

        l[2] = new Lutador("Snapshadow", "Eua", 35, 1.65f, 80.9f, 12,2,1);

        l[3] = new Lutador("Dead Code", "Australia", 28, 1.93f, 81.6f, 13,0,2);

        Luta UEC01 = new Luta();
        UEC01.marcarLuta(l[3],l[2]);
        UEC01.lutar();
        l[1].Status();
        l[2].Status();
    }
}
