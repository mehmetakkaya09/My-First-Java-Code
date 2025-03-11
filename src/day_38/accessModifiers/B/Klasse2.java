package day_38.accessModifiers.B;

import day_38.accessModifiers.A.Klasse1;

public class Klasse2 {

    public static void main(String[] args) {

        Klasse1 k1 = new Klasse1("","","");

        k1.publicInstance = "public";


        Kinder2 k2 = new Kinder2();

        k2.publicInstance = "public";

    }


}
