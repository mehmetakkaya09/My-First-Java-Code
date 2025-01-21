package day_02;

public class _03UnaryOperators {

    public static void main(String[] args) {

        int a = 5;

        System.out.println(a);

        a += 1;

        System.out.println(a);

        int num = 10;

        //wenn wir pre-inkrement benutzen, erhöht unsere Zahl gleichzeitig
        System.out.println(++num); // 11 pre-increment

        //wenn wir pre-dekrement benutzen, verringert unsere Zahl gleichzeitig
        System.out.println(--num); // 10 pre-decrement

        //wenn wir post-inkrement benutzen, verandert das Wert gleichzeitig nicht. Sondern das Wert wird in nachste Reihe erhöht werden.
        System.out.println(num++); // 10 post-increment

        System.out.println(num); // 11

        //wenn wir post-dekrement benutzen, verandert das Wert gleichzeitig nicht. Sondern das Wert wird in nachste Reihe verringert werden.
        System.out.println(num--); // 11

        System.out.println(num); // 10




        int x = 20;
        int y = 30;

        System.out.println("x = " + x++); //20
        System.out.println("y = " + y++); //30

        //x = 21
        //y = 31

        System.out.println("x = " + --x); //20
        System.out.println("y = " + --y); //30

        int k = 50;
        int l = --k + k++ + k-- + k++; // 49 + 49 + 50 + 49 = 197

        //
        System.out.println("l = " + l);
        System.out.println("k = " + k);

        int c = 25;
        int d = c++ + c-- + --c + ++c + c--; // 25 + 26 + 24 + 25 + 25

        System.out.println("c = " + c);//24
        System.out.println("d = " + d);//125
















    }




}
