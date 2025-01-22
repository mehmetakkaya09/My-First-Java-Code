package day_08;

public class _01NestedForLoops {

    public static void main(String[] args) {

        for (int i = 2; i < 9; i++) {
            System.out.println("Outer Loop " + i);
            for (int j = 0; j < 6; j++) {
                System.out.println("Inner Loop " + j);
            }
            System.out.println();
        }

        for (int i = 0; i < 2; i++) {
            System.out.println("First Loop " + i);
            for (int j = 0; j < 2; j++) {
                System.out.println("Second Loop " + j);
                for (int k = 0; k < 2; k++) {
                    System.out.println("Third Loop " + k);
                }
                System.out.println("-----------------");
            }
            System.out.println("******************");
        }







    }



}
