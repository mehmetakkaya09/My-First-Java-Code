package day_39;

import java.util.ArrayList;

public class _02FinalVariables {

     // wir müssen immer Instance Final Variables initialisieren. Dafür gibt es 3 Option;
     final String instanceFinal = "instanceFinal"; // 1. Option: man kann in gleiche Zeile initialisieren

    final String instanceFinal2; // null

    final String instanceFinal3; // null

    final static String staticFinal = "staticFinal";// 1. Option: man kann in gleiche Zeile initialisieren
    final static String staticFinal2;

    static {
        staticFinal2 = "staticFinal2"; // 2. Option: man kann innerhalb static Block initialisieren
    }

    public _02FinalVariables(){
        instanceFinal2 = "instanceFinal2";// 2. Option: man kann innerhalb Constructor initialisieren
        //staticFinal2 = "staticFinal2";
    }

    {
        instanceFinal3 = "instanceFinal3";// 3. Option: man kann innerhalb init Block initialisieren
    }



    public static void main(String[] args) {

        final String str; // Locals hat keine Werte
        str = "Hello World"; // Local Final Variables kann man in nachsten Zeilen definieren

        // str = "neue"; Final Variables kann man nicht verandern.

        final int[] arr = new int[2];

        System.out.println("System.identityHashCode(arr) = " + System.identityHashCode(arr));
        arr[0] = 10;
        arr[1] = 20;

        // Final Array/ArrayList Werte kann man verandern.
        arr[0] = 30;

        int arr2[] = new int[2];

        arr2[0] = 40;
        arr2[1] = 50;

        System.out.println("System.identityHashCode(arr2) = " + System.identityHashCode(arr2));

        // Aber Array/ArrayList kann man selbst nicht verandern.
        // arr = arr2;

        System.out.println("System.identityHashCode(arr) = " + System.identityHashCode(arr));

        final ArrayList<Integer> numsList = new ArrayList<>();

        numsList.add(10);
        numsList.add(20);

        numsList.set(0, 60);

        System.out.println(numsList);


        final ArrayList<Integer> numsList2 = new ArrayList<>();

        numsList2.add(10);
        numsList2.add(20);

        numsList2.remove(1);

        System.out.println(numsList2);

        //numsList = numsList2;


    }


}
