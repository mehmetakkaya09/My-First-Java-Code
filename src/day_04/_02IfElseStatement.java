package day_04;

public class _02IfElseStatement {

    public static void main(String[] args) {

        // Einen Code schreiben, der überprüft, ob eine Person wahlberechtigt ist
        // Wenn die Person 18 Jahre oder älter ist ==> „Wahlberechtigt“

        int alt = -6;

        if (alt >= 18){
            System.out.println("Wahlberechtigt");
        }else {
            System.out.println("Nicht Wahlberechtigt");
        }

        //gerade oder ungerade zahl

        int num3 = 4;

        if(num3 % 2 == 0){
            System.out.println(num3 + " ist ein gerades Zahl");
        }else {
            System.out.println(num3 + " ist ein ungerades Zahl");
        }

        //Schreiben Sie ein Programm zur Berechnung der Fläche eines Kreises

        // area = pi * radius * radius;

        int radius = -4;
        double area = 0;
        double pi = 3.14;

        if (radius > 0){
            area = pi * radius * radius;
            System.out.println(area);
        }else {
            System.out.println(radius + " ist ein negatives Wert");
        }

        //Schreiben Sie ein Programm, das feststellt, ob eine gegebene Zahl eine positive oder negative Zahl ist.

        // Schreiben Sie eine if-statement, die besagt, dass eine Person in den Genuss der Ermäßigung kommen kann,
        // wenn sie ein Student zwischen 18 und 30 Jahren ist, und dass sie nicht in den Genuss der Ermäßigung kommen kann,
        // wenn sie keine der genannten Bedingungen erfüllt

        int alt3 = 20;
        boolean isStudent = true;

        if (alt3 >= 18 && alt3 <= 30 && isStudent){
            System.out.println("Diese Person ist passend");
        }else {
            System.out.println("Diese Person ist nicht passend");
        }






    }
}
