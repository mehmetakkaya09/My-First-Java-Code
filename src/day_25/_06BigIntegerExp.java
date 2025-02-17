package day_25;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;

public class _06BigIntegerExp {

    public static void main(String[] args) {

        System.out.println("Integer.MAX_VALUE = " + Integer.MAX_VALUE);
        System.out.println("Long.MAX_VALUE = " + Long.MAX_VALUE); //9223372036854775807875875876876987

        BigInteger bigInteger = new BigInteger("986986876535425478698709786764524537659870978687465376");
        BigInteger bigInteger2 = new BigInteger("5");
        System.out.println(bigInteger);

        BigInteger multiplied = bigInteger.multiply(bigInteger);
        BigInteger divisor = bigInteger.divide(bigInteger2);
        BigInteger substract = bigInteger.subtract(bigInteger2);
        BigInteger add = bigInteger.add(bigInteger);


        System.out.println(divisor);
        System.out.println(multiplied);
        System.out.println(substract);
        System.out.println(add);


        BigDecimal bigDecimal = new BigDecimal("9869868765354.928364982748091274081724092137498237540");
        BigDecimal dividor = new BigDecimal("5");
        System.out.println(bigDecimal);

        BigDecimal divide = bigDecimal.divide(dividor, 100, RoundingMode.UP);
        System.out.println(divide);


    }


}
