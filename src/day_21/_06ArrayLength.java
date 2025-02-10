package day_21;

public class _06ArrayLength {

    public static void main(String[] args) {

        int[] arr = new int[10];

        System.out.println("arr[5] = " + arr[5]);

        System.out.println("arr.length = " + arr.length);

        int[] arr2 = {3, 9, 5, 1, 9, 10, 12, 3};

        System.out.println("arr2.length = " + arr2.length);
        System.out.println(arr2[0]);
        System.out.println(arr2[1]);
        System.out.println(arr2[2]);
        System.out.println(arr2[3]);
        System.out.println(arr2[4]);
        System.out.println(arr2[5]);
        System.out.println(arr2[6]);
        System.out.println(arr2[7]);

        System.out.println("*************************************");
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }

        System.out.println("*************************************");

        for (int i = arr2.length - 1; i >= 0 ; i--) {
            System.out.println(arr2[i]);
        }



    }

}
