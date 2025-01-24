package day_09;

import java.util.Scanner;

public class _Homework3 {

    public static void main(String[] args) {

        int exam1 = 0;
        int exam2 = 0;
        int durchschnitt = 0;
        int matrikelNummer = 0;
        Scanner input = new Scanner(System.in);
        String bericht = "Prüfungsnoten der Studierenden und ihre Durchschnittnote\n";

        while (true){

            System.out.print("Geben Sie die Matrikelnummer des Studierenden ein : ");
            matrikelNummer = input.nextInt();

            if (matrikelNummer == 0) {
                break;
            }

            System.out.print("Erste Prüfungsnote von Studierenden mit nummer " + matrikelNummer + ": ");
            exam1 = input.nextInt();
            System.out.print("Zweite Prüfungsnote von Studierenden mit nummer " + matrikelNummer + ": ");
            exam2 = input.nextInt();

            durchschnitt = (exam1 + exam2) / 2;

            bericht += "Matrikelnummer = " + matrikelNummer + " - " +
                    "Prüfung 1 = " + exam1 +", " +
                    "Prüfung 2 = " + exam2 +
                    " -> Durchschnittnote = " + durchschnitt + "\n";

        }

        System.out.println(bericht);


    }

}
