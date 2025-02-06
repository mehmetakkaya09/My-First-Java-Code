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
        } else
            System.out.println("Du hast kein " + item);

        //*-?!"


//        System.out.print("Geben Ihre Vorname : ");
//        String firstname = input.nextLine().trim();

        // charAt() methode gibt immer ein char zurück
        // contains() methode nimmt ein String
        // wenn wir drin contains() method charAt() methode benutzen wollen, müssen wir diese charAt() zu String umwandeln.
        // wenn wir nach ein char + "" schreiben dann können wie diese char als String benutzen


        String specials = "*-?!\"";

        boolean strSpecial = true;
        boolean strLength = true;

        do {
            System.out.print("Geben Sie Ihr Vorname : ");
            String vorname = input.nextLine().trim();
            strSpecial = specialCharCheck(vorname, specials);
            strLength = isLengthValid(vorname, 3);
        } while (strSpecial || strLength);


    }

    public static boolean specialCharCheck(String str, String specials) {

        boolean result = false;

        String actualResult = "Eurotech";
        String expectedResult = "Eurotech";

        if (actualResult.contains(expectedResult)) {
            System.out.println("Test Passed");
        }else {
            System.out.println("Test Failed");
        }

        for (int i = 0; i < specials.length(); i++) {
            boolean isContain = str.contains(specials.charAt(i) + "");
            if (isContain) {
                System.out.println("Ihr Name beinhaltet " + specials.charAt(i));
                result = true;
                //break;
            }
        }

        return result;
    }

    public static boolean isLengthValid(String str, int length) {
        boolean result = true;
        if (str.length() >= length) {
            result = false;
        }
        return result;
    }

}
