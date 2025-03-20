package day_44;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberDivision {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int zahl = 1;
        int teiler = 1;
        int ergebnis = 0;

        try {
            while (true) {
                try {
                    System.out.print("Bitte Geben Sie eine Zahl ein: ");
                    zahl = sc.nextInt();
                    System.out.println("Bitte Geben Sie eine Teiler ein: ");
                    teiler = sc.nextInt();
                } catch (InputMismatchException e) {
                    System.out.println("Bitte Geben Sie ein Integer ein");
                    sc.nextLine();
                }
                ergebnis = zahl / teiler;
                System.out.println("Ergebnis = " + ergebnis);
            }
        }catch (ArithmeticException e){
            System.out.println("Teiler kann nicht 0 sein" + e.getMessage());
        }finally {
            sc.close();
        }










    }


}
