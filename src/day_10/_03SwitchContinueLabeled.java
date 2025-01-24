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




        //Switch case yapısı içerisinde Labeled ifadeler ve break ve continue branching ifadelerinin kullanımına örnek kod
        /*
        Labels
            -anaMenu
            -bankaIslemler
            -krediIslemler
         */
//        Scanner klavye = new Scanner(System.in);
//        int secenek;
//
//        //anaMenu Label
//        anaMenu:
//        while (true) {
//            System.out.println("------------------------");
//            System.out.println("-------Ana Menu---------");
//            System.out.println("1-Bankacılık işlemleri");
//            System.out.println("2-Kredi kartı işlemleri");
//            System.out.println("3-Programdan çıkış");
//            System.out.println("------------------------");
//            System.out.println();
//            System.out.print("Seçeneğiniz-----> ");
//            secenek = klavye.nextInt();
//
//            switch (secenek) {
//                case 1:
//                    //bankaIslemler Label
//                    bankaIslemler:
//                    while (true) {
//                        System.out.println("-----Bankacılık işlemleri------");
//                        System.out.println("1-Para çekme");
//                        System .out.println("2-Para yatırma");
//                        System.out.println("3-Ana menu");
//                        System.out.println();
//                        System.out.print("Seçeneğiniz----> ");
//                        secenek = klavye.nextInt();
//                        switch (secenek) {
//                            case 1:
//                                System.out.print("Çekeceğiniz tutar---> ");
//                                secenek = klavye.nextInt();
//                                System.out.println(secenek + " TL Para çekme işlemi gerçekleşti.");
//                                System.out.println();
//                                continue;
//                            case 2:
//                                System.out.print("Yatıracağınız tutar---> ");
//                                secenek = klavye.nextInt();
//                                System.out.println(secenek + " TL Para yatırma işlemi gerçekleşti.");
//                                System.out.println();
//                                continue;
//                            case 3:
//                                continue anaMenu;
//                            default:
//                                System.out.println("<<<Yanlış seçim>>>");
//                        }
//                    }
//                case 2:
//                    krediIslemler:
//                    //krediIslemler Label
//                    while (true) {
//                        System.out.println("-----Kredi kartı işlemleri------");
//                        System.out.println("1-Ekstre görüntüle");
//                        System.out.println("2-Kredi kartı borç öde");
//                        System.out.println("3-Ana menu");
//                        System.out.println();
//                        System.out.print("Seçeneğiniz----> ");
//                        secenek = klavye.nextInt();
//
//                        switch (secenek) {
//                            case 1:
//                                System.out.println("Kredi kartı ekstresi görüntülendi");
//                                continue;
//                            case 2:
//                                while (true) {
//                                    System.out.println("-----Borç işlemleri------");
//                                    System.out.println("1-Tutar girerek öde");
//                                    System.out.println("2-Hesaptan öde");
//                                    System.out.println("3-K.Kartı işlemleri menu");
//                                    System.out.println("4-Ana menu");
//                                    System.out.println("5-Programdan çık");
//                                    System.out.println();
//                                    System.out.print("Seçeneğiniz----> ");
//                                    secenek = klavye.nextInt();
//
//                                    switch (secenek) {
//                                        case 1:
//                                            System.out.print("Kredi kartı ödenecek borç miktarını giriniz---> ");
//                                            secenek = klavye.nextInt();
//                                            System.out.println(secenek + " TL Kredi kartı borç ödeme işlemi gerçekleşti.");
//                                            System.out.println();
//                                            continue;
//                                        case 2:
//                                            System.out.println("Kredi kartı borç ödeme hesabınızdan gerçekleşti. ");
//                                            continue;
//                                        case 3:
//                                            continue krediIslemler; //continue to krediIslemler Label
//                                        case 4:
//                                            continue anaMenu; //continue to anaMenu Label
//                                        case 5:
//                                            break anaMenu; //break to anaMenu Label. Exit program
//                                        default:
//                                            System.out.println("<<<Yanlış seçim>>>");
//                                    }
//                                }
//                            case 3:
//                                continue anaMenu;  //continue to anaMenu Label
//                            default:
//                                System.out.println("<<<Yanlış seçim>>>");
//                        }
//                    }
//                case 3:
//                    break anaMenu; //break to anaMenu Label. Exit program
//                default:
//                    System.out.println("<<<Yanlış seçim>>>");
//            }
//        }
//        System.out.println("Bankamızı tercih ettiğiniz için teşekkürler.");

    }
}
