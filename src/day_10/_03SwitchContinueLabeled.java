/*
 *
 *  *  * Copyright (c) 2023.
 *  *  * SDET JAVA-13 Java Core
 *  *  * Armada-prog
 *  *  * armada.dscrd@gmail.com
 *
 */

package day_10;

import java.util.Scanner;

public class _03SwitchContinueLabeled {
    public static void main(String[] args) {

        Scanner tastatur = new Scanner(System.in);
        int option;

        // Hauptmenü Label
        hauptmenü:
        while (true) {
            System.out.println("------------------------");
            System.out.println("-------Hauptmenü-------");
            System.out.println("1-Bankgeschäfte");
            System.out.println("2-Kreditkarten-Transaktionen");
            System.out.println("3-Programm beenden");
            System.out.println("------------------------");
            System.out.println();
            System.out.print("Ihre Wahl-----> ");
            option = tastatur.nextInt();

            switch (option) {
                case 1:
                    // Bankgeschäfte Label
                    bankgeschäfte:
                    while (true) {
                        System.out.println("-----Bankgeschäfte------");
                        System.out.println("1-Geld abheben");
                        System.out.println("2-Geld einzahlen");
                        System.out.println("3-Zurück zum Hauptmenü");
                        System.out.println();
                        System.out.print("Ihre Wahl----> ");
                        option = tastatur.nextInt();
                        switch (option) {
                            case 1:
                                System.out.print("Betrag zum Abheben---> ");
                                option = tastatur.nextInt();
                                System.out.println(option + " EUR wurden abgehoben.");
                                System.out.println();
                                continue;
                            case 2:
                                System.out.print("Betrag zum Einzahlen---> ");
                                option = tastatur.nextInt();
                                System.out.println(option + " EUR wurden eingezahlt.");
                                System.out.println();
                                continue;
                            case 3:
                                continue hauptmenü;
                            default:
                                System.out.println("<<<Falsche Wahl>>>");
                        }
                    }
                case 2:
                    // Kreditkarten-Transaktionen Label
                    kreditkarten:
                    while (true) {
                        System.out.println("-----Kreditkarten-Transaktionen------");
                        System.out.println("1-Kontoauszug anzeigen");
                        System.out.println("2-Kreditkartenrechnung bezahlen");
                        System.out.println("3-Zurück zum Hauptmenü");
                        System.out.println();
                        System.out.print("Ihre Wahl----> ");
                        option = tastatur.nextInt();

                        switch (option) {
                            case 1:
                                System.out.println("Der Kreditkarten-Kontoauszug wurde angezeigt.");
                                continue;
                            case 2:
                                while (true) {
                                    System.out.println("-----Schulden-Management------");
                                    System.out.println("1-Betrag eingeben und bezahlen");
                                    System.out.println("2-Vom Bankkonto bezahlen");
                                    System.out.println("3-Zurück zum Kreditkarten-Menü");
                                    System.out.println("4-Zurück zum Hauptmenü");
                                    System.out.println("5-Programm beenden");
                                    System.out.println();
                                    System.out.print("Ihre Wahl----> ");
                                    option = tastatur.nextInt();

                                    switch (option) {
                                        case 1:
                                            System.out.print("Geben Sie den zu zahlenden Betrag ein---> ");
                                            option = tastatur.nextInt();
                                            System.out.println(option + " EUR wurden für die Kreditkartenrechnung bezahlt.");
                                            System.out.println();
                                            continue;
                                        case 2:
                                            System.out.println("Die Kreditkartenrechnung wurde von Ihrem Bankkonto bezahlt.");
                                            continue;
                                        case 3:
                                            continue kreditkarten;
                                        case 4:
                                            continue hauptmenü;
                                        case 5:
                                            break hauptmenü;
                                        default:
                                            System.out.println("<<<Falsche Wahl>>>");
                                    }
                                }
                            case 3:
                                continue hauptmenü;
                            default:
                                System.out.println("<<<Falsche Wahl>>>");
                        }
                    }
                case 3:
                    break hauptmenü;
                default:
                    System.out.println("<<<Falsche Wahl>>>");
            }
        }
        System.out.println("Vielen Dank, dass Sie sich für unsere Bank entschieden haben.");





    }
}
