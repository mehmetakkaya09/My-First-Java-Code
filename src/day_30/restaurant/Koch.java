package day_30.restaurant;

public class Koch {

    // name muss mindestens 2 Buchstaben und keine Sonderzeichen beinhalten
    // mitarbeiterID kann nur zwischen 2000 - 2999 sein
    // stundenlohn kann nicht negative sein

    private String name;
    private int mitarbeiterID;
    private double stundenlohn;
    private boolean vollzeit;

    public Koch(String name, int mitarbeiterID, double stundenlohn, boolean vollzeit) {
        setName(name);
        setMitarbeiterID(mitarbeiterID);
        setStundenlohn(stundenlohn);
        setVollzeit(vollzeit);
    }
//		        bestellungZubereiten(): Kochs Name + "bereitet eine Bestellung zu"
//		        geschirrWaschen(): Kochs Name + "wäscht das Geschirr"


    public void bestellungZubereiten(){
        System.out.println(name + " bereitet eine Bestellung zu");
    }

    public void geschirrWaschen(){
        System.out.println(name + " wäscht das Geschirr");
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMitarbeiterID() {
        return mitarbeiterID;
    }

    public void setMitarbeiterID(int mitarbeiterID) {
        this.mitarbeiterID = mitarbeiterID;
    }

    public double getStundenlohn() {
        return stundenlohn;
    }

    public void setStundenlohn(double stundenlohn) {
        this.stundenlohn = stundenlohn;
    }

    public boolean isVollzeit() {
        return vollzeit;
    }

    public void setVollzeit(boolean vollzeit) {
        this.vollzeit = vollzeit;
    }

    @Override
    public String toString() {
        return "Koch{" +
                "name='" + name + '\'' +
                ", mitarbeiterID=" + mitarbeiterID +
                ", stundenlohn=" + stundenlohn +
                ", Vollzeitstatus=" + (vollzeit ? "Vollzeit" : "Teilzeit") +
                '}';
    }
}
//1.2 Erstelle eine Klasse namens Koch
//
//		    Attribute:
//		        Name (String), MitarbeiterID (int), Stundenlohn (double), Vollzeit (boolean)
//
//		    Füge einen Konstruktor hinzu, um alle Felder zu setzen
//
//		    Aktionen: (alle void-Methoden)
//		        bestellungZubereiten(): Kochs Name + "bereitet eine Bestellung zu"
//		        geschirrWaschen(): Kochs Name + "wäscht das Geschirr"
//		        toString(): Gibt (String) alle Informationen eines Kochs zurück
//		            -> Extra: Für den Vollzeitstatus, anstelle eines booleschen Wertes, drucke "Vollzeit" oder "Teilzeit"