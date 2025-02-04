package day_17;

import java.util.Random;

public class _01RandomClass {

    public static void main(String[] args) {

        Random zufallZahl = new Random();

        int intZufallZahl = zufallZahl.nextInt();

        System.out.println("intZufallZahl = " + intZufallZahl);

        int zahlZwischen0Bis99 = zufallZahl.nextInt(100); // 0 - 99
        int zahlZwischen0Bis100 = zufallZahl.nextInt(100 + 1);

        System.out.println("zahlZwischen0Bis99 = " + zahlZwischen0Bis99);
        System.out.println("zahlZwischen0Bis100 = " + zahlZwischen0Bis100);

        System.out.println(zufallZahl.nextDouble());
        System.out.println(zufallZahl.nextFloat());
        System.out.println(zufallZahl.nextBoolean());
        System.out.println(zufallZahl.nextLong());
        //12356   9842134
        // 18 - 100
        // 0 + 18  = 18 + 82 = 100
        int zahlZwischen18Bis100 = 18 + zufallZahl.nextInt(82); // 0 - 81
        int zahlZwischen18Bis100Formula = zufallZahl.nextInt(100 - 18) + 18; // 0 - 81

        System.out.println("zahlZwischen18Bis100 = " + zahlZwischen18Bis100);
        System.out.println("zahlZwischen18Bis100Formula = " + zahlZwischen18Bis100Formula);

        System.out.println(zufallZahl.nextInt(1));//0
        System.out.println(zufallZahl.nextInt(10 - 1) + 1);//1-10
        System.out.println(zufallZahl.nextInt(10) + 5);// 5-14
        System.out.println(zufallZahl.nextInt(1) + 3);// 3
        System.out.println(zufallZahl.nextInt(2) + 1);// 1 , 2
        System.out.println(zufallZahl.nextInt(100) - 50);// -50 - +49


    }

}
