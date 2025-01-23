package day_09;

import java.util.Scanner;

public class _03WhileLoopExercises {

    public static void main(String[] args) {

        // Sammeln Sie Zahlen zwischen 1 - 10, indem Sie While loop verwenden.


        // Schreiben Sie ein Programm, das die Zahlen addiert, bis die Zahl 0 über die Tastatur eingegeben wird.
        // 3 20 4 1 0    28

        int sum = 0;
        int number = 0;
        boolean continueLoop = true;
        Scanner sc = new Scanner(System.in);
        int count = 0;


        while (continueLoop) {
            count++;
            System.out.print("Geben Sie " + count + ". Zahl : ");
            number = sc.nextInt();

            if (number == 0) {
                continueLoop = false;
            }

            sum += number;

            if (count % 3 == 0) {
                System.out.println("inner sum = " + sum);
            }
        }

        System.out.println("sum = " + sum);

    }


}
