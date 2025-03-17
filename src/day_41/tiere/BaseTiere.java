package day_41.tiere;

public abstract class BaseTiere {

    private String name;
    private int alter;
    private String farbe;

    public BaseTiere(String name, int alter, String farbe) {
        this.name = name;
        this.alter = alter;
        this.farbe = farbe;
    }


    public int getAlter() {
        return alter;
    }

    public void setAlter(int alter) {
        this.alter = alter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFarbe() {
        return farbe;
    }

    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }

    public abstract void essen();
    public abstract void trinken();
    public abstract void schlafen();
}
