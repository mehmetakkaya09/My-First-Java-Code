package day_22;

import java.util.Arrays;

public class _08LargestNumberOfArrays {

    public static void main(String[] args) {
        // method schreiben, und diese method nimmt 2 int[] param
        // diese array elementen addieren
        // als ergebnis werden Sie ausgeben welche Array summe gross ist.

        int[] arr1 = {12,53,87,2324,57,424,786};
        int[] arr2 = {21,34,76,3422,133,5555};
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        biggerArray(arr1,arr2);

    }

    /**
     *
     * @param arr1
     * @param arr2
     */
    public static void biggerArray(int[] arr1, int[] arr2) {
        int sum1 = 0;
        int sum2 = 0;

        for (int element : arr1) {
            sum1 += element;
        }
        for (int element : arr2) {
            sum2 += element;
        }

        if (sum1 > sum2) {
            System.out.println(Arrays.toString(arr1) + " ist grosser als " + Arrays.toString(arr2));
        } else if (sum2 > sum1) {
            System.out.println(Arrays.toString(arr2) + " ist grosser als " + Arrays.toString(arr1));
        }else {
            System.out.println("Beide Array ist gleich!");
        }


    }


}
