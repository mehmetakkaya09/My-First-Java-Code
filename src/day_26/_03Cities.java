package day_26;

import java.util.ArrayList;

public class _03Cities {

    public static void main(String[] args) {

        ArrayList<String> cities = new ArrayList<>();

        cities.add("London");
        cities.add("New York");
        cities.add("Paris");
        cities.add("New York");
        cities.add("Berlin");
        cities.add("Wien");
        cities.add("New York");
        cities.set(1,"Bochum");
        cities.add("New York");
        cities.add("New York");

        System.out.println(cities);

//        cities.get(0);
//        cities.get(1);
//        cities.get(2);

        for (String city : cities) {
            System.out.println(city + ",");
        }

        System.out.println("****************");

        for (int i = 0; i < cities.size(); i++) {
            System.out.println(cities.get(i) + "!");
        }

        System.out.println(cities);
        cities.remove("New York"); // sucht abhangige Objekt und löscht NUR ERSTE OBJEKT
        System.out.println(cities);
        cities.remove("New York");
        System.out.println(cities);

        int index = cities.indexOf("New York");
        System.out.println(index);

        int lastIndexOf = cities.lastIndexOf("New York");
        System.out.println(lastIndexOf);

        System.out.println(cities);
        System.out.println("cities.get(6) = " + cities.get(6));
        cities.set(6, "Madrid");
        System.out.println("cities.get(6) = " + cities.get(6));
        System.out.println(cities);

        cities.clear();
        System.out.println("cities.size() = " + cities.size());
        System.out.println(cities.isEmpty());
        System.out.println(cities);

    }
}
