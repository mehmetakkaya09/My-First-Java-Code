package utils;

public class ArrayUtil {

    public static void printArray(String[] arr) {
        for (String s : arr) {
            System.out.println(s);
        }
    }

    public static void printArray(int[] arr) {
        for (int s : arr) {
            System.out.println(s);
        }
    }

    public static void printArray(double[] arr) {
        for (double s : arr) {
            System.out.println(s);
        }
    }

    public static String[] reverseArray(String[] arr) {
        String[] reversedArr = new String[arr.length];
        int index = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            reversedArr[i] = arr[index];
            index--;
        }
        return reversedArr;
    }
    // int[] und double[] reverseArray method schreiben Sie --- return int[], double[]

    // wandeln Sie jede String[] Array element zu kleiner Buchstabe um. --- return String[] arrayToLowerCase

    public static String[] upperCaseMethod(String[] arr){
        String[] resultArr = new String[arr.length];
        for(int i=0; i< arr.length; i++){
            resultArr[i] = arr[i].toUpperCase();
        }
        return resultArr;
    }

    public static void print2DimArray(int[][] arr) {
        for (int i = 0; i < arr.length; i++) { // für Zeilen
            for (int j = 0; j < arr[i].length; j++) { // für Spalten
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void print2DimArray(String[][] arr) {
        for (String[] row : arr) {
            for (String column : row) {
                System.out.print(column + " ");
            }
            System.out.println();
        }
    }





}
