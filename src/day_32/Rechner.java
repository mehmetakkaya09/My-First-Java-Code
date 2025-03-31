package day_32;

public class Rechner {

    int num1; // für objekten
    int num2;

    private Rechner(){}


    // weil instances zur Objekten gehören, können sie in static methoden nicht benutzen
    public static int addieren(int zahl1, int zahl2) {  // für alle Klasse
        return zahl1 + zahl2;
    }

    public static int subtrahieren(int zahl1, int zahl2) {
        return zahl1 - zahl2;
    }

    public static int multiplizieren(int zahl1, int zahl2) {
        //Math.pow(2,4);
        return zahl1 * zahl2;
    }

    public static int dividieren(int zahl1, int zahl2) {
        return zahl1 / zahl2;
    }





}
