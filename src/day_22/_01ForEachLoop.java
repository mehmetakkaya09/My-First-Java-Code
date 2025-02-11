package day_22;

public class _01ForEachLoop {

    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
        }
        System.out.println("\n************");
        for (int number : numbers){
            System.out.print(number);
        }
        System.out.println();
        double[] prozente = new double[5];

        for (int i = 0; i < prozente.length; i++) {
            prozente[i] = Math.random() * 100;
        }

        for (double prozent: prozente) {
            System.out.println(prozent);
        }


    }


}
