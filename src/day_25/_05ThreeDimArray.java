package day_25;

public class _05ThreeDimArray {

    public static void main(String[] args) {

        // zeilen spalten
        // zeilen 2 unterschiedliche Spalten
        // Schüler hat 2 Unterricht
        // Jede Unterricht hat 2 Prüfung

        int[][][] studentNoten  = new int[3][2][2];

        int[][][] studentNoten2 = {
                {
                    {79,90},{80,67}
                },
                {
                    {45,78},{76,89}
                },
                {
                    {77,80},{85,98}
                }
        };

        System.out.println("studentNoten2[1][0][1] = " + studentNoten2[1][0][1]);
        System.out.println("studentNoten2[2][1][0] = " + studentNoten2[2][1][0]);
        System.out.println("studentNoten2[2][1][1] = " + studentNoten2[2][1][1]);


    }

}
