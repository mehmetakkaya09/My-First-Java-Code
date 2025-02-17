package day_25;

public class _03Einkaufswagen {

    public static void main(String[] args) {

        // produktName, menge, preis, hatRabatt, rabattProzent
        String produktName = "";
        double menge = 0;
        double preis = 0;
        boolean hatRabatte = false;
        int rabattProzent = 0;
        // produktPreis, rabattierterProduktPreis, gesamtBonBetrag, gesamtBetrag, gesamtRabattBetrag
        double produktPreis = 0;
        double rabattierterProduktPreis = 0;
        double gesamtBonBetrag = 0;
        double gesamtBetrag = 0;
        double gesamtRabattBetrag = 0;

        String[] warenkorb = new String[3];

        String produkt1 = "Apfel,2,3,false,10";   // csv
        String produkt2 = "Kase,1,5,true,20";
        String produkt3 = "Oliven,5,2,true,15";

        warenkorb[0] = produkt1;
        warenkorb[1] = produkt2;
        warenkorb[2] = produkt3;

        for (String produkt : warenkorb) {

            String[] str = produkt.split(",");
            produktName = str[0];
            menge = Double.parseDouble(str[1]);
            preis = Double.parseDouble(str[2]);
            hatRabatte = Boolean.parseBoolean(str[3]);
            rabattProzent = Integer.parseInt(str[4]);

            // preis ohne Rabatt
            produktPreis = menge * preis;

            //summe alle produkte ohne Rabatt
            gesamtBetrag += produktPreis;

            if (hatRabatte) {
                rabattierterProduktPreis = produktPreis - (produktPreis * rabattProzent) / 100;
                gesamtRabattBetrag += rabattierterProduktPreis;
            } else {
                rabattierterProduktPreis = produktPreis;
                gesamtRabattBetrag += produktPreis;
            }

            System.out.println("Produktname: " + produktName);
            System.out.println("Menge: " + menge);
            System.out.println("Preis: " + preis);
            System.out.println("HatRabatte: " + hatRabatte);
            System.out.println("RabattProzent: " + rabattProzent);
            System.out.println("ProduktPreis: " + produktPreis);
            System.out.println("rabattierterProduktPreis: " + rabattierterProduktPreis);
            System.out.println("-----------------------------");


        }
        gesamtBonBetrag = gesamtBetrag - gesamtRabattBetrag;

        System.out.println("Gesamtbetrag der Produkte    : " + gesamtBetrag + " EUR");
        System.out.println("GesamtrabattBetrag           : " + gesamtRabattBetrag + " EUR");
        System.out.println("Gesamtbetrag des Einkaufs    : " + gesamtBonBetrag + " EUR");


    }


}
