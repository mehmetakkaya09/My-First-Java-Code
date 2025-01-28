package day_12;

public class _04AgeCategory {

    public static void main(String[] args) {
        // diese Method wird ein String zurückgeben
        // wird ein alt parameter bekommen
        // wenn alt kleiner als 13 ist, wird unsere ergebnis "Kind" sein
        // zwischen 13 - 20 ---> "Jugendlicher"
        // 20 - 60 --- > "Erwachsener"
        // grosser als 60 ---> "Rentner"
    }

    public static String ageCategory(int age) {

        String res = "";

        if (age < 13) {
            return "Kind";
        } else if (age <= 20) {
            return "Jugendlicher";
        }else if (age <= 60) {
            return "Erwachsener";
        } else {
            return "Rentner";
        }
        //return res;
    }

}
