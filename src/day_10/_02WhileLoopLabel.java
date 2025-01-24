package day_10;

public class _02WhileLoopLabel {

    public static void main(String[] args) {

        int i;

        firstLoop:
        do {
            i = 8;

            secondLoop:
            while (true) {
                System.out.println("i = " + i--);
                if (i == 4) {
                    break firstLoop;
                }
            }

        } while (true);


    }


}
