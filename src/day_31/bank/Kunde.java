package day_31.bank;

import java.util.ArrayList;

public class Kunde {

    private String name;
    private ArrayList<Konto> konten;

    public Kunde(String name) {
        setName(name);
        konten = new ArrayList<>();
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        name = name.trim();
        if (name.length() > 1) {
            for (int i = 0; i < name.length(); i++) {
                if (!Character.isLetterOrDigit(name.charAt(i))) {
                    return;
                }
            }
        }
        this.name = name;
    }

    public ArrayList<Konto> getKonten() {
        return new ArrayList<>(konten);
    }

    public void einzahlen(Konto konto, double betrag){
        konto.setGuthaben(betrag);
    }

    public void abheben(Konto konto, double betrag){
        konto.abheben(betrag);
    }

    public void addKonto(Konto konto){
        konten.add(konto);
    }

    @Override
    public String toString() {
        String str = "Name: " + name + "\n" +
                "Konten des Kunden \n" +
                "-------------------\n";
        for (Konto konto : konten) {
            str += konto + "\n";
        }
        return str;
    }
}
