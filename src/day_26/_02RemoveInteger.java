package day_26;

import java.util.ArrayList;

public class _02RemoveInteger {

    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>(); //Wrapper

        System.out.println("nums.size() = " + nums.size());

        System.out.println("nums.isEmpty() = " + nums.isEmpty());

        System.out.println("(nums.size() == 0) = " + (nums.size() == 0));

        nums.add(1);
        nums.add(55);
        nums.add(22);
        nums.add(60);
        nums.add(41);
        nums.add(100);
        nums.add(11);

        System.out.println("nums.size() = " + nums.size());
        System.out.println("nums.isEmpty() = " + nums.isEmpty());


        System.out.println("nums.get(4) = " + nums.get(4));
        System.out.println("nums.get(6) = " + nums.get(6));
        System.out.println("nums.get(nums.size()-1) = " + nums.get(nums.size() - 1));

        System.out.println(nums);
        System.out.println("nums.get(3) = " + nums.get(3));
        nums.remove(3); // je nach index nummer können wir ein Element einfach löschen
        System.out.println(nums);
        System.out.println("nums.get(3) = " + nums.get(3));

        Integer num = 100; // Integer Class Objekt --- nicht ein primitive variable

        System.out.println("nums.get(4) = " + nums.get(4));
        System.out.println(nums);
        //nums.remove(100); wenn wir ein primitive Datatypen (byte, int, double...) eingeben, können wir nur diese index Element löschen
        nums.remove(num);
        System.out.println("nums.get(4) = " + nums.get(4));
        System.out.println(nums);

        System.out.println("nums.get(3) = " + nums.get(3));
        nums.remove(new Integer(41));
        System.out.println("nums.get(3) = " + nums.get(3));
        System.out.println(nums);

        System.out.println("nums.get(2) = " + nums.get(2));
        nums.add(2, 33);
        System.out.println("nums.get(2) = " + nums.get(2));
        System.out.println(nums);
    }

}
