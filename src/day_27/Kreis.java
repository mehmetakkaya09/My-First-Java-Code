package day_27;

public class Kreis {

    public double radius; // 0
    public double höhe; // 0

    // driver



    // Java erstellt immer in dem Hintergrund ein Konstruktor
    // wir definieren nie ein return-type, nicht einmal void
    // Standard/Parameterlose Konstruktor
    public Kreis() {
        radius = 3.0;
    }

    // Konstruktor Overloading ist immer möglich
    public Kreis(double benutzerRadius){
        radius = benutzerRadius;
    }

    // this schlüsselwort verwendet man damit class fields definieren.
    public Kreis(double radius, double höhe){
        this.radius = radius;
        this.höhe = höhe;
    }

    public double getFlaeche(){
        //double radius = 9;
        return Math.pow(this.radius,2) * Math.PI;
    }
    // 2 * radius * pi
    public double getUmfang(){
        return 2 * this.radius * Math.PI;
    }

    // flaeche * höhe
    public double getVolumen(){
        return getFlaeche() * höhe;
    }




}
