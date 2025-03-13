package day_40.form;

public class Kreis extends Form{

    double radius;

    public Kreis(double radius){
        super("Kreis");
        this.radius = radius;
    }

    @Override
    public double umfang() {
        return 2 * radius * Math.PI;
    }

    @Override
    public double flaeche() {
        return radius * radius * Math.PI;
    }


}
