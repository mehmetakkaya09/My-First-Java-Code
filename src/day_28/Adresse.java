package day_28;

public class Adresse {

    public String bundesland;
    public String stadt;
    public String strasse;
    public int plz;

    public Adresse(String bundesland, String stadt, String strasse, int plz) {
        this.bundesland = bundesland;
        this.stadt = stadt;
        this.strasse = strasse;
        this.plz = plz;
    }

    @Override
    public String toString() {
        return "Adresse{" +
                "bundesland='" + bundesland + '\'' +
                ", stadt='" + stadt + '\'' +
                ", strasse='" + strasse + '\'' +
                ", plz=" + plz +
                '}';
    }
}
