package day_21;

import java.util.Scanner;

public class _07Einkaufliste {

    public static void main(String[] args) {

        System.out.println("Einkaufliste,,,");
        String[] warenkorb = new String[5];

        Scanner sc = new Scanner(System.in);

        System.out.println("Bitte fügen Sie ein Produkt zu Ihrem Warenkorb hinzu");

        for (int i = 0; i < warenkorb.length; i++) {
            System.out.println((i + 1) + ". Produkt: ");
            warenkorb[i] = sc.nextLine();
        }

        System.out.println("Ihre ausgewahlte Produktliste:");
        for (int i = 0; i < warenkorb.length; i++) {
            System.out.println((i+1) + ". Produkt: " + warenkorb[i]);
        }





    }


}
