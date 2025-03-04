package day_34.galerie;

public class Auto {

    private String marke;
    private String modelle;
    private String farbe;
    private long VIN; // Vehicle Identifikation Nummer -- Fahrzeug-Identifikationsnummer
    private static long id;

    static {
        id = 1000000000;
    }

    {
        VIN = id++;
        marke = "unbekannt";
        modelle = "unbekannt";
        farbe = "unbekannt";
    }

    public Auto(String marke, String farbe, String modelle) {
        setMarke(marke);
        setFarbe(farbe);
        setModelle(modelle);
    }

    public String getMarke() {
        return marke;
    }

    public String getModelle() {
        return modelle;
    }

    public String getFarbe() {
        return farbe;
    }

    public long getVIN() {
        return VIN;
    }

    public void setMarke(String marke) {
        this.marke = marke;
    }

    public void setModelle(String modelle) {
        this.modelle = modelle;
    }

    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }

    @Override
    public String toString() {
        return "Auto{" +
                "marke='" + marke + '\'' +
                ", modelle='" + modelle + '\'' +
                ", farbe='" + farbe + '\'' +
                ", VIN=" + VIN +
                '}';
    }
}
