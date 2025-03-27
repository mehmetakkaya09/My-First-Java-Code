package day_48;

import java.util.HashMap;
import java.util.Map;

public class _01MapMethods {
    public static void main(String[] args) {

        Map<String, Double> fruits = new HashMap<>();

        fruits.put("Apple", 2.0);
        fruits.put("Orange", 2.5);
        fruits.put("Banana", 4.0);
        fruits.put("Cherry", 3.0);

        System.out.println("fruits.get(\"Cherry\") = " + fruits.get("Cherry"));

        System.out.println("fruits.remove(\"Apple\") = " + fruits.remove("Apple"));

        System.out.println(fruits);

        System.out.println("fruits.remove(\"Watermelon\") = " + fruits.remove("Watermelon"));

        // Wenn wir Banana Key haben, können wir diese Wert nur aktualisieren.
        fruits.put("Banana", 5.0);

        // Wenn wir Banana Key haben, macht Java nichts
        fruits.putIfAbsent("Banana", 6.0);

        fruits.putIfAbsent("Watermelon", 7.0);

        System.out.println("fruits.get(\"Banana\") = " + fruits.get("Banana"));

        System.out.println(fruits);

        System.out.println("fruits.containsKey(\"Orange\") = " + fruits.containsKey("Orange"));
        System.out.println("fruits.containsKey(\"Apple\") = " + fruits.containsKey("Apple"));
        System.out.println("fruits.containsValue(2.0) = " + fruits.containsValue(2.0));
        System.out.println("fruits.containsValue(2.5) = " + fruits.containsValue(2.5));

    }
}
