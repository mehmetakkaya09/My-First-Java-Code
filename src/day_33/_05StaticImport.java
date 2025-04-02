package day_33;

import day_32.Rechner;

import static day_32.Rechner.*;

import static java.lang.Math.pow;
import static java.lang.Math.addExact;
import static java.lang.Math.*;


public class _05StaticImport {

    public static void main(String[] args) {

        System.out.println(Math.pow(2, 5));
        System.out.println(Math.addExact(2, 5));
        System.out.println(Math.sqrt(9));
        System.out.println(Math.PI);

        System.out.println("Rechner.addieren(2,7) = " + addieren(2, 7));
        System.out.println("Rechner.subtrahieren(10,3) = " + subtrahieren(10, 3));
        System.out.println("Rechner.multiplizieren(3,6) = " + multiplizieren(3, 6));
        System.out.println("Rechner.dividieren(50,5) = " + dividieren(50, 5));


    }


}
