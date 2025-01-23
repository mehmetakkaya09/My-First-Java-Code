package day_09;

import java.util.Scanner;

public class _01WhileLoops {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int correctPassword = 1234;

        System.out.print("Geben Sie Ihre Passwort ein : ");
        int userPassword = scanner.nextInt();

//        if (userPassword == correctPassword) {
//            System.out.println("Anmeldung ist erfolgreich");
//        }

        int count = 0;

        while (userPassword != correctPassword) {
            if (count == 3){
                System.out.println("Sie hatten nur 3 Versuch");
                break;
            }
            System.out.print("Geben Sie Ihr Passwort erneut ein : ");
            userPassword = scanner.nextInt();
            count++;
        }


//        for (int i = 0; i < 3; i++) {
//            if (userPassword == correctPassword) {
//                System.out.println("Passwort erfolgreich");
//                break;
//            }else {
//                System.out.print("Geben Sie Ihr Passwort erneut ein :");
//                userPassword = scanner.nextInt();
//            }
//        }

        System.out.println("Anmeldung erfolgreich");





    }


}
