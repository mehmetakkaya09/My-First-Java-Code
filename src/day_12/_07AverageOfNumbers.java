package day_12;

public class _07AverageOfNumbers {

    public static void main(String[] args) {

        // schreiben Sie 2 separate average methods
        // erste method soll 2 int parameter nehmen und soll durchschnitt dieser Zahlen als int zurückgeben
        // zweite method soll 3 int parameter nehmen und soll durchschnitt dieser Zahlen als int zurückgeben

        int averageInt = average(1, 5);
        double averageDouble = average(1.5, 5.4);
        long averageLong = average(5234234235235l, 6123412412412l);
        System.out.println("averageInt = " + averageInt);
        System.out.println("averageDouble = " + averageDouble);
        System.out.println("averageLong = " + averageLong);

    }


    public static int average(int num1, int num2) {
        return (num1 + num2) / 2;
    }

    public static double average(double num1, double num2) {
        return (num1 + num2) / 2;
    }

    public static long average(long num1, long num2) {
        return (num1 + num2) / 2;
    }





}
