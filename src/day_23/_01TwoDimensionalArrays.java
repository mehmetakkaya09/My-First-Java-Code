package day_23;

import java.util.Arrays;

public class _01TwoDimensionalArrays {

    public static void main(String[] args) {

        int[][] numbersArr = new int[3][3];

        // wenn wir 2 dimensional Array ausgeben wollen, können wir einfach deepToString() methode benutzen.
        System.out.println(Arrays.deepToString(numbersArr));

        numbersArr[0][0] = 9;
        numbersArr[0][1] = 8;
        numbersArr[0][2] = 7;
        numbersArr[2][1] = 20;
        numbersArr[1][2] = 15;

        System.out.println(Arrays.deepToString(numbersArr));

        int[][] numbersArr2 = {
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };

        System.out.println(Arrays.deepToString(numbersArr2));

        int[] numbersArr3 = {1,2,3,4,5,6,7,8,9};

        for (int i = 0; i < numbersArr3.length; i++) {
            System.out.print(numbersArr3[i] + "\t");
        }
        System.out.println();

        for (int i = 0; i < numbersArr2.length; i++) {
            for (int j = 0; j < numbersArr2[i].length; j++) {
                System.out.print(numbersArr2[i][j] + " ");
            }
            System.out.println();
        }

    }



}
