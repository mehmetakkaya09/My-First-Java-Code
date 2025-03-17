package day_41.enumeration;

import java.util.Arrays;

public class TageTest {

    public static void main(String[] args) {

        Tage tage = Tage.DIENSTAG;

        System.out.println(tage);

        System.out.println("tage.ordinal() = " + tage.ordinal()); // Index nummer von Enum

        System.out.println(Arrays.toString(Tage.values())); // alle Enums als Array

        System.out.println(Tage.valueOf("SONNTAG"));

        System.out.println(tage.name());

        if (tage.name().equalsIgnoreCase("dienstag")) {
            System.out.println("dienstag");
        }
    }


}
