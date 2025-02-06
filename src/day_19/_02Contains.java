package day_19;

import java.util.Scanner;

public class _02Contains {

    public static void main(String[] args) {

        String warenKorb = "Computer, Handy, Tastatur, Stift";

        System.out.println("warenKorb.contains(\"Handy\") = " + warenKorb.contains("Handy"));

        System.out.println("warenKorb.contains(\"Mouse\") = " + warenKorb.contains("Mouse"));

        System.out.println("warenKorb.contains(\"Computer\") = " + warenKorb.contains("Computer"));

        Scanner input = new Scanner(System.in);

        System.out.print("Welche item suchen Sie? ");
        String item = input.nextLine().trim();

        boolean isContains = warenKorb.contains(item);

        if (isContains) {
            System.out.println("Du hast ein " + item);
        }else
            System.out.println("Du hast kein " + item);


    }

}
