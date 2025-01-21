package day_03;

public class _01AssignmentOperators {

    public static void main(String[] args) {

        int num1 = 5;
        int num2 = 10;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        num1 = num1 + num2;
        num1 += num2;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        num1 -= num2;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        num1 *= num2;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        num1 /= num2;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        num1 %= num2;

        System.out.println("num1 = " + num1);
        System.out.println("num2 = " + num2);

        //Tausche 2 gegebene Zahlenwerte miteinander

        int num3 = 3;
        int num4 = 4;
        int temp;

        temp = num3;
        num3 = num4;//4
        num4 = temp;//3

        System.out.println("num3 = " + num3);
        System.out.println("num4 = " + num4);



    }
}
