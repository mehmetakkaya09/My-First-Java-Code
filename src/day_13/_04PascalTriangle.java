package day_13;

public class _04PascalTriangle {

    public static void main(String[] args) {

        // Zeichnen Sie das folgende Muster mit Zahlen:

//                1
//               1 1
//              1 2 1
//             1 3 3 1
//            1 4 6 4 1
        pascalTriangle(5);
    }

    public static void pascalTriangle(int n) {

        for (int i = 0; i < n; i++) {
            for (int k = n; k > i; k--){
                System.out.print(" ");
            }
            int zahl = 1;
            for (int j = 0; j <= i ; j++) {
                System.out.print(zahl + " ");
                zahl = zahl * (i - j) / (j + 1);
            }
            System.out.println();
        }

    }

}
