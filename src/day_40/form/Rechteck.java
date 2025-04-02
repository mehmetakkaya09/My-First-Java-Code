package day_40.form;

public class Rechteck extends Form{

    public int laenge;
    public int breite;

    public Rechteck(int laenge, int breite) {
        super("Rechteck");
        this.laenge = laenge;
        this.breite = breite;
    }

    @Override
    public double umfang() {
        return 2 * (laenge + breite);
    }

    @Override
    public double flaeche() {
        return laenge * breite;
    }

    //public abstract double umfang2();
}
