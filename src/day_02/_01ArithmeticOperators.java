package day_02;

public class _01ArithmeticOperators {

    public static void main(String[] args) {

        // + addition
        // - substraktion
        // * multiplikation
        // / division
        // % modula (restwert)

        int num1 = 5;
        int num2 = 11;

        int sum = num1 + num2;
        System.out.println("sum = " + sum);

        int diff = num2 - num1 * num2 / num1;
        System.out.println("diff = " + diff);

        int multiply = num1 * num2;
        System.out.println("multiply = " + multiply);

        int divide = num2 / num1;
        System.out.println("divide = " + divide);

        int remainder = num2 % num1;
        System.out.println("remainder = " + remainder);

        // Prioritat
        // Multiplikation und Division hat hohe prioritat
        // Addition und Substaktion hat zweite prioritat

        // Wenn es in einer Zeile ein Klammern gibt, funktioniert zuerst diese Klammern.

        int res = 7 - 2 * 4 * 3 + (5 + 6) / 2; // 1= (5 + 6)  2= 2 * 4  3=  8 * 3  zuletzt Division
        System.out.println("res = " + res);

        int res2 = 3 + 4 * 4 + 5 * (4 + (3 + 2)) -1; // 16 + 45 + 3 - 1
        System.out.println("res2 = " + res2);

        int res3 = 3 + 4 * 4 + (2 * 3) + 5 * (4 + 3) - 5; // 6 16 35 3 -5
        System.out.println("res3 = " + res3);

        double meilenZuKmWert = 1.6;

        int meile = 5;

        System.out.println(meile + " meile is " + (meile * meilenZuKmWert) + " kilometar");


    }




}
