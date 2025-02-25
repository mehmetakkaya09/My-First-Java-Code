package day_30.restaurant;

import java.util.ArrayList;

public class Restaurant {

    private String besitzer;
    private String standort;
    private int sterneAnzahl;
    private ArrayList<Kellner> kellners = new ArrayList<>();
    private ArrayList<Koch> kochers = new ArrayList<>();

    public Restaurant(String besitzer, String standort, int sterneAnzahl) {
        setBesitzer(besitzer);
        setStandort(standort);
        setSterneAnzahl(sterneAnzahl);
    }

    public String getBesitzer() {
        return besitzer;
    }

    public void setBesitzer(String besitzer) {
        this.besitzer = besitzer;
    }

    public String getStandort() {
        return standort;
    }

    public void setStandort(String standort) {
        this.standort = standort;
    }

    public int getSterneAnzahl() {
        return sterneAnzahl;
    }

    public void setSterneAnzahl(int sterneAnzahl) {
        this.sterneAnzahl = sterneAnzahl;
    }

}

//Attribute:
//		        Besitzer (String), Standort (String), Anzahl der Sterne (int)
//		        Kellner (ArrayList von Kellner-Objekten)
//		        Köche (ArrayList von Koch-Objekten)
//
//		    Füge einen Konstruktor hinzu, der den Besitzer, den Standort und die Anzahl der Sterne setzt.
//
//		    Aktionen: (alle void-Methoden)
//
//		        kellnerEinstellen(Kellner kellner): akzeptiert ein Kellner-Objekt und fügt es der ArrayList "Kellner" hinzu
//		        kellnerEinstellen(Kellner [] kellner): akzeptiert ein Array von Kellner-Objekten und fügt alle der ArrayList "Kellner" hinzu
//
//		        kochEinstellen(Koch koch): akzeptiert ein Koch-Objekt und fügt es der ArrayList "Köche" hinzu
//		        kochEinstellen(Koch [] köche): akzeptiert ein Array von Koch-Objekten und fügt alle der ArrayList "Köche" hinzu
//
//		        kochEntlassen(int mitarbeiterID): entfernt den Koch mit der übereinstimmenden ID aus der ArrayList "Köche"
//		        kellnerEntlassen(int mitarbeiterID): entfernt den Kellner mit der übereinstimmenden ID aus der ArrayList "Kellner"
//
//		        toString(): Gibt (String) alle Informationen eines Restaurant-Objekts zurück. Es ist nicht nötig, die gesamte Liste der Kellner oder Köche auszugeben. Gib die Anzahl der Kellner und Köche zusammen mit den anderen Informationen aus.
//
