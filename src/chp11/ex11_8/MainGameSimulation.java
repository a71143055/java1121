package chp11.ex11_8;

public class MainGameSimulation {
    public static void main(String[] args) {
        Knight atomic = new Knight("아토믹");
        Knight uther = new HolyKnight("우서");
        Knight genji = new MagicKnight("겐지");

        atomic.slash();
        uther.slash();
        genji.slash();

        Healer healer1 = (HolyKnight)uther;
        Healer healer2 = new HolyKnight("우서동생");

        healer1.heal();
        healer1.recovery();

        Magician magician1 = (MagicKnight)genji;
        magician1.magicShield();
        magician1.teleport();

        MagicKnight magicKnight = new MagicKnight("겐지동생");
        magicKnight.magicShield();
        magicKnight.teleport();
        magicKnight.slash();
    }
}
