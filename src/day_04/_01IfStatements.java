package day_04;

public class _01IfStatements {

    public static void main(String[] args) {
        boolean b = 2 == 3;



        if (2 == 2) {
            System.out.println("2 ist gleich mit 2");
            System.out.println("letzte Reihe");
        }

//        if (wetter == "sonnig"){
//            System.out.println("Ich kann schwimmen");
//        }

        int num = -5;

        if (num > 0){ //
            System.out.println(num + " ist ein positives Nummer");
        }

        if (num < 0){
            System.out.println(num + " ist ein negatives Nummer");
        }

        // Schreiben Sie eine if-Anweisung, die das Gehalt mit 1,5 multipliziert, wenn die Stundenzahl größer als 38 ist.

        // Schreiben Sie eine if-Anweisung, die das Gehalt um 3 % erhöht, wenn die score größer als 90 ist.

        int score = 91;

        double gehalt = 3000;

        if (score > 90){
            gehalt += (gehalt * 3 / 100);
        }else {
            gehalt += (gehalt * 1 / 100);
        }

        System.out.println("Gehalt ist " + gehalt);


        // Schreiben Sie ein Programm, das bei einem Multiplikator von 5 „Hi Five“ anzeigt.
        // Wenn die Zahl durch 2 teilbar ist, wird „Hi Even“ angezeigt/gedruckt.

        int num2 = 15;

        //boolean b2 = num2 % 5 == 0;

        //System.out.println(b2);

        if (num2 % 5 == 0) {
            System.out.println("Hi Five");
        }

        if (num2 % 2 == 0){
            System.out.println("Hi Even");
        }







    }


}
