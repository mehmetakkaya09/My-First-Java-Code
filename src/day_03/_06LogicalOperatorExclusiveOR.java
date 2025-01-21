package day_03;

import java.awt.event.MouseAdapter;

public class _06LogicalOperatorExclusiveOR {

    public static void main(String[] args) {

        boolean d = 100 < 20; //false
        boolean e = 100 > 50; //true

        boolean xor = d ^ e;

        // In Exclusive Or Logisch muss zwei Ergebnis unterschiedlich sein.

        System.out.println("xor = " + xor);

        System.out.println(true ^ true);
        System.out.println(true ^ false);
        System.out.println(false ^ true);
        System.out.println(false ^ false);


    }


}
