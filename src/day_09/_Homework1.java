package day_09;

import java.util.Scanner;

public class _Homework1 {

    public static void main(String[] args) {

        // scanner
        // bekommen von Benutzer ein Zahl
        // wir werden Ziffern getrennt ausgeben
        // summe ausgeben

        Scanner sc = new Scanner(System.in);

        int zahl = 0;
        int ziffer = 0;
        int stelle = 0;
        int summe = 0;

        System.out.print("Bitte geben Sie ein Zahl : ");
        zahl = sc.nextInt();

        do {
            stelle++;
            //1234
            ziffer = zahl % 10;
            summe += ziffer;
            zahl /= 10;

            switch (stelle) {
                case 1:
                    System.out.println("Einerstelle : " + ziffer);
                    break;
                case 2:
                    System.out.println("Zehnerstelle : " + ziffer);
                    break;
                case 3:
                    System.out.println("Hunderterstelle : " + ziffer);
                    break;
                case 4:
                    System.out.println("Tausenderstelle : " + ziffer);
                    break;
                case 5:
                    System.out.println("Zehntausenderstelle : " + ziffer);
                    break;
                default:
                    System.out.println("Ungültige stelle");
                    break;
            }

        }while (zahl > 0);

        System.out.println("Summe : " + summe);

//        while (zahl > 0) {
//
//            stelle++;
//            //1234
//            ziffer = zahl % 10;
//            summe += ziffer;
//            zahl /= 10;
//
//            switch (stelle) {
//                case 1:
//                    System.out.println("Einerstelle : " + ziffer);
//                    break;
//                case 2:
//                    System.out.println("Zehnerstelle : " + ziffer);
//                    break;
//                case 3:
//                    System.out.println("Hunderterstelle : " + ziffer);
//                    break;
//                case 4:
//                    System.out.println("Tausenderstelle : " + ziffer);
//                    break;
//                case 5:
//                    System.out.println("Zehntausenderstelle : " + ziffer);
//                    break;
//                default:
//                    System.out.println("Ungültige stelle");
//                    break;
//            }
//
//        }
//        System.out.println("Summe : " + summe);

    }

}
