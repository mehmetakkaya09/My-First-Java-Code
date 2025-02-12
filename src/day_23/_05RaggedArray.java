package day_23;

public class _05RaggedArray {

    public static void main(String[] args) {

        // ungeordnete array

        int[][] triangle = new int[5][];

        triangle[0] = new int[5];
        triangle[1] = new int[4];
        triangle[2] = new int[3];
        triangle[3] = new int[2];
        triangle[4] = new int[1];

        for (int i = 0; i < triangle.length; i++) {
            for (int j = 0; j < triangle[i].length ; j++) {
                triangle[i][j] = j + 1;
                System.out.print(triangle[i][j] + " ");
            }
            System.out.println();
        }




    }

}
