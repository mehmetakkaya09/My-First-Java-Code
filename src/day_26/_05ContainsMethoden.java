package day_26;

import java.util.ArrayList;

public class _05ContainsMethoden {

    public static void main(String[] args) {

        ArrayList<String> list1 = new ArrayList<>();

        list1.add("Jan");
        list1.add("Feb");
        list1.add("Mar");
        list1.add("Apr");
        list1.add("Mai");

        ArrayList<String> list2 = list1;

        System.out.println("list1.get(0) = " + list1.get(0));
        System.out.println("list2.get(0) = " + list2.get(0));

        System.out.println(list1);
        System.out.println(list2);

        ArrayList<String> months = new ArrayList<>(list1);

        System.out.println(months.contains("Feb"));
        System.out.println(months.contains("Februar"));

        String month1 = months.get(1);

        System.out.println(months.indexOf("Feb") == 1);
        System.out.println(months.get(1).equals("Feb"));

        list2.add("Jun");

        System.out.println(months.containsAll(list2));

        System.out.println(list2.containsAll(months));

        System.out.println(list2);
        System.out.println(months);


    }


}
