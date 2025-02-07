package day_20;

import java.util.Random;

public class _02RandomPasswort {

    public static void main(String[] args) {

        // method schreiben, der ein zufalliges Passwort mit 12 Zeichen generiert.

        String zeichen = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!@#$%^&*()";
        int passwortLength = 12;

        String passwort = generateRandomPasswort(passwortLength, zeichen);
        System.out.println("passwort = " + passwort);

    }

    public static String generateRandomPasswort(int passwortLength, String zeichen) {

        String passwort = "";

        // wir können auf jeden Fall ein zufallige Index definieren
        // wir werden danach diese index char zu passwort hinzufügen.

        Random random = new Random();

        for (int i = 0; i < passwortLength; i++) {
            int index =  random.nextInt(zeichen.length());
            passwort += zeichen.charAt(index);
        }
        return passwort;
    }



}
