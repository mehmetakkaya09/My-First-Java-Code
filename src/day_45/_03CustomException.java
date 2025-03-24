package day_45;

import day_45.exceptions.InvalidEmailException;
import day_45.exceptions.InvalidNameException;

public class _03CustomException {

    public static void nameException(String name) throws InvalidNameException {
        // um eine Exception zu handeln oder zu eine andere Exception Klasse zu senden
        // benutzen wir "throws" keyword
        // Throws Exception Handling weg ist sehr einfach zu schreiben
        // aber wir müssen in jeder Methode, die wir benutzen wollen, nochmal diese Exception handeln.
        if (name.length() < 3) {
            throw new InvalidNameException("Name muss min aus 3 Buchstaben bestehen");
        }
    }

    public static void emailException(String email) {
        if (!email.contains("@")) {
            throw new InvalidEmailException();
            // um eine neue Exception zu werfen (Exception throw)
            // benutzen wir "throw" keyword
        }
    }

    public static void main(String[] args) {

        String name = "John";
        String email = "johngmail.com";

        //nameException(name);
        try {
            nameException(name);
            emailException(email);
        } catch (InvalidNameException e) {
            System.out.println("Invalid Name Problem wurde gehandelt");
        }catch (InvalidEmailException e) {
            System.out.println("Invalid Email Problem wurde gehandelt");
        }


    }


}
