package day_16;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ScannerExp {

    public static void main(String[] args) {

        Scanner tastatur = new Scanner(System.in);
        System.out.print("Enter your age : ");
        int age = tastatur.nextInt();

        System.out.print("Enter your name : ");
        String name = tastatur.next(); //Enter

        tastatur.nextLine();
        System.out.print("Enter your address : ");
        String address = tastatur.nextLine();

        System.out.println("name = " + name);
        System.out.println("address = " + address);

        tastatur.close();

    }

}
