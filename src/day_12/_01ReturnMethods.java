package day_12;

public class _01ReturnMethods {

    public static void main(String[] args) {

        // void methoden gibt uns nie ein Wert zurück
        double summe = sum(3,4);

        System.out.println("Summe ist " + summe);

        int result1 = uniqueNumber(11, 22, 33);
        int result2 = uniqueNumber(11, 11, 33);
        int result3 = uniqueNumber(11, 11, 11);

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
        System.out.println("result3 = " + result3);

    }

//    public static void sum(int a, int b) {
//        System.out.println(a + b);
//    }

    public static double sum(int a, int b) {
        double sum = a + b;

         //return true;
        //return "Eurotech";
        return sum;
    }

    public static int uniqueNumber(int num1, int num2, int num3) {
        int res = 0;

        if (num1 == num2 && num2 == num3) {
            res = 1;
        } else if (num1 == num2 || num1 == num3 || num2 == num3) {
            res = 2;
        } else {
            res = 3;
        }

        return res;
    }

}
