package day_31.bank;

import java.util.ArrayList;
import java.util.Arrays;

public class Konto {

    private String kontoTyp;         // TL, DOLLAR, EURO
    private String kontoNummer;
    private double guthaben;
    private boolean istVerfügbar;

    private ArrayList<String> typen = new ArrayList<>(Arrays.asList("TL", "DOLLAR", "EURO"));

    public Konto(String kontoTyp, String kontoNummer, double guthaben) {
        setKontoTyp(kontoTyp);
        setKontoNummer(kontoNummer);
        setGuthaben(guthaben);
    }

    public ArrayList<String> getTypen() {
        return new ArrayList<>(typen);
    }

//    public void getTypen(){
//        for (String typ : typen) {
//            System.out.println(typ);
//        }
//    }

    public String getKontoTyp() {
        return kontoTyp;
    }

    // kontotyp darf nicht null sein und nur nach "typen ArrayList" erstellt werden
    public void setKontoTyp(String kontoTyp) {
        if (kontoTyp != null && typen.contains(kontoTyp.toUpperCase())) {
            this.kontoTyp = kontoTyp;
            istVerfügbar = true;
        } else {
            System.out.println(kontoTyp + " ist nicht ein gültiger Kontotyp");
            System.out.println("Verfügbare Kontotypen: " + typen);
        }
    }

    public String getKontoNummer() {
        return kontoNummer;
    }

    // wenn kontotyp nicht verfügbar ist darf Kunde kontonummer nicht definieren
    public void setKontoNummer(String kontoNummer) {
        if (istVerfügbar) {
            this.kontoNummer = kontoNummer;
        }
    }

    public double getGuthaben() {
        return guthaben;
    }

    // wenn kontotyp nicht verfügbar ist darf Kunde guthaben nicht definieren
    // guthaben muss positive sein
    public void setGuthaben(double guthaben) {
        if (guthaben >= 0 && istVerfügbar) {
            this.guthaben += guthaben;
        }
    }

    public void einzahlen(double betrag) {
        if (betrag > 0) {
            guthaben += betrag;
        }
    }

    public void abheben(double betrag) {
        if (betrag > 0 && betrag <= guthaben) {
            guthaben -= betrag;
        }
    }

    @Override
    public String toString() {
        return "Konto{" +
                "kontoTyp='" + kontoTyp + '\'' +
                ", kontoNummer='" + kontoNummer + '\'' +
                ", guthaben=" + guthaben +
                '}';
    }



}
