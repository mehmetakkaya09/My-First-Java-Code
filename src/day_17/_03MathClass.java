package day_17;

public class _03MathClass {

    public static void main(String[] args) {

        int number = -8;
        int abs = Math.abs(number);
        System.out.println("abs = " + abs);

        double pi = Math.PI;

        System.out.println("pi = " + pi);

        double pow = Math.pow(2,3);

        System.out.println("pow = " + pow);

        double sqrt = Math.sqrt(25);

        System.out.println("sqrt = " + sqrt);

        System.out.println(Math.round(4.1));
        System.out.println(Math.round(4.4));
        System.out.println(Math.round(4.5));
        System.out.println(Math.round(4.92342));

        System.out.println(Math.ceil(3.2));
        System.out.println(Math.floor(3.9));

        System.out.println(Math.addExact(5,7));
        System.out.println(Math.subtractExact(5,7));
        System.out.println(Math.multiplyExact(5,7));

        int number1 = 5;
        int number2 = 10;

        System.out.println(Math.min(number1, number2));
        System.out.println(Math.max(number1, number2));




    }
}
