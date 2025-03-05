package day_34.galerie;

import java.util.ArrayList;

public class Galerie {

    private String name;
    private String adresse;
    private ArrayList<Auto> autos; // a hat 6 autos. b hat 9 autos. c hat 3 autos...
    private ArrayList<Auto> verkaufteAutos; // a verkaufte 2 autos. b verkaufte 3 autos. c verkaufte 1 auto

    private static ArrayList<Auto> alleAutos; // gemeinsame List hat 18 autos
    private static ArrayList<Auto> alleVerkaufteAutos; // gemeinsam wurde 6 autos verkauft

    static {
        alleAutos = new ArrayList<>();
        alleVerkaufteAutos = new ArrayList<>();
    }

    {
        autos = new ArrayList<>();
        verkaufteAutos = new ArrayList<>();
        name = "unbekannt";
        adresse = "unbekannt";
    }

    public Galerie(String name, String adresse) {
        this.name = name;
        this.adresse = adresse;
    }

    public ArrayList<Auto> getAutos() {
        return new ArrayList<>(autos);
    }

    public ArrayList<Auto> getVerkaufteAutos() {
        return new ArrayList<>(verkaufteAutos);
    }

    public static ArrayList<Auto> getAlleAutos() {
        return new ArrayList<>(alleAutos);
    }

    public static ArrayList<Auto> getAlleVerkaufteAutos() {
        return alleVerkaufteAutos;
    }


    public void addAuto(Auto auto) {
        autos.add(auto);
        alleAutos.add(auto);
    }

    public void deleteAutoByVIN(long VIN) {
        if (autos.size() > 0) {
            for (Auto verkaufteAuto : autos) {
                if (verkaufteAuto.getVIN() == VIN) {
                    autos.remove(verkaufteAuto);
                    verkaufteAutos.add(verkaufteAuto);
                    break;
                }
            }
        }
        if (alleAutos.size() > 0) {
            for (Auto alleVerkaufteAuto : alleAutos) {
                if (alleVerkaufteAuto.getVIN() == VIN) {
                    alleAutos.remove(alleVerkaufteAuto);
                    alleVerkaufteAutos.add(alleVerkaufteAuto);
                    break;
                }
            }
        }
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    @Override
    public String toString() {
        return "Galerie{" +
                "name='" + name + '\'' +
                ", adresse='" + adresse + '\'' +
                '}';
    }
}
