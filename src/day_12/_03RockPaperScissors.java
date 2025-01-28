package day_12;

public class _03RockPaperScissors {

    // Ein Programm schreiben, das das Spiel Schere-Stein-Papier simuliert und den Gewinner bestimmt.

    // public static String schereSteinPapier(String wert1, String wert2){
    // String result = "";
    // if(wert1 == wert2){
    // result = "Unentschieden";
    // } else if()

    public static String schereSteinPapier(String person1, String person2) {

        String result = "";

        if(person1 == person2){
            result = "Unentschieden";
        } else if (person1 == "Stein" && person2 == "Schere") {
            result = "Spieler 1 gewinnt";
        } else if (person1 == "Schere" && person2 == "Papier") {
            result = "Spieler 1 gewinnt";
        }else if (person1 == "Papier" && person2 == "Stein") {
            result = "Spieler 1 gewinnt";
        } else {
            result = "Spieler 2 gewinnt";
        }

        return result;

    }

    public static void main(String[] args) {
        String res1 = schereSteinPapier("Stein", "Schere");
        System.out.println("res1 = " + res1);
        String res2 = schereSteinPapier("Schere", "Stein");
        System.out.println("res2 = " + res2);
        String res3 = schereSteinPapier("Papier", "Papier");
        System.out.println("res3 = " + res3);
        String res4 = schereSteinPapier("Stein", "Papier");
        System.out.println("res4 = " + res4);
    }




}
