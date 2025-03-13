package day_40.kuchen;

public class EinfacherKuchen extends BaseKuchen{
    public EinfacherKuchen(int mehl, int zucker, int eier, int milch, int öl) {
        super(mehl, zucker, eier, milch, öl);
    }

    @Override
    public void mischen() {
        System.out.println("Geben Sie diese Zutaten in die Rührschlüssel.");
        System.out.println("Mindestens 5 Minuten rühren!");
        System.out.println("Mehl      :" + getMehl());
        System.out.println("Zucker    :" + getZucker());
        System.out.println("Eier      :" + getEier());
        System.out.println("Milch     :" + getMilch());
        System.out.println("Öl        :" + getÖl());
        System.out.println("Alle Zutaten wurden gemischt!");
        setIstGemischt(true);
    }


}
