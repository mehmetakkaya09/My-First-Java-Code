package day_30.restaurant;

public class Kellner {

    //Name (String), MitarbeiterID (int), Stundenlohn (double), Vollzeit (boolean)
    private String name;
    private int mitarbeiterID;
    private double stundenlohn;
    private boolean vollzeit;
    public Kellner(String name, int mitarbeiterID, double stundenlohn, boolean vollzeit) {
        setName(name);
        setMitarbeiterID(mitarbeiterID);
        setStundenlohn(stundenlohn);
        setVollzeit(vollzeit);
    }

//bestellungAufnehmen(): Kellners Name + "nimmt eine Bestellung auf"
//tischReinigen(): Kellners Name + "reinigt den Tisch"

    public void bestellungAufnehmen(){
        System.out.println(name + " nimmt eine Bestellung auf");
    }

    public void tischReinigen(){
        System.out.println(name + " reinigt den Tisch");
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
        return "Kellner{" +
                "name='" + name + '\'' +
                ", mitarbeiterID=" + mitarbeiterID +
                ", stundenlohn=" + stundenlohn +
                ", Vollzeitstatus=" + (vollzeit ? "Vollzeit" : "Teilzeit") +
                '}';
    }
}
//1.1 Erstelle eine Klasse namens Kellner
//
//Attribute:
//Name (String), MitarbeiterID (int), Stundenlohn (double), Vollzeit (boolean)
//
//Füge einen Konstruktor hinzu, um alle Felder zu setzen
//
//Aktionen: (alle void-Methoden)
//bestellungAufnehmen(): Kellners Name + "nimmt eine Bestellung auf"
//tischReinigen(): Kellners Name + "reinigt den Tisch"
//toString(): Gibt (String) alle Informationen eines Kellners zurück
//		            -> Extra: Für den Vollzeitstatus, anstelle eines booleschen Wertes, drucke "Vollzeit" oder "Teilzeit"
