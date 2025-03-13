package day_40.kuchen;

public abstract class BaseKuchen {

    private int mehl;
    private int zucker;
    private int eier;
    private int milch;
    private int öl;
    private boolean istGemischt;

    public BaseKuchen(int mehl, int zucker, int eier, int milch, int öl) {
        this.mehl = mehl;
        this.zucker = zucker;
        this.eier = eier;
        this.milch = milch;
        this.öl = öl;
        this.istGemischt = false;
    }

    public boolean getIstGemischt() {
        return istGemischt;
    }

    public void setIstGemischt(boolean istGemischt) {
        this.istGemischt = istGemischt;
    }

    public int getMehl() {
        return mehl;
    }

    public void setMehl(int mehl) {
        this.mehl = mehl;
    }

    public int getZucker() {
        return zucker;
    }

    public void setZucker(int zucker) {
        this.zucker = zucker;
    }

    public int getEier() {
        return eier;
    }

    public void setEier(int eier) {
        this.eier = eier;
    }

    public int getMilch() {
        return milch;
    }

    public void setMilch(int milch) {
        this.milch = milch;
    }

    public int getÖl() {
        return öl;
    }

    public void setÖl(int öl) {
        this.öl = öl;
    }

    public abstract void mischen();
    public abstract void backen();

}
