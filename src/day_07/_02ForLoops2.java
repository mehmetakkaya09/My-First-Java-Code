package day_07;

import java.util.Scanner;

public class _02ForLoops2 {

    public static void main(String[] args) {

        // Faktoriel = 5! 1 * 2 * 3 * 4 * 5;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number which you want to find Factorial value : ");

        int factorial = sc.nextInt();

        int sum = 1;

        for (int i = 1; i <= factorial; i++) {
            sum *= i;
            //1
            //2
            //6
            //24
            //120
        }

        System.out.println(factorial + " factorial is " + sum);


    }



}
