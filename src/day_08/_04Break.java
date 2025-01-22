package day_08;

import java.util.Scanner;

public class _04Break {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number that you want to buy: ");
        int socksNumber = sc.nextInt();
        int limit = 20;


        for (int i = 1; i <= socksNumber; i++) {
            System.out.println("You bought " + i + " socks");
            if (i == limit) {
                System.out.println("You can buy just 20 socks");
                break;
            }
            System.out.println(i);
        }


    }


}
