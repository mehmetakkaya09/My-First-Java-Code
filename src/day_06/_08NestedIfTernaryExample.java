package day_06;

import java.util.Scanner;

public class _08NestedIfTernaryExample {

    public static void main(String[] args) {

        //- Schreiben Sie eine Programme, die drei ganze Zahlen als Parameter erhält und die größte Zahl ausgibt.

        Scanner scanner = new Scanner(System.in);

        System.out.print("Please enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Please enter the second number: ");
        int num2 = scanner.nextInt();

        System.out.print("Please enter the third number: ");
        int num3 = scanner.nextInt();

        int max = 0;

        if (num1 > num2 && num1 > num3) {
            max = num1;
        } else if (num2 > num3) {
            max = num2;
        }else
            max = num3;

        max = (num1 > num2 && num1 > num3) ? num1 : (num2 > num3) ? num2 : num3;

        System.out.println(max);


    }


}
