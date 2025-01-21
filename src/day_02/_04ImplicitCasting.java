package day_02;

public class _04ImplicitCasting {

    public static void main(String[] args) {

        // byte -> short -> int -> long -> float -> double

        // ImplicitCasting = eine kleine Datatype kann automatisch (implizit) zu einer grosseren Datatype zugewiesen werden.
        byte b = 5;

        short s = b;

        int i = s;

        long l = i;

        float f = l;

        double d = f;

        System.out.println("d = " + d);


    }

}
