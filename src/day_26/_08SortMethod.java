package day_26;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class _08SortMethod {

    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(32,7,1789,45,0,-9,23,-234,10,7));

        System.out.println(nums);
        Collections.sort(nums);
        System.out.println(nums);

        ArrayList<String> list1 = new ArrayList<>();

        list1.add("Jan");
        list1.add("Feb");
        list1.add("Mar");
        list1.add("Apr");
        list1.add("mai");
        list1.add("Zug");
        list1.add("Mai");

        System.out.println(list1);

        Collections.sort(list1);

        System.out.println(list1);







    }

}
