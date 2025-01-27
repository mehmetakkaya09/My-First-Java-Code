package day_11;

public class _02UniqueNumber {

    public static void main(String[] args) {
        // Schreibe eine Methode, die herausfindet, wie viele verschiedene Zahlen in den 3 gegebenen Zahlen enthalten sind

        uniqueNumber();

    }

    public static void uniqueNumber() {
        int num1 = 10;
        int num2 = 20;
        int num3 = 30;

        int res = 0;

        if (num1 == num2 && num2 == num3) {
            res = 1;
        } else if (num1 == num2 || num1 == num3 || num2 == num3) {
            res = 2;
        } else {
            res = 3;
        }

        System.out.println("Sie haben " + res + " verschiedene Zahlen");
    }


}
