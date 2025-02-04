package day_17;

import java.util.Random;
import java.util.Scanner;

public class _02PickNumber {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Geben Sie eine Zahl zwischen 1 und 10: ");
        int pickedNumber = sc.nextInt();

        Random rand = new Random();


        int count = 0;

        while (true) {

            int targetNumber = rand.nextInt(10) + 1;
            System.out.println("Target number is " + targetNumber);

            count++;

            if (pickedNumber == targetNumber) {
                System.out.println("You found your number in " + count + " times");
                break;
            }

        }

    }


}
