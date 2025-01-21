package day_07;

public class _03ForLoops3 {

    public static void main(String[] args) {

        // Schreibe die Zahlen zwischen 1 und 100 auf, die genau durch 5 teilbar sind.

        // Schreibe ein Programm, das die Summe der geraden und ungeraden Zahlen zwischen 1 und 101 getrennt ermittelt.

        int geradeSum = 0;// 12
        int ungeradeSum = 0; // 9

        for (int i = 1; i <= 101; i++) {

            if (i % 2 == 0) {
                geradeSum += i;
                System.out.println("Gerade = " + i + " geradeSum = " + geradeSum);
            } else {
                ungeradeSum += i;
                System.out.println("Ungerade = " + i + " ungeradeSum = " + ungeradeSum);
            }

        }

        System.out.println("geradeSum = " + geradeSum);

        System.out.println("ungeradeSum = " + ungeradeSum);


    }

}
