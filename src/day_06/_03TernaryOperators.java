package day_06;

import java.util.Scanner;

public class _03TernaryOperators {

    public static void main(String[] args) {

        // positive number

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();


        if (num > 0) {
            System.out.println(num + " is positive");
        } else
            System.out.println(num + " is negative");

        String res = num > 0 ? num + " is positive" : num + " is negative";

        // wir müssen ein Bedingung überprüfen wie if statements
        // wir müssen unsere Ergebnisse zu eine Variable zuweisen
        // Unsere jede statement type muss gleich sein

        System.out.println(res);


        sc.close();


    }


}
