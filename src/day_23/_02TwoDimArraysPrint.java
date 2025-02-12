package day_23;

import utils.ArrayUtil;

import java.util.Arrays;

public class _02TwoDimArraysPrint {

    public static void main(String[] args) {

        String[][] users = new String[4][3];

        users[0][0] = "Sureyya";
        users[0][1] = "Durak";
        users[0][2] = "sureyya@eurotech.com";
        users[1][0] = "Blagoja";
        users[1][1] = "Andreevski";
        users[1][2] = "blagoja@eurotech.com";
        users[2][0] = "Vadim";
        users[2][1] = "Dokuchaev";
        users[2][2] = "dokuchaev@eurotech.com";
        users[3][0] = "Mehmet";
        users[3][1] = "Akkaya";
        users[3][2] = "mehmet@eurotech.com";

        System.out.println(Arrays.deepToString(users));

        System.out.println("*****************************************");

        for (int i = 0; i < users.length; i++) {
            System.out.println(Arrays.toString(users[i]));
        }

        System.out.println("*****************************************");

        for (int i = 0; i < users.length; i++) {
            for (int j = 0; j < users[i].length; j++) {
                System.out.print(users[i][j] + "\t\t");
            }
            System.out.println();
        }

        System.out.println("*****************************************");

        for (String[] user:users){
            for (String info:user){
                System.out.print(info + "\t\t");
            }
            System.out.println();
        }

        System.out.println("*****************************************");

        for (String[] user:users){
            System.out.println(Arrays.toString(user));
        }

        int[][] nums = {
                {2,6,7,8},
                {4,8,1,9},
                {1,1,0,3}
        };

        ArrayUtil.print2DimArray(nums);
    }

}
