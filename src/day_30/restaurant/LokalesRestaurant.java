package day_30.restaurant;

import java.util.ArrayList;

public class LokalesRestaurant {

    public static void main(String[] args) {

        Kellner kellner1 = new Kellner("Jack", 1001, 40, true);
        Kellner kellner2 = new Kellner("Mary", 1002, 35, false);
        Kellner kellner3 = new Kellner("John", 1003, 45, true);

        Koch koch1 = new Koch("George", 2001, 60, false);
        Koch koch2 = new Koch("Michael", 2002, 55, true);
        Koch koch3 = new Koch("Hanna", 2003, 65, false);

//        System.out.println(kellner1);
//        System.out.println(kellner2);
//        System.out.println(kellner3);
//        System.out.println(koch1);
//        System.out.println(koch2);
//        System.out.println(koch3);

        Restaurant restaurant1 = new Restaurant("Sureyya", "Berlin", 5);

        ArrayList<Kellner> kellnerArrayList = new ArrayList<>(); // keine bestimmte Groesse
        Kellner[] kellnerArr = new Kellner[2]; // bestimmte Groesse

        kellnerArr[0] = kellner2;
        kellnerArr[1] = kellner3;

        restaurant1.addKellner(kellner1);
        restaurant1.addKellner(kellnerArr);

        restaurant1.addKoch(koch1);

        Koch[] kochArr = {koch2, koch3};

        restaurant1.addKoch(kochArr);

        System.out.println(restaurant1);

        restaurant1.removeKellner(1002);
        restaurant1.removeKoch(2003);

        System.out.println("******************");

        System.out.println(restaurant1);


    }


}
