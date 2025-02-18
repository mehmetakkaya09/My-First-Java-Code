package day_26;

import java.util.ArrayList;
import java.util.Arrays;

public class _01ArrayLists {

    public static void main(String[] args) {

        // In Arrays gibt es immer eine bestimmte Grösse
        // Wir können diese Grösse nicht verandern.
        // wir können primitive Datatypen benutzen -- byte, int, double...

        // Die ArrayList-Klasse ist ein größenveränderbares Array
        // Wir sollen eine eine bestimmte Grösse nicht definieren
        // Immer können wir das verandern, indem wir etwas hinzufügen oder entfernen/löschen
        // wir dürfen nicht primitive Datatypen benutzen
        // nur Wrappers können wir in ArrayLists benutzen

        ArrayList<String> vornamen = new ArrayList<>();
        //ArrayList<int> nums = new ArrayList<>();  primitive Datatypen kann man nicht verwenden.

        vornamen.add("Sureyya");
        vornamen.add("Vadim");
        vornamen.add("Vadim");
        vornamen.add("Blagoja");
        vornamen.add("Mehmet");

        System.out.println(vornamen);

        System.out.println("*********************");
        int[] nums = new int[2]; // primitive Datatypen kann man verwenden.
        String[] vornamenArray = new String[4];
        vornamenArray[0] = "Sureyya";
        vornamenArray[1] = "Vadim";
        vornamenArray[2] = "Blagoja";
        vornamenArray[3] = "Mehmet";

        System.out.println(vornamenArray[2]);

        System.out.println(Arrays.toString(vornamenArray));

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(24);
        numbers.add(100);
        numbers.add(321);
        numbers.add(new Integer(33));
        numbers.add(new Integer("78"));

        System.out.println(numbers);
        System.out.println(numbers.get(1));
        System.out.println(vornamen.get(0));
        System.out.println(vornamen.get(2));

        System.out.println(vornamenArray.length);
        System.out.println(vornamen.size());
        System.out.println(numbers.size());

        // toString() method verwendet man, um eine Objekt zu einer String umzuwandeln.

        String firstnames = vornamen.toString();
        System.out.println(firstnames);

        String numStr = numbers.toString();
        System.out.println(numStr);


    }
}
