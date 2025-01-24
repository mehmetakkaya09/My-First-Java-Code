package day_10;

public class _01ForLoopsLabel {

    public static void main(String[] args) {

        // Ein Programm, das prüft, ob das Produkt der Werte i und j
        // in der verschachtelten Schleife die Zielzahl erreicht,
        // und die Schleife beendet, wenn die Zielzahl gefunden wird.
        int zielZahl = 15;
        boolean gefunden = false;


        outerLoop:
        for (int i = 1; i < 10; i++) {
            System.out.println("i = " + i);

            innerLoop:
            for (int j = 1; j < 10; j++) {
                if ((i * j) == zielZahl) {
                    System.out.println("Zielnummer erreicht! - " + zielZahl);
//                    if (true) {
//                        System.out.println();
//                        break outerLoop;
//                    }
                    gefunden = true;
                    break outerLoop;
                }
//                if (j * j == zielZahl) {
//                    System.out.println();
//                    continue outerLoop;
//                }
            }
        }

        //System.out.println(gefunden);


    }

}
