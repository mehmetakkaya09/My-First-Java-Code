package day_04;

public class _04MultiwayIfElseStatements {

    public static void main(String[] args) {

        // wenn gehalt zwischen 1000-2000
        // wenn gehalt zwischen 2000-3000
        // wenn gehalt zwischen 4000-5000
        //1453

        int dayOfWeek = 70;

        if (dayOfWeek == 1) {
            System.out.println("It is Monday");
        } else if (dayOfWeek == 2) {
            System.out.println("It is Tuesday");
        } else if (dayOfWeek == 3) {
            System.out.println("It is Wednesday");
        } else if (dayOfWeek == 4) {
            System.out.println("It is Thursday");
        } else if (dayOfWeek == 5) {
            System.out.println("It is Friday");
        } else if (dayOfWeek == 6) {
            System.out.println("It is Saturday");
        } else if (dayOfWeek == 7) {
            System.out.println("It is Sunday");
        } else {
            System.out.println("Invalid day");
        }
        // wenn score mehr als
        // 90 ist note = A
        // 80 - 90 B
        // 70 - 80 C
        // 60 - 70 D
        // 50 - 60 E
        // F
        int score = 55; // 0 - 100
        String note;

        if (score >= 0 && score <= 100) {

            if (score >= 90) {
                note = "A";
            } else if (score >= 80) {
                note = "B";
            } else if (score >= 70) {
                note = "C";
            } else if (score >= 60) {
                note = "D";
            } else if (score >= 50) {
                note = "E";
            } else {
                note = "F";
            }
            System.out.println("note = " + note);

        } else {
            System.out.println("Invalid score");
        }

        // Schreiben Sie einen Code, der die Jahreszeit anhand des angegebenen Monatswertes erkennt

        int month = 6;
        String season = "";

        if (month > 0 && month <= 12) {
            if (month >= 3 && month <= 5) {
                season = "Spring";
            } else if (month >= 6 && month <= 8) {
                season = "Summer";
            } else if (month >= 9 && month <= 11) {
                season = "Autumn";
            } else {
                season = "Winter";
            }
            System.out.println("season = " + season);
        } else {
            System.out.println("Invalid month");
        }

    }
}
