package day_32;

public class MotorradTest {

    public static void main(String[] args) {

        Motorrad motorrad1 = new Motorrad("R1", "Blau");
        Motorrad motorrad2 = new Motorrad("R6", "Weiss");
        Motorrad motorrad3 = new Motorrad("R25", "Schwarz");

        System.out.println("motorrad1.id = " + motorrad1.id);
        System.out.println("motorrad2.id = " + motorrad2.id);
        System.out.println("motorrad3.id = " + motorrad3.id);
        //System.out.println("Motorrad.neueID = " + Motorrad.neueID);

        System.out.println(motorrad1);
        System.out.println(motorrad2);
        System.out.println(motorrad3);

        Motorrad.marke = "Kawasaki";

        System.out.println(motorrad1);
        System.out.println(motorrad2);
        System.out.println(motorrad3);
    }


}
