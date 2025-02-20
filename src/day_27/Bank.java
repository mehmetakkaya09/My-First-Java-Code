package day_27;

import java.util.ArrayList;

public class Bank {

    public String name;
    public String adresse;
    public int kontoNummer;
    public ArrayList<Kunde> kunden;

    public Bank() {
        name = "namenlose Bank";
        adresse = "unbekannt";
        kontoNummer = 1000;
        kunden = new ArrayList<>();
    }

    public Bank(String name, String adresse, int kontoNummer) {
        this.name = name;
        this.adresse = adresse;
        this.kontoNummer = kontoNummer;
        kunden = new ArrayList<>();
    }

    public void kundeHinzufügen(Kunde kunde) {
        this.kontoNummer++;
        kunde.kontoNummer = this.kontoNummer;
        kunden.add(kunde);
        System.out.println("Für den Kunden " + kunde.name + " " + kunde.nachname + " wurde ein Bankkonto mit der Kontonummer " + kunde.kontoNummer + " eröffnet.");
    }

    public void kundenListe() {
        for (Kunde kunde : kunden) {
            System.out.println("kunde.name = " + kunde.name);
            System.out.println("kunde.nachname = " + kunde.nachname);
            System.out.println("kunde.kontoNummer = " + kunde.kontoNummer);
            System.out.println("kunde.kontostand = " + kunde.kontostand);
            System.out.println("kunde.telefonnummer = " + kunde.telefonnummer);
            System.out.println("------------------------------");
        }
    }

    public void geldEinzahlen(Kunde kunde, double betrag) {
        if (betrag > 0){
            kunde.kontostand += betrag;
        }else {
            System.out.println("Bitte geben Sie ein pozitives Zahl");
        }
    }

    public void geldAbheben(Kunde kunde, double betrag){
        if (betrag > 0 && kunde.kontostand >= betrag) {
            kunde.kontostand -= betrag;
        }else {
            System.out.println("Ihre Kontostand ist nicht ausreichend!!");
            System.out.println("Sie können maximal " + kunde.kontostand + " Euro abheben!");
        }
    }



}
