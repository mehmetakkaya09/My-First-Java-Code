package day_19;

import java.nio.file.Paths;
import java.util.Scanner;

public class _06SubString {

    public static void main(String[] args) {

        String str = "Hello World";

        String substring1 = str.substring(6);

        System.out.println(substring1);

        String substring2 = str.substring(0, 5);

        System.out.println(substring2);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your firstname: ");
        String firstName = sc.nextLine();
        System.out.print("Enter your lastname: ");
        String lastName = sc.nextLine();

        String fullName = fullName(firstName, lastName);

        System.out.println(fullName);

    }

    public static String fullName(String firstName, String lastName) {
        // mEhMet aKKaYa --- Mehmet Akkaya
        //  mehmet
        //  akkaya

        firstName = firstName.trim();
        lastName = lastName.trim();

        firstName = firstName.toLowerCase();
        lastName = lastName.toLowerCase();

        firstName = firstName.substring(0,1).toUpperCase() + firstName.substring(1);
        lastName = lastName.substring(0,1).toUpperCase() + lastName.substring(1);

        return firstName + " " + lastName;

    }


}
