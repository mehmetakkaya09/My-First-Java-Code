package day_20;

import java.util.Random;
import java.util.Scanner;

public class _01MünzwurfSpiel {

    public static void main(String[] args) {

        // wir werden zu Benutzer Ihre Vorhersage fragen  kopf / zahl
        // wir werden unsere Münzwurfspiel ausführen
        // wir werden Ergebnis zeigen
        // 5 mal werden wir gleiche Frage und Process ausführen
        // am Ende werden wir total Ergebnis zeigen

        // 3 / 5

        int runde = 5;
        int punktzahl = 0;


    }

    public static void spielSpielen(int runde, int punktzahl) {

        for (int i = 1; i <= runde; i++) {
            System.out.println(runde + ". Runde: Bitte gib deine Vorhersage ein:");
            String benutzerVorhersage = gibVorhersageEin();
            String münzwurf = führeMünzwurfSpielAus();

        }
    }

    public static String gibVorhersageEin(){
        System.out.println("******** Willkommen beim Münzwurf-Spiel **********");
        System.out.println("Gib bei jedem Wurf 'kopf' oder 'zahl' als Vorhersage ein");// KOPF
        Scanner scanner = new Scanner(System.in);
        String vorhersage = scanner.nextLine().toLowerCase().trim();
        return vorhersage;
    }

    public static String führeMünzwurfSpielAus(){
        Random r = new Random();
        int ergebnis = r.nextInt(2);
        String münzwurf = "";
//        if (ergebnis==0) {
//            münzwurf = "kopf";
//        }else {
//            münzwurf = "zahl";
//        }

        münzwurf = (ergebnis==0) ? "kopf" : "zahl";

        System.out.println("Ergebnis des Münzwurfs: " + münzwurf);

        return münzwurf;

    }




}
