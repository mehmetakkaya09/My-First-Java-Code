package day_03;

public class _03LogicalOperatorAND {

    public static void main(String[] args) {

        boolean a = 3 > 5;// false
        boolean b = 7 >= 2;// true

        boolean c = a && b;

        System.out.println("c = " + c);

        // wenn wir && benutzen Java überprüft boolean bis false Ergebnis
        // wenn wir & benutzen Java überprüft alle boolean auch wenn es ein false Ergebnis gibt.

        System.out.println(true && true);
        System.out.println(true && false);
        System.out.println(false && true);
        System.out.println(false && false);

        System.out.println(false & true);

        int i1 = 10;
        int i2 = 15;

        boolean res = (i1 <= i2) && (i1 >= i2);

        System.out.println(res);


    }
}
