package day_35.fahrzeug;

public class Fahrzeug {

    // DRY Prinzip

    String marke;
    String modelle;
    int jahr;
    double gewicht;
    int sitzplaetze;
    boolean licht;

    public void starten() {
        System.out.println("Fahrzeug ist gestartet");
    }

    public void stoppen() {
        System.out.println("Fahrzeug ist gestoppt");
    }

    public void bewegen() {
        System.out.println("Fahrzeug ist in Bewegung");
    }

    @Override
    public String toString() {
        return "Fahrzeug{" +
                "marke='" + marke + '\'' +
                ", modelle='" + modelle + '\'' +
                ", jahr=" + jahr +
                ", gewicht=" + gewicht +
                ", sitzplaetze=" + sitzplaetze +
                ", licht=" + licht +
                '}';
    }
}
//   String marke;
//    String modelle;
//    int jahr;
//    double gewicht;
//    int sitzplätze;
//    boolean licht;
//
//starten();
//stoppen();
//bewegen();