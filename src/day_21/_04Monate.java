package day_21;

import java.util.Scanner;

public class _04Monate {

    public static void main(String[] args) {

        // Fragen Sie zu Benutzer als int
        // Bitte geben Sie Geburtsmonatzahl 10

        //Ihr Geburtsmonat ist .... Oktober
        String[] monate = new String[12];

        monate[0] = "Januar";
        monate[1] = "Februar";
        monate[2] = "März";
        monate[3] = "April";
        monate[4] = "Mai";
        monate[5] = "Juni";
        monate[6] = "Juli";
        monate[7] = "August";
        monate[8] = "September";
        monate[9] = "Oktober";
        monate[10] = "November";
        monate[11] = "Dezember";

        System.out.println("Bitte geben Sie Ihren Geburtsmonat ein!");
        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();

        if (index > 0 && index <= 12) {
            System.out.println("Ihr Geburtsmonat: " + monate[index - 1]);
        } else {
            System.out.println("Falscher Monat eingegeben...");
        }

    }

}
