package day_43.review;

import java.util.Scanner;

public class MeineEnums {
    enum Colors {
        BLAU, ROT, GELB, WEISS, SCHWARZ
    }

    enum Modelle{
        SLK200(3),
        S500(5),
        TRAVEGO(10);

        private int türAnzahl;

        Modelle(int türAnzahl){
            this.türAnzahl = türAnzahl;
        }

        public int getTürAnzahl() {
            return türAnzahl;
        }

        public void setTürAnzahl(int türAnzahl) {
            this.türAnzahl = türAnzahl;
        }
    }

    public static void main(String[] args) {
        System.out.println("Colors.SCHWARZ.name() = " + Colors.SCHWARZ.name());//name() gibt konstant als String zurück
        Colors value = Colors.valueOf("BLAU");// valueOf() nimmt ein String und gibt konstant zurück.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie ein Farbe ein (BLAU, ROT, GELB, WEISS, SCHWARZ) : ");
        //Colors color = Colors.valueOf(scanner.next());

        //System.out.println("color = " + color.name());

        System.out.println("Modelle.TRAVEGO.name() = " + Modelle.TRAVEGO.name());
        System.out.println("Modelle.S500.getTürAnzahl() = " + Modelle.S500.getTürAnzahl());

    }
}
