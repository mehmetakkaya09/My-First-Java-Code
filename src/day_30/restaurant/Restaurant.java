package day_30.restaurant;

import java.util.ArrayList;

public class Restaurant {

    // besitzer muss mindestens 2 Buchstaben und keine Sonderzeichen beinhalten
    // standort muss mindestens 2 Buchstaben und keine Sonderzeichen beinhalten
    // sterneAnzahl  kann nur zwischen 1 - 5 sein

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

    public void addKellner(Kellner kellner){
        kellners.add(kellner);
    }

    public void addKellner(Kellner[] kellnerArr){
        for (Kellner kellner : kellnerArr) {
            kellners.add(kellner);
        }
    }

    public void addKoch(Koch koch){
        kochers.add(koch);
    }

    public void addKoch(Koch[] kochArr){
        for (Koch koch : kochArr) {
            kochers.add(koch);
        }
    }

    public void removeKoch(int mitarbeiterID){
        for (int i = 0; i < kochers.size(); i++) {
            if (kochers.get(i).getMitarbeiterID() == mitarbeiterID) {
                kochers.remove(i);
                break;
            }
        }
    }

    public void removeKellner(int mitarbeiterID){
        for (int i = 0; i < kellners.size(); i++) {
            if (kellners.get(i).getMitarbeiterID() == mitarbeiterID) {
                kellners.remove(i);
                break;
            }
        }
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "besitzer='" + besitzer + '\'' +
                ", standort='" + standort + '\'' +
                ", sterneAnzahl=" + sterneAnzahl +
                ", kellnersAnzahl=" + kellners.size() +
                ", kochersAnzahl=" + kochers.size() +
                '}';
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
