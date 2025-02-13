package day_23;

public class _06Reverse2DimArray {

    public static void main(String[] args) {

        int[][] arr = {
                {1, 2, 3},
                {4, 5, 6}
        };

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("************************");

        for (int zeile = arr.length - 1; zeile >=0 ; zeile--) {
            for (int spalte = arr[zeile].length - 1; spalte >= 0 ; spalte--) {
                System.out.print(arr[zeile][spalte] + " ");
            }
            System.out.println();
        }


    }


}
