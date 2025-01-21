package day_03;

public class _07PrecedenceOfLogicalOperators {

    public static void main(String[] args) {

        /**
         * höhste
         * !
         * &&
         * ||
         * kleinste
         */

        int i1 = 10;
        int i2 = 20;
        int i3 = 30;

        boolean res = i1 != i2 || !(i1 == i3) && i2 == i3;// T || T && F
                                                          // T || F
                                                          // T
        System.out.println("res = " + res);

        boolean res2 = (i1 >= i2) && (i2 == i3) || (i1 != i3); // F && F || T
                                                               // F || T
                                                               // T
        System.out.println("res2 = " + res2);

        boolean res3 = (i3 >= i1) || (i2 < i1) && !(i2 != i3);
        // T || F && F
        // T || F
        // T

        System.out.println("res3 = " + res3);

        int num1 = 10;

        boolean res4 = (num1-- < 10) && (++num1 == 10) || (num1++ == 11) && (num1-- > 10);
        //              (10 < 10)    && ( 10 == 10)    || ( 10 == 11)    && ( 11 > 10)
        //                  F        &&       T        ||       F        &&      T
        //                           F                 ||                 F
        //                                             F
        System.out.println("num1 = " + num1);
        System.out.println("res4 = " + res4);

    }
}
