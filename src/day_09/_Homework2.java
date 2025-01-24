package day_09;

import java.util.Scanner;

public class _Homework2 {

    public static void main(String[] args) {

        // bekommen von Benutzer Frageanzahl
        // 2 nummer erstellen 3 * 4;
        // stellen die mult Frage zu Benutzer
        // wenn es richtig, erhöht richtigeAntwort zahl
        // wenn es falsch, erhöht falscheAntwort zahl
        // dauern Frage bis zum Ende
        // in Console r und f anwort zahlen ausgeben

        int anzahlFragen = 0;
        int antwort = 0;
        int richtigeAntwortAnzahl = 0;
        int falscheAntwortAnzahl = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Wie viele Fragen möchtest du erstellen? ");
        anzahlFragen = input.nextInt();

        int zahler = 0;

        while (zahler < anzahlFragen) {
            int num1 = (int) (Math.random() * 10 + 1);
            int num2 = (int) (Math.random() * 10 + 1);

            zahler++;

            System.out.println(zahler + ". Frage ---> " + num1 + " * " + num2 + " = ?");
            System.out.print("Ihre Antwort ---> ");
            antwort = input.nextInt();

            if (antwort == (num1 * num2)) {
                System.out.println("Ihre Antwort ist richtig!");
                richtigeAntwortAnzahl++;
            } else {
                System.out.println("Ihre Antwort ist falsch!");
                falscheAntwortAnzahl++;
            }
        }

        System.out.println("richtigeAntwortAnzahl = " + richtigeAntwortAnzahl);
        System.out.println("falscheAntwortAnzahl = " + falscheAntwortAnzahl);


    }

}
