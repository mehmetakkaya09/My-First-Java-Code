package day_06;

import java.util.Scanner;

public class _01Scanner {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter an int number: ");
        int num = input.nextInt();

        System.out.println("num = " + num);

        System.out.print("Enter a double number: ");
        double doubleNum = input.nextDouble();

        System.out.println("doubleNum = " + doubleNum);

        System.out.print("Enter a byte number: ");
        byte byteNum = input.nextByte();

        System.out.println("byteNum = " + byteNum);

        System.out.print("Enter a short number: ");
        short shortNum = input.nextShort();

        System.out.println("shortNum = " + shortNum);

        System.out.print("Enter a long number: ");
        long longNum = input.nextLong();

        System.out.println("longNum = " + longNum);

        System.out.print("Enter a float number: ");
        float floatNum = input.nextFloat();

        System.out.println("floatNum = " + floatNum);

        System.out.print("Bist du +18 (true/false): ");
        boolean bool = input.nextBoolean();

        System.out.println("bool = " + bool);

        System.out.print("Geben Sie ein Wort ein : ");
        String word = input.next();

        System.out.println("word next() = " + word);
        input.nextLine();
        System.out.print("Geben Sie ein Satz ein : ");
        String satz = input.nextLine();

        System.out.println("satz nextLine() = " + satz);

        input.close();
    }


}
