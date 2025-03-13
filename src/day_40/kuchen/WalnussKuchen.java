package day_40.kuchen;

public class WalnussKuchen extends BaseKuchen {

    private int walnuss;

    public WalnussKuchen(int mehl, int zucker, int eier, int milch, int öl, int walnuss) {
        super(mehl, zucker, eier, milch, öl);
        this.walnuss = walnuss;


    }

    public int getWalnuss() {
        return walnuss;
    }

    public void setWalnuss(int walnuss) {
        this.walnuss = walnuss;
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
        System.out.println("Walnuss  : " + getWalnuss());

        System.out.println("Nach gründlichem Rühren Walnuss hinzufügen : " + getWalnuss());
        System.out.println("Alle Zutaten wurden gemischt!");
        setIstGemischt(true);
    }
}