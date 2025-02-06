package day_18;

import java.util.Random;
import java.util.Scanner;

public class _05AskLetter {

    public static void main(String[] args) {

        // nachname 1 Buchstabe fragen
        // als CC arbeiter müssen wir nur dieses Buchstabe sehen und anders soll * sein

        // random zufallzahl müssen wir erstellen
        // wir müssen ausser dieser zufallzahl index Buchstabe alles als * ausgeben

        String lastname = "akkaya";

        Random rand = new Random();

        int letterIndex = rand.nextInt(lastname.length());

        System.out.println(letterIndex + ". letter");
        String resultStr = "";

        for (int i = 0; i < lastname.length(); i++) {
            if (i == letterIndex) {
                resultStr += lastname.charAt(i);
                continue;
            }
            resultStr += "*";
        }

        System.out.println(resultStr);

    }


}
