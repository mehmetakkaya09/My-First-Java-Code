package day_40.kuchen;

public class EinfacherKuchen extends BaseKuchen{
    public EinfacherKuchen(int mehl, int zucker, int eier, int milch, int öl) {
        super(mehl, zucker, eier, milch, öl);
    }

    @Override
    public void mischen() {
        System.out.println("Geben Sie diese Zutaten in die Rührschlüssel.");
        System.out.println("Mindestens 5 Münuten rühren!");
        System.out.println("Mehl      :" + getMehl());
        System.out.println("Zucker    :" + getZucker());
        System.out.println("Eier      :" + getEier());
        System.out.println("Milch     :" + getMilch());
        System.out.println("Öl        :" + getÖl());
        System.out.println("Alle Zutaten wurden gemischt!");
        setIstGemischt(true);
    }

    @Override
    public void backen() {
        if (getIstGemischt()) {
            System.out.println("Da Sie den Kuchen gemischt haben, können Sie ihn backen!");
        }else {
            System.out.println("Sie können den Kuchen nicht backen, da Sie ihn nicht gemischt haben!!");
            System.out.println("Mischen Sie zuerst!!");
        }
    }
}
