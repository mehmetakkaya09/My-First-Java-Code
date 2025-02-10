package day_21;

public class _01Arrays {

    public static void main(String[] args) {

//        int number1, number2, number3, number4, number5, number6, number7, number8, number9, number10;
//
//        number1 = 10;
//        number2 = 15;
//        number3 = 20;

        // Deklaration von Arrays
        // Weg 1

        int[] numbers;
        String[] worte;
        double[] prozente;

        int numbers2[];
        String worte2[];
        double prozente2[];

        int[] zahlenArray = new int[10];

        int arraySize = 10;

        int[] zahlenArray2 = new int[arraySize];

        int[] zahlenArray3 = new int[5];

        zahlenArray3[0] = 6;
        zahlenArray3[1] = 90;
        zahlenArray3[2] = 4;
        zahlenArray3[3] = 20;
        zahlenArray3[4] = 11;

        zahlenArray3[0] = 10;

        System.out.println(zahlenArray3[0]);
        System.out.println(zahlenArray3[1]);
        System.out.println(zahlenArray3[2]);
        System.out.println(zahlenArray3[3]);
        System.out.println(zahlenArray3[4]);

        int array3Value = zahlenArray3[2];
        System.out.println(array3Value);

        //zahlenArray3[5] = 30;
        //System.out.println(zahlenArray3[5]); //ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5







    }


}
