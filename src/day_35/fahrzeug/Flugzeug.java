package day_35.fahrzeug;

public class Flugzeug extends Fahrzeug{

    int propellerGröße;
    String motorTyp;

    public void druckTest() {
        System.out.println("Drucktest erledigt");
    }

    public void rollen() {
        System.out.println("Flugzeug rollt auf der Startbahn");
    }

    @Override
    public String toString() {
        return "Flugzeug{" +
                "propellerGröße=" + propellerGröße +
                ", motorTyp='" + motorTyp + '\'' +
                ", marke='" + marke + '\'' +
                ", modelle='" + modelle + '\'' +
                ", jahr=" + jahr +
                ", gewicht=" + gewicht +
                ", sitzplaetze=" + sitzplaetze +
                ", licht=" + licht +
                '}';
    }
}
//    int propellerGröße;
//    String motorTyp;
//
//druckTest();
//taxi();