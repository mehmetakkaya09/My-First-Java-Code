package day_07;

import java.util.Scanner;

public class _06Homework {

    public static void main(String[] args) {

        //2. Erhalten Sie eine positive Zahl vom Benutzer. Schreiben Sie ein Programm, das die Ziffern in den Ziffern dieser Zahl addiert.
        //Beispiel:
        //Zahl : 345 95 4 1100      zahl % 10 = 5
        //                          zahl /= 10 = 34
        //                          zahl % 10 = 4
        //                          zahl /= 10 = 3
        //                          zahl % 10 = 3
        //Summe der Ziffern: 3 + 4 + 5 = 12

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive number : ");
        int num = sc.nextInt();
        int sum = 0;
        for (int i = num; i > 0; i /= 10) {
            sum += i % 10;
            System.out.println("i = " + i + " sum = " + sum);
        }









    }


}
