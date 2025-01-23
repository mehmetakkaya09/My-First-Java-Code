package day_09;

import java.util.Scanner;

public class _06ZahlenRateSpiel {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //System.out.println("Math.random() = " + (int) (Math.random() * (101 - 1) + 1));
        int zufallZahl = (int) (Math.random() * (101 - 1) + 1);
        //System.out.println("Zahl: " + zufallZahl);
        int tipp = 0;

        System.out.print("Ich habe eine Zahl gewahlt. Was ist Ihr Tipp? ");
        tipp = scanner.nextInt();

        int versuchAnzahl = 0;

        while (tipp != zufallZahl) {

            versuchAnzahl++;
            System.out.println("Ihr Tipp ist falsch! Nochmal versuchen!");

            if (tipp > zufallZahl) {
                System.out.println("Die Zahl, die Sie getippt haben, ist größer als meine Zahl.");
            } else {
                System.out.println("Die Zahl, die Sie getippt haben, ist kleiner als meine Zahl.");
            }
            System.out.print("Neuer Tipp : ");
            tipp = scanner.nextInt();
        }

        System.out.println("Herzlichen Glückwunsch! Sie haben richtig getippt. Sie haben es in " + versuchAnzahl + " Versuchen geschafft!");


    }


}
//Schreiben Sie ein Zahlenratespiel in Java, das folgende Bedingungen erfüllt:
//Das Programm wählt eine zufällige Zahl zwischen 1 und 100 aus.
//Der Benutzer muss diese Zahl erraten.
//Nach jedem falschen Tipp gibt das Programm einen Hinweis:
//Falls die eingegebene Zahl größer ist als die zufällige Zahl, soll die Meldung "Die Zahl, die Sie getippt haben, ist größer als meine Zahl." erscheinen.
//Falls die eingegebene Zahl kleiner ist als die zufällige Zahl, soll die Meldung "Die Zahl, die Sie getippt haben, ist kleiner als meine Zahl." erscheinen.
//Sobald der Benutzer die richtige Zahl erraten hat, gibt das Programm aus:
//"Herzlichen Glückwunsch! Sie haben richtig getippt."
//Das Programm soll auch anzeigen, wie viele Versuche der Benutzer benötigt hat.
