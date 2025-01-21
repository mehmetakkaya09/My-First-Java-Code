package day_04;

public class _05Homework {
    public static void main(String[] args) {

        // Wir haben eine bestimmte Anzahl von 5kg- und 1kg-Mehlpaketen zur Verfügung.
        // Schreiben Sie ein Programm, das ermittelt, ob wir die vom Kunden gewünschte Anzahl von Kilopackungen liefern können.

        int fünfKgPakette = 2;
        int einKgPakette = 5;
        int bedarf = 19;

        boolean isOk = false;

        if ((fünfKgPakette * 5 + einKgPakette) >= bedarf) {
            isOk = true;
        }

        if (isOk) {
            System.out.println("Paket ist bereits!");
        } else {
            System.out.println("Paket ist nicht bereits!");
        }


        int year = 3;

        double gehalt = 1000;

        if (year >= 10) {
            gehalt += gehalt * 20 / 100;
        } else if (year >= 5 && year <= 9) {
            gehalt += gehalt * 15 / 100;
        } else if (year >= 1 && year <= 4) {
            gehalt += gehalt * 10 / 100;
        }

        System.out.println("Gehalt: " + gehalt);



/*
Gehaltserhöhung berechnen

Berechnen Sie die Gehaltserhöhung basierend auf den Arbeitsjahren:
- 10 Jahre oder mehr → 20 % Erhöhung
- 5-9 Jahre → 15 % Erhöhung
- 1-4 Jahre → 10 % Erhöhung
- Neuanfänger (0 Jahre) → Keine Erhöhung
Das neue Gehalt auf dem Console ausgeben.
 */


    }
}
