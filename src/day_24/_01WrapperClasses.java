package day_24;

import java.util.ArrayList;
import java.util.List;

public class _01WrapperClasses {

    public static void main(String[] args) {

        boolean bool = true;
        byte byteNum = 3;
        short shortNum = 4;
        int intNum = 5;
        long longNum = 6;
        float floatNum = 7.8f;
        double doubleNum = 8.235;
        char ch = 'A';

        System.out.println("bool = " + bool);
        System.out.println("byteNum = " + byteNum);
        System.out.println("shortNum = " + shortNum);
        System.out.println("intNum = " + intNum);
        System.out.println("longNum = " + longNum);
        System.out.println("floatNum = " + floatNum);
        System.out.println("doubleNum = " + doubleNum);
        System.out.println("ch = " + ch);

        // 1. Weg um ein Wrapper Objekt zu erstellen --- new keyword --> Diese Weg verwendet man nicht mehr nach Java 9
        Boolean boolWrapper = new Boolean(true);
        Boolean boolWrapper2 = new Boolean("FALSE");
        System.out.println("boolWrapper = " + boolWrapper);
        System.out.println("boolWrapper2 = " + boolWrapper2);

        Byte byteWrapper = new Byte((byte) 5);
        Byte byteWrapper2 = new Byte("5");
        System.out.println("byteWrapper = " + byteWrapper);
        System.out.println("byteWrapper2 = " + byteWrapper2);

        Short shortWrapper = new Short((short) 7);
        Short shortWrapper2 = new Short("7");
        System.out.println("shortWrapper = " + shortWrapper);
        System.out.println("shortWrapper2 = " + shortWrapper2);

        Integer integer = new Integer(50);
        Integer integer2 = new Integer("50");
        System.out.println("integer = " + integer);
        System.out.println("integer2 = " + integer2);

        Long longWrapper = new Long(43);
        Long longWrapper2 = new Long("43");
        System.out.println("longWrapper = " + (longWrapper + longWrapper2));
        System.out.println("longWrapper2 = " + longWrapper2);

        Float floatWrapper = new Float(23);
        Float floatWrapper2 = new Float("23");
        System.out.println("floatWrapper = " + floatWrapper);
        System.out.println("floatWrapper2 = " + floatWrapper2);

        Double doubleWrapper = new Double(11);
        Double doubleWrapper2 = new Double("11");
        System.out.println("doubleWrapper = " + doubleWrapper);
        System.out.println("doubleWrapper2 = " + doubleWrapper2);

        Character character = new Character('e');
        System.out.println("character = " + character);

        // 2. Weg um ein Wrapper Objekt zu erstellen --- valueOf() methode
        Integer integerValueOf = Integer.valueOf(55);
        Integer integerValueOf2 = Integer.valueOf("55");
        System.out.println("integerValueOf = " + integerValueOf);
        System.out.println("integerValueOf2 = " + integerValueOf2);
        Character characterValueOf = Character.valueOf((char) 55);
        Character characterValueOf2 = Character.valueOf('7');
        //Character characterValueOf3 = Character.valueOf("7");
        System.out.println("characterValueOf = " + characterValueOf);
        System.out.println("characterValueOf2 = " + characterValueOf2);
        Boolean boolValueOf = Boolean.valueOf(true);
        Boolean boolValueOf2 = Boolean.valueOf("true");
        System.out.println("boolValueOf = " + boolValueOf);
        System.out.println("boolValueOf2 = " + boolValueOf2);

        // 3. Weg --- Literal
        int int1 = 200;
        Integer integer1 = 200;
        //Integer integer3 = "200"; falsch
        System.out.println("integer1 = " + integer1);

        Character character1 = 'A';
        //Character character3 = "A";
        System.out.println("character1 = " + character1);

        Boolean bool2 = false;
        System.out.println("bool2 = " + bool2);

        Double double3 = 2.5;
        System.out.println("double3 = " + double3);

        System.out.println("Integer.MIN_VALUE = " + Integer.MIN_VALUE);
        System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE);
        System.out.println("Byte.MIN_VALUE = " + Byte.MIN_VALUE);
        System.out.println("Byte.MAX_VALUE = " + Byte.MAX_VALUE);
        System.out.println("Short.MIN_VALUE = " + Short.MIN_VALUE);
        System.out.println("Short.MAX_VALUE = " + Short.MAX_VALUE);
        System.out.println("Long.MIN_VALUE = " + Long.MIN_VALUE);
        System.out.println("Long.MAX_VALUE = " + Long.MAX_VALUE);
        System.out.println("Float.MIN_VALUE = " + Float.MIN_VALUE);
        System.out.println("Float.MAX_VALUE = " + Float.MAX_VALUE);
        System.out.println("Double.MIN_VALUE = " + Double.MIN_VALUE);
        System.out.println("Double.MAX_VALUE = " + Double.MAX_VALUE);
        System.out.println("Character.MIN_VALUE = " + (int) Character.MIN_VALUE);
        System.out.println("Character.MAX_VALUE = " + (int) Character.MAX_VALUE);

        Integer integer4 = 2000;
        Integer integer5 = 2000;
        System.out.println("System.identityHashCode(integer4) = " + System.identityHashCode(integer4));
        System.out.println("System.identityHashCode(integer5) = " + System.identityHashCode(integer5));

        System.out.println("(integer4 + integer5) = " + (integer4 + integer5));
        System.out.println("(integer4==integer5) = " + (integer4 == integer5));
        System.out.println("(integer4.equals(integer5)) = " + (integer4.equals(integer5)));

        Integer integer6 = 127;
        Integer integer7 = 127;

        System.out.println("(integer6==integer7) = " + (integer6 == integer7));
        System.out.println("(integer6.equals(integer7)) = " + (integer6.equals(integer7)));

        Integer integer8 = 10;

        System.out.println("integer8.byteValue() = " + integer8.byteValue());
        System.out.println("integer8.shortValue() = " + integer8.shortValue());
        System.out.println("integer8.doubleValue() = " + integer8.doubleValue());
        System.out.println("integer8.toString() = " + integer8.toString());


    }



}
