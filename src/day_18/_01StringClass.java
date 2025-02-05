package day_18;

public class _01StringClass {

    public static void main(String[] args) {

        // aktuelles Ergebnis
        // erwartetes Ergebnis
        String actualResult = "SDT20D - Java Programming and OCA SE8 Exam Prep.";
        String expectedResult = "SDT20D - Java Programming and OCA SE8 Exam Prep.";

        if (actualResult.equals(expectedResult)) {
            System.out.println("Test Passed");
        }else {
            System.out.println("Test Failed");
        }

        // String literal
         String str = "euroTech";// in String pool

         String str3 = "euroTech";// in String pool

        System.out.println("System.identityHashCode(str) = " + System.identityHashCode(str));
        System.out.println("System.identityHashCode(str3) = " + System.identityHashCode(str3));


        // new keyword
        String str2 = new String("euroTech"); // in heap
        System.out.println("System.identityHashCode(str2) = " + System.identityHashCode(str2));

        System.out.println(str == str2); // durch == können wir nur objekt adresse vergleichen

        System.out.println(str == str3);

        System.out.println(str.equals(str2));// durch equals() methode können wir beide String objekt INHALTLICH vergleichen







    }



}
