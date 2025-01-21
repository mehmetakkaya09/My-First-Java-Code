package day_03;

public class _05LogicalOperatorNOT {

    public static void main(String[] args) {

        boolean b1 = 22 >= 32;

        boolean b2 = 11 <= 11;

        boolean res = b1 && b2;

        System.out.println(res);

        res = !b1 && b2; //true && true

        System.out.println(res);

        System.out.println(!(2 != 2) && (2 != 11));







    }
}
