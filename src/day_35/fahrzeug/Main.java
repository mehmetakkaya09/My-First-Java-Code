package day_35.fahrzeug;

public class Main {

    public static void main(String[] args) {

        Fahrzeug fahrzeug = new Fahrzeug();
        Auto auto = new Auto();
        Flugzeug flugzeug = new Flugzeug();

        fahrzeug.marke = "unbekannt";
        //fahrzeug.anzahlTüren

        auto.marke = "Audi";
        auto.anzahlTüren = 5;
        auto.starten();
        auto.kofferraumÖffnen();

        flugzeug.marke = "Airbus";
        flugzeug.propellerGröße = 4;
        flugzeug.stoppen();
        flugzeug.druckTest();

        System.out.println(auto);
        System.out.println(flugzeug);


    }

}
