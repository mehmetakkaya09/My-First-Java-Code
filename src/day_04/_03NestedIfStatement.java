package day_04;

public class _03NestedIfStatement {

    public static void main(String[] args) {

        // Schreiben Sie eine if-statement, die besagt, dass eine Person in den Genuss der Ermäßigung kommen kann,
        // wenn sie ein Student zwischen 18 und 30 Jahren ist, und dass sie nicht in den Genuss der Ermäßigung kommen kann,
        // wenn sie keine der genannten Bedingungen erfüllt

        int alt = 20;
        boolean isStudent = true;
        double gehalt = 1000;

        if (isStudent) {
            System.out.println("This is a student");
            if (alt >= 18 && alt <= 30) {
                System.out.println("This person is eligible");
                if (gehalt < 1000) {
                    System.out.println("This person is eligible");
                } else {
                    System.out.println("This person is not eligible");
                }
            } else {
                System.out.println("This person is not eligible");
            }
        } else {
            System.out.println("This is not a student");
        }
        // Schreibe ein Programm, das prüft, ob die angegebene Zahl durch 2,3,6 teilbar ist.

        int num1 = 12;

        if (num1 % 2 == 0) {

            if (num1 % 3 == 0) {
                System.out.println(num1 + " ist durch 2,3 und 6 teilbar");
            } else {
                System.out.println(num1 + " ist nicht durch 3 teilbar");
            }

        } else {
            System.out.println(num1 + " ist nicht durch 2 teilbar");
        }


    }


}
