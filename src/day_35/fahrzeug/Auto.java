package day_35.fahrzeug;

public class Auto extends Fahrzeug{

    int reifenGroesse;
    int anzahlTüren;

    public void hupen() {
        System.out.println("Auto hupt");
    }

    public void kofferraumÖffnen() {
        System.out.println("Kofferraum wurde geöffnet");
    }

    @Override
    public String toString() {
        return "Auto{" +
                "reifenGroesse=" + reifenGroesse +
                ", anzahlTüren=" + anzahlTüren +
                ", marke='" + marke + '\'' +
                ", modelle='" + modelle + '\'' +
                ", jahr=" + jahr +
                ", gewicht=" + gewicht +
                ", sitzplaetze=" + sitzplaetze +
                ", licht=" + licht +
                '}';
    }
}
//    int reifenGröße;
//    int anzahlTüren;
//
//hupen();
//kofferraumÖffnen();