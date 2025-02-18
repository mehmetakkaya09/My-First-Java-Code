package day_26;

import java.util.ArrayList;

public class _04AddAll {

    public static void main(String[] args) {

        ArrayList<String> cars1 = new ArrayList<>();
        cars1.add("Mazda");
        cars1.add("BMW");

        ArrayList<String> cars2 = new ArrayList<>();
        cars2.add("Honda");
        cars2.add("Audi");

        System.out.println(cars1);
        System.out.println(cars2);

        cars1.addAll(cars2);

        System.out.println(cars1);
        System.out.println(cars2);

        cars2.addAll(0, cars1);

        System.out.println(cars1);
        System.out.println(cars2);


    }
}
