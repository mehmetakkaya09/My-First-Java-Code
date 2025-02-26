package day_31.bank;

import java.util.ArrayList;

public class Bank {

    private String name;
    private String adresse;

    private ArrayList<Kunde> kunden;

    public Bank(String name, String adresse) {
        setName(name);
        setAdresse(adresse);
        kunden = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name.trim();
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse.trim();
    }

    public void addKunde(Kunde kunde){
        kunden.add(kunde);
    }

    public ArrayList<Kunde> getKunden() {
        return new ArrayList<>(kunden);
    }

    @Override
    public String toString() {
        String str = "Bankname: " + name + "\n"
                + "Bankadresse: " + adresse + "\n"
                + "Kunden der Bank\n"
                + "-------------------\n";

        for (Kunde kunde : kunden) {
            str += kunde + "\n";
        }

        return str;
//        return "Bank{" +
//                "name='" + name + '\'' +
//                ", adresse='" + adresse + '\'' +
//                '}';
    }
}
