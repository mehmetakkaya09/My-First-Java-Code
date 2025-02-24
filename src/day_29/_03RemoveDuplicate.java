package day_29;

import java.util.ArrayList;
import java.util.Collections;

public class _03RemoveDuplicate {

    public static void main(String[] args) {

        // aus einer String List sollen Sie Duplikaten löschen
        //

        ArrayList<String> names = new ArrayList<>();
        names.add("John");
        names.add("Mike");
        names.add("Smith");
        names.add("John");
        names.add("Mary");
        names.add("Jack");
        names.add("Mary");
        names.add("Smith");
        names.add("John");

        removeDuplicate(names);

    }
    public static void removeDuplicate(ArrayList<String> list){

        Collections.sort(list);

        ArrayList<String> uniqueList = new ArrayList<>();

        if (!list.isEmpty()) {
            uniqueList.add(list.get(0));
        }

        for (int i = 1; i < list.size(); i++) {
            if (!list.get(i).equals(list.get(i - 1))) {
                uniqueList.add(list.get(i));
            }
        }


        System.out.println(uniqueList);
    }



}
