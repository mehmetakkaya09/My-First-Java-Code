package day_20;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class _03Birthday {

    public static void main(String[] args) throws Exception {

        // Schreibe ein Programm, das deinen Geburtstag ermittelt.
        // Datum im Format (YYYY-MM-DD)
        // Verwende SimpleDateFormat("EEEE") für den Wochentag.

        Scanner sc = new Scanner(System.in);
        System.out.print("Bitte gib deinen Geburtstag im format (YYYY-MM-DD) ein! : ");
        String dateStr = sc.nextLine();

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

        Date datum = dateFormat.parse(dateStr);

        String wochenTag = getWochenTag(datum);

        System.out.println("Dein Geburtstag " + dateStr + " fallt auf einen " + wochenTag + ".");

    }

    public static String getWochenTag(Date datum) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("EEEE", Locale.GERMAN);
        return  dateFormat.format(datum);
    }


}
