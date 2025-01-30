package day_14;

public class Handy {

    //marke
    //modell
    //farbe
    //grosse
    //speicherKapazitat
    //herstellungsjahr

    //anrufen()
    //nachrichtSenden()
    //fotoMachen()
    //mitInternetVerbinden()
    //getPhoneInfo()

    String marke;
    String modell;
    String farbe;
    int preis;
    double groesse;
    int speicherKapazität;
    int herstellungsJahr;


    public void getInfo() {

        System.out.println("Marke: " + marke);
        System.out.println("Model: " + modell);
        System.out.println("Farbe: " + farbe);
        System.out.println("Große: " + groesse + "cm");
        System.out.println("Speicherkapazität: " + speicherKapazität + "GB");
        System.out.println("Herstelungsjahr: " + herstellungsJahr);


    }
    public void anruf() {
        System.out.println("Anruf wird gestartet");
    }
    public void nachrichtsenden() {
        System.out.println("Nachricht wird gesendet");
    }
    public void fotoMachen() {
        System.out.println("Foto wird gemacht");
    }
    public void mitInternetVerbinden() {
        System.out.println("Internetverbindung wird aufgebaut");
    }


}
