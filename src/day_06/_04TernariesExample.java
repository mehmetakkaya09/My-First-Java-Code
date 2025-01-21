package day_06;

import java.util.Scanner;

public class _04TernariesExample {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter your age: ");
        int age = scanner.nextInt();

        String message = age >=18 ? "You are eligible to vote" : "You are not eligible to vote";

//        if (age >= 18) {
//            message = "You are eligible to vote";
//        }else
//            message = "You are not eligible to vote";

        System.out.println(message);




    }


}
