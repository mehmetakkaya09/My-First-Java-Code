package day_08;

public class _06Continue {

    public static void main(String[] args) {

        for (int i = 0; i <= 10; i++) {
            if (i % 2 != 0) {
                //break;
                continue;
            }
            System.out.println("Gerade Zahlen : " + i);
        }

        // Geben Sie Arbeitstage in Console aus, indem Sie for loop und continue benutzen


        // 1 - 100
        // wenn nummer mit dem 5 teilbar ist, geben Sie diese Nummer in Console nicht aus.
        // wenn nummer mit dem 27 teilbar is, beenden Sie die Loop.

        for (int num = 1; num <= 100; num++) {
            if (num % 5 == 0) {
                continue;
            }
            if (num % 27 == 0) {
                break;
            }
            System.out.println(num);
        }


    }


}
