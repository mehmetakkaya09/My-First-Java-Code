package day_45;

import day_45.exceptions.InvalidNameException;

public class _03CustomException {

    public static void nameException(String name) throws InvalidNameException {
        if (name.length() < 3){
            throw new InvalidNameException("Name muss min aus 3 Buchstaben bestehen");
        }
    }

    public static void main(String[] args)  {

        String name = "Jo";
        String email = "john@gmail.com";

        try {
            nameException(name);
        } catch (InvalidNameException e) {
            System.out.println("Invalid Name Problem wurde gehandelt");
        }

        if (!email.contains("@")) {
            System.out.println("Invalid Email");
        }





    }


}
