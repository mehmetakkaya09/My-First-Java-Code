package day_24;

public class _03AutoBoxingUnboxing {

    public static void main(String[] args) {
        int intPrimitive = 12;
        Integer intWrapper = intPrimitive; // Autoboxing

        Double doubleWrapper = 5.5;
        double doublePrimitive = doubleWrapper; // Unboxing

        Integer integer = 10;

        String str = String.valueOf(integer);
        String str2 = integer.toString();

        System.out.println("(str instanceof  String) = " + (str instanceof String));
        System.out.println("(str2 instanceof  String) = " + (str2 instanceof String));


    }

}
