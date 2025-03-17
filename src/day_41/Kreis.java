package day_41;

import day_41.enumeration.Farbe;

public class Kreis extends BaseForm implements Form{

    //Klassen sind Vorlage von Objekten
    private double radius;

    public Kreis(Farbe farbe, double radius) {
        super("Kreis", farbe);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double umfang(){
       return 2 * (PI * radius);
    }

    public double flaeche(){
        return PI * (radius * radius);
    }
}
