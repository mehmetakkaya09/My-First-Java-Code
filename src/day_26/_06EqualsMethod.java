package day_26;

import java.util.ArrayList;

public class _06EqualsMethod {

    public static void main(String[] args) {

        ArrayList<String> list1 = new ArrayList<>();

        list1.add("Jan");
        list1.add("Feb");
        list1.add("Mar");
        list1.add("Apr");
        list1.add("Mai");

        ArrayList<String> months = new ArrayList<>(list1);

        if (months.equals(list1)) {
            System.out.println("Beide List sind gleich");
        }else {
            System.out.println("Beide List sind nicht gleich");
        }

        months.add("Jun");


        if (months.equals(list1)) {
            System.out.println("Beide List sind gleich");
        }else {
            System.out.println("Beide List sind nicht gleich");
        }

        if (months.containsAll(list1)) {
            System.out.println("Beide List sind gleich");
        }else {
            System.out.println("Beide List sind nicht gleich");
        }


        System.out.println(months);
        System.out.println(list1);

        if (list1.containsAll(months)) {
            System.out.println("Beide List sind gleich");
        }else {
            System.out.println("Beide List sind nicht gleich");
        }






    }


}
