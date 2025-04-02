package day_44;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CatchBlocks {

    public static void main(String[] args) {

        int num1 = 0;
        int num2 = 0;

        Scanner sc = new Scanner(System.in);


        try {
            System.out.println("Geben Sie erste Nummer ein : ");
            num1 = Integer.parseInt(sc.nextLine());

            System.out.println("Geben Sie zweite Nummer ein : ");
            num2 = Integer.parseInt(sc.nextLine());
        } catch (InputMismatchException e) {
            System.out.println("Nummer muss Integer sein Bitte geben Sie ein Integer!!!");
            System.out.println("Geben Sie erste Nummer ein : ");
            num1 = Integer.parseInt(sc.nextLine());

            System.out.println("Geben Sie zweite Nummer ein : ");
            num2 = Integer.parseInt(sc.nextLine());
        } catch (NumberFormatException e) {
            System.out.println("Nummer muss Integer sein Bitte geben Sie ein Integer!!!");
            System.out.println("Geben Sie erste Nummer ein : ");
            num1 = Integer.parseInt(sc.nextLine());

            System.out.println("Geben Sie zweite Nummer ein : ");
            num2 = Integer.parseInt(sc.nextLine());
        }

        // Frage   : Was ist dein grosstes Problem beim Testing?
        // Antwort : Flaky Tests
        // Wenn Sie ein Fehler manchmal bekommen, manchmal nicht bekommen, ist es Flaky Test.
        // Beispiel: Sie werden auf einem Button klicken
        // manchmal kann Selenium auf diese Button finden und klicken
        // manchmal kann Selenium auf diese Button nicht finden und nicht klicken

        // Meistens automatisieren diese Flaky Tests nicht.
        // Manchmal müssen wir diese Tests auch automatisieren.

        // Wir müssen für diese Situation
        // 1 - unsere Flaky Test Koden (möglich fehlerhafte Koden) innerhalb "try" Block schreiben
        // 2 - innerhalb "catch" Block müssen wir diese Fehler fangen/handeln/lösen
        // catch (NoSuchElementException nsee)

        int res = 0;

        int[] arr = new int[1];

        try {
            try {
                res = num1 / num2;
            } catch (ArithmeticException e) { // exception
                System.out.println(e.getMessage());
                num2 = 2;
                res = num1 / num2;

            }
            arr[2] = res; // wenn Java ArrayIndexOutOfBoundsException sieht, spring Java Compiler direkt catch Block und überprüft catch Block
            System.out.println(arr[2]);
        } catch ( // exception
                ArrayIndexOutOfBoundsException e) { // Wenn diese Exception fehlende Kode handeln kann, java funktioniert catch block. Sonst wirft Java diese nicht gehandelte Exception
            System.out.println(e.getMessage());
            arr[0] = res;
        }

        System.out.println(arr[0]);

        String str = "Hello";

        int[] arr2 = new int[10];

        try {
            //arr2 = new int[2_000_000_000];
            str.charAt(9);
            arr[2] = 5;
            //} catch (IndexOutOfBoundsException e) { catch blocks haben eine bestimmte Reihe. Frühere catch block muss immer gleich oder kleiner als nachste catch blocks sein
        } catch (ArrayIndexOutOfBoundsException e) {// exception
            System.out.println(e.getMessage());
        } catch (StringIndexOutOfBoundsException e) {// exception
            System.out.println(e.getMessage());
        } catch (IndexOutOfBoundsException e) {// exception
            System.out.println(e.getMessage());
        } catch (OutOfMemoryError e) {              // error
            System.out.println(e.getMessage());
        }

        try {
            System.out.println("3. Try block");
            str.charAt(9);
            arr[2] = 5;
        } catch (Exception e) {
            System.out.println("letzte catch = " + e.getMessage());
        } finally {
            System.out.println("finally block : " + " Scanner ist geschlossen.. DB ist geschlossen");
        }

        // in try block schreiben wir Kode, die falsch sein kann
        // in catch blocks fangen wir diese fehlers
        // nachste catch blocks muss ahnliche (Class) Stufe oder grosser als frühere (Class) Stufe sein
        // finally blocks funktioniert unter jede Bedingung.


    }


}
