package day_29;

import java.util.ArrayList;
import java.util.Arrays;

public class _01ArrayListReview {

    public static void main(String[] args) {

        // Arrays hat eine bestimmte Groesse
        // ArrayList hat dynamische Groesse
        // Arrays nimmt alle Datatype
        // ArrayList nimmt nur Klassenobjekten und Wrappers --- Student, Integer, String...
        // ArrayList hat vorbereitete methoden wie add, remove, set...

        ArrayList<Integer> list = new ArrayList<>();
        list.add(34);
        list.add(78);
        list.add(45); // 20
        list.add(56);  // 2. 100
        list.add(78);
        list.add(90);

        System.out.println("list.size() = " + list.size());

        System.out.println("list.isEmpty() = " + (list.isEmpty()));

//        list.get(0);
//        list.get(1);
        list.add(2, 100);
        list.set(1,20);

        list.remove(list.size()-1);
        //list.remove(78);                    // int primitive Datatype
        //list.remove(new Integer(78));       // Integer Wrapper Klasse Objekt
        list.remove(Integer.valueOf(78));  // Integer.valueOf() methode gibt ein Integer Objekt zurück

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println("*****************");

        for (Integer i : list) {
            System.out.println(i);
        }

        System.out.println("list.contains(20) = " + (list.contains(20)));
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(34);
        list2.add(20);
        list2.add(100);
        //list.removeAll(list2);

        System.out.println("list.containsAll(list2) = " + (list.containsAll(list2)));

        list.removeAll(Arrays.asList(34,20,100));

        System.out.println(list);

        list.clear();

        System.out.println("(list.isEmpty()) = " + (list.isEmpty()));


    }


}
