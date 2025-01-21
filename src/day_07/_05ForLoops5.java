package day_07;

public class _05ForLoops5 {
    public static void main(String[] args) {

        // erstellen Sie ein For Loop und geben Sie gerade Zahlen von 100 bis 0 aus

        for (int i = 100; i >= 0; i--) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

        for (int i = 100; i >= 0; i -= 2) {
            System.out.println(i);
        }

    }
}
