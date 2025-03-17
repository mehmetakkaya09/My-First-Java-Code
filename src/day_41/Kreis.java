package day_41;

public class Kreis extends BaseForm implements Form{

    //Klassen sind Vorlage von Objekten
    private double radius;

    public Kreis(String farbe, double radius) {
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
