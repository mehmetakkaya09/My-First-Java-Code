package day_38.inheriitence.form;

public class Rechteck extends Form{

    private double laenge;
    private double breite;
    public Rechteck(String farbe, double laenge, double breite) {
        super(farbe);
        this.laenge = laenge;
        this.breite = breite;
    }

    public double getLaenge() {
        return laenge;
    }

    public void setLaenge(double laenge) {
        this.laenge = laenge;
    }

    public double getBreite() {
        return breite;
    }

    public void setBreite(double breite) {
        this.breite = breite;
    }

    //Implementieren Sie beide Methoden je nach richtige Form

    @Override
    public void zeichnen() {
        System.out.println("Eine Rechteck wird gezeichnet..");
    }

    // laange * breite
    @Override
    public double flaecheBerechnen() {
        return this.laenge * this.breite;
    }

    // fügen Sie Farbeinfo und Flaecheinfo hinzu
    @Override
    public String toString() {
        return "Rechteck{" +
                "laenge=" + laenge +
                ", breite=" + breite +
                ", farbe=" + super.getFarbe() +
                ", flaeche=" + flaecheBerechnen() +
                '}';
    }
}
