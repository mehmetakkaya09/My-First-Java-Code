package day_12;

public class _05MethodOverloading {

    public static void main(String[] args) {

        // gleiche Namen mit unterschiedliche Parameters

        int res1 = sum(1, 6);
        System.out.println("res1 = " + res1);

        int res2 = sum(2, 3, 4);
        System.out.println("res2 = " + res2);

        String str = "Hallo";

        System.out.println("str.indexOf(\"o\") = " + str.indexOf("o"));
        System.out.println("str.indexOf(97) = " + str.indexOf(97));


    }

    public static int sum(int a, int b) {
        return a + b;
    }

    public static double sum(double asd, int bnm) {
        return asd + bnm;
    }

    public static int sum(int a, double b) {
        return a;
    }

    public static int sum(int a, int b, int c) {
        return a + b + c;
    }
    public static int sum() {
        return 5;
    }

//    public static void sum(int a, int b, int c) {
//        //return a + b + c;
//    }

//    public static int sum2(int a, int b, int c) {
//        return a + b + c;
//    }


}
