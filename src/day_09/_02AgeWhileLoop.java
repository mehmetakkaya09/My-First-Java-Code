package day_09;

import java.util.Scanner;

public class _02AgeWhileLoop {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Wie alt sind Sie : ");
        int age = sc.nextInt();

//        if (age >= 18) {
//            System.out.println("Sie können registrieren");
//        } else {
//            System.out.println("Sie müssen mindestens 18 Jahre alt sein");
//        }

        while (age < 18) {
            System.out.println("Sie müssen mindestens 18 Jahre alt sein");
            System.out.print("Wie alt sind Sie : ");
            age = sc.nextInt();
        }

        System.out.println("Sie können registrieren");
        sc.close();
    }


}
