package day_32;

import java.util.ArrayList;

public class Laender {

    String name;
    String landCode;
    int telCode;
    static int laenderZaehler;//4
    int dummyZaehler;//0
    static ArrayList<String> staticLaendern = new ArrayList<>();
    ArrayList<String> instanceLaendern = new ArrayList<>();


    public Laender(String name, String landCode, int telCode) {
        laenderZaehler++;
        dummyZaehler++;
        this.name = name;
        this.landCode = landCode;
        this.telCode = telCode;
    }

    public void addLaender(String laender) {
        staticLaendern.add(laender);
        instanceLaendern.add(laender);
    }

    @Override
    public String toString() {
        return "Laender{" +
                "name='" + name + '\'' +
                ", landCode='" + landCode + '\'' +
                ", telCode=" + telCode +
                ", laenderZaehler=" + laenderZaehler +
                ", dummyZaehler=" + dummyZaehler +
                '}';
    }
}
