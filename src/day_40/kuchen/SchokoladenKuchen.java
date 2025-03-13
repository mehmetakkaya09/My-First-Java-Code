package day_40.kuchen;

public class SchokoladenKuchen extends BaseKuchen {
    private int schokolade;
    public SchokoladenKuchen(int mehl, int zucker, int eier, int milch, int öl, int schokolade) {
        super(mehl, zucker, eier, milch, öl);
        this.schokolade = schokolade;
    }

    public int getSchokolade() {
        return schokolade;
    }

    public void setSchokolade(int schokolade) {
        this.schokolade = schokolade;
    }

    @Override
    public void mischen() {
        System.out.println("Geben Sie diese Zutaten in die Rührschlüssel.");
        System.out.println("Mindestens 5 Minuten rühren!");
        System.out.println("Mehl        : " + getMehl());
        System.out.println("Zucker      : " + getZucker());
        System.out.println("Eier        : " + getEier());
        System.out.println("Milch       : " + getMilch());
        System.out.println("Öl          : " + getÖl());
        System.out.println("Schokolade  : " + getSchokolade());

        System.out.println("Nach gründlichem Rühren Schokolade hinzufügen : " + getSchokolade());
        System.out.println("Alle Zutaten wurden gemischt!");
        setIstGemischt(true);
    }

}
