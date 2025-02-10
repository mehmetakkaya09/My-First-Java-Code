package day_21;

import java.util.Scanner;

public class _08SearchProdukt {

    public static void main(String[] args) {


        // Schreiben Sie ein Programm, das ein Produkt vom Benutzer entgegennimmt und überprüft,
        // ob das Produkt in der Array vorhanden ist

        //String[] produkte = {"Apfel", "Birne", "Banane", "Wassermelone", "Pfirsich"};

        // von Benutzer Produktname bekommen

        // danach sollen Sie diese Produkt mit anderer Produkte vergleichen.

        String[] produkte = {"Apfel", "Birne", "Banane", "Wassermelone", "Pfirsich"};

        System.out.println("Bitte geben Sie das Produkt ein, das Sie suchen!");
        Scanner sc = new Scanner(System.in);
        String gesuchtesProdukt = sc.nextLine();

        boolean gefunden = false;

        for (int i = 0; i < produkte.length; i++) {
            if (produkte[i].toUpperCase().equals(gesuchtesProdukt.toUpperCase())) {
                gefunden = true;
                break;
            }
        }

        if (gefunden) {
            System.out.println("Das gesuchte Produkt ist vorhanden.");
        } else {
            System.out.println("Das gesuchte Produkt ist nicht vorhanden.");
        }










    }



}
