package day_02;

public class _05ExplicitCasting {


    public static void main(String[] args) {

        // byte -> short -> int -> long -> float -> double

        // ExplicitCasting = eine grosse Datatype muss manuell (explicit) zu einer kleineren Datatype zugewiesen werden.

        int i = 10;

        byte b = (byte) i;

        double d = 20;

        int i2 = (int) d;

        long l = 30;

        int i3 = (int) l;

        float f = l;

        System.out.println("b = " + b);

        System.out.println("l = " + l);

        System.out.println("f = " + f);

        short s2 = 2;
        short s3 = 3;

        short s4 = (short) (s2 * s3);

        byte b2 = 4;
        byte b3 = 8;

        byte b4 = (byte) (b3 / b2);



    }
}
