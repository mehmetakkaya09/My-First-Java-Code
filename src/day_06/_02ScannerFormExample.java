package day_06;

import java.util.Scanner;

public class _02ScannerFormExample {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your firstname : ");
        String firstName = input.nextLine();


        /**
         * Enter your firstname :
         * Enter your lastname :
         * Enter your age :
         * Enter your salary (Gehalt) :
         * Enter your email :
         * Are you student? (true/false) :
         * Enter your gender :
         */

        System.out.println(firstName);

        input.close();


    }


}
