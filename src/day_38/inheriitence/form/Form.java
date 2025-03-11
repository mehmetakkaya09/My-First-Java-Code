package day_38.inheriitence.form;

public class Form {

    private String farbe;

    //public Form() {}

    protected Form(String farbe){
        this.farbe = farbe;
        System.out.println("Innerhalb des Form-Constructor mit Farbe " + this.farbe);
    }

    public String getFarbe() {
        return farbe;
    }

    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }

    // override: gleiche Method mit unterschiedliche Implementationen in der Kinderklasse
    // Wir werden diese Method in Kinderklasse überschreiben (override)
    public void zeichnen() {
        System.out.println("Eine Form wird gezeichnet..");
    }

    public double flaecheBerechnen() {
        System.out.println("Berechnung der Flache der Form..");
        return 0;
    }

    @Override
    public String toString() {
        return "Form{" +
                "farbe='" + farbe + '\'' +
                '}';
    }

}
