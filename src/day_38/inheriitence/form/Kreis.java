package day_38.inheriitence.form;

public class Kreis extends Form {

    // wenn es in Elternklasse keine parameterlose Constructor gibt, muss man eine von parameterisierte Constuctor aufrufen
    private double radius;

    public Kreis(String farbe, double radius){
        super(farbe);
        this.radius = radius;
        System.out.println("Innerhalb des Kreis-Constructor mit Farbe " + super.getFarbe());
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    // private < default < protected < public
    // Überschriebene Method Access Modifier muss mit der Elternklassemethod Access Modifier gleich oder grosser sein
    @Override  // Das ist nicht obligatorisch. Aber man kann besser verstehen.
    public void zeichnen() {
        System.out.println("Eine Kreis wird gezeichnet..");
    }



    @Override // Annotation
    public double flaecheBerechnen() {
        return Math.PI * this.radius * this.radius;
    }

    @Override
    public String toString() {
        return "Kreis{" +
                "farbe='" + super.getFarbe() + '\'' +
                ", radius=" + radius +
                ", flaeche=" + flaecheBerechnen() +
                '}';
    }
}
