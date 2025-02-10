package day_20;

import java.util.Scanner;

public class Travel {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Haben Sie einen gültigen Reisepass? (ja/nein)");
        String reisepassStatus = sc.nextLine().trim().toLowerCase();// JA Ja      ja

        double cost = 0;

        if (reisepassStatus.equals("ja")) {

            cost = 1000; // Basis Preis
            System.out.println("In welches Land möchten Sie reisen?");
            String countryName = sc.nextLine().trim().toLowerCase();

            System.out.println("Wie viele Gepackstücke nehmen Sie mit?");
            byte numberOfBags = sc.nextByte();
            cost += numberOfBags * 50;

            System.out.println("Mit wie viele Personen reisen Sie?");
            short numberOfPersons = sc.nextShort();
            int discount = numberOfPersons * 100;

            if (discount > 300) {
                discount = 300;
            }
            cost -= discount;

            System.out.println("Bitte geben Sie in einer Zeile die Namen der Personen ein");
            String personNames = sc.nextLine();

            System.out.println("Ihr Ticket wurde nach " + countryName + " gebucht. Wir haben einen Aufpreis für die " + numberOfBags
                    + " Gepackstücke berechnet, aber da Sie mit " + personNames + " reisen, gewahren wir einen Rabatt. Ihre Gesamtkosten betragt " + cost);


        } else if (reisepassStatus.equals("nein")) {
            cost = 200;
            System.out.println("Wie viele Jahre ist Ihr Reisepass abgelaufen?");
            int expiredYears = sc.nextInt();
            cost += expiredYears * 75;
            sc.nextLine();
            System.out.println("In welches Land plannen Sie zu reisen");
            String countryName = sc.nextLine().trim().toLowerCase();
            System.out.println("Werden Sie im nachsten Jahr reisen? (ja/nein)");
            String travelNextYear = sc.nextLine().trim().toLowerCase();
            if (travelNextYear.equals("ja")) {
                cost += 100;
            } else if (travelNextYear.equals("nein")) {
                cost -= 50;
            }
            System.out.println("Es sieht so aus, als ob Ihr Reisepass seit " + expiredYears +
                    " Jahren abgelaufen ist, aber keine Sorge, wir werden ihn für Sie erneuern, damit Sie nach "
                    + countryName + " reisen können. Ihre Gesamtkosten betragt " + cost);
        } else {
            System.out.println("Ungültige Eingabe");
        }

        sc.close();


    }


}
