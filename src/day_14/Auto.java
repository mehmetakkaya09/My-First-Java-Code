package day_14;

public class Auto {

    //class fields ... instances

    String farbe;
    String marke;
    String antrieb;
    int bauJahr;
    int türNummer;
    int serienNummer;
    int geschwindigkeit;
    boolean istDefekt;

    // kann 50 km/h fahren
    // kann 80 km/h fahren

    public void getInfo() {
        System.out.println("farbe: " + farbe);
        System.out.println("marke: " + marke);
        System.out.println("antrieb: " + antrieb);
        System.out.println("bauJahr: " + bauJahr);
        System.out.println("türNummer: " + türNummer);
        System.out.println("serienNummer: " + serienNummer);
        System.out.println("geschwindigkeit: " + geschwindigkeit);
        System.out.println("istDefekt: " + istDefekt);
    }

    public void fahren() {
        System.out.println("Das Auto faehrt " + geschwindigkeit + " km/h");
    }

    public void beschleunigen() {
        geschwindigkeit += 10;
    }

    public void bremsen(){
        geschwindigkeit -= 10;
    }

}


//Anmelde Formular
//

//vorname
//nachname
//alt
//stadt

//unterrichten
//aufgaben
//essen
//trinken


// sureyya  vadim   blagoja
// nnnnn    bbbbb  vvvvvv
// 34        23    33
// a         f      k

