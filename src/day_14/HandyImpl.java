package day_14;

public class HandyImpl {

    public static void main(String[] args) {
        Handy handy = new Handy();
        handy.marke = "Samsung";
        handy.modell = "600";
        handy.farbe = "Gold";
        handy.groesse = 6.4;
        handy.speicherKapazität = 8;
        handy.herstellungsJahr = 2023;

        handy.anruf();
        handy.nachrichtsenden();
        handy.fotoMachen();
        handy.mitInternetVerbinden();

        handy.getInfo();

    }
}

