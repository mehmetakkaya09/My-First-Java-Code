package review;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;

public class RemovePalindromes {

    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.addAll(
                Arrays.asList("Java", "Python", "Eurotech", "Car", "Level", "civic", "radar", "kayak", "reviver", "racecar", "madam", "rentner")
        );

        Iterator<String> it = names.iterator();

        while (it.hasNext()) {
            String each = it.next();
            String reverse = "";
            for (int i = each.length() - 1; i >= 0; i--) {
                reverse += each.charAt(i);
            }

            if (each.equalsIgnoreCase(reverse)) {
                it.remove();
            }
        }

        System.out.println(names);

        System.out.println("******************************************************");

        List<String> names2 = new ArrayList<>();
        names2.addAll(
                Arrays.asList("Java", "Python", "Eurotech", "Car", "Level", "civic", "radar", "kayak", "reviver", "racecar", "madam", "rentner")
        );

        Predicate<String> palindrome = str -> {
            String reverse = "";
            for (int i = str.length() - 1; i >= 0; i--){
                reverse += str.charAt(i);
            }
            return str.equalsIgnoreCase(reverse);
        };

        names2.removeIf(palindrome);

//        names2.removeIf(str -> {
//                    String reverse = "";
//                    for (int i = str.length() - 1; i >= 0; i--) {
//                        reverse += str.charAt(i);
//                    }
//                    return str.equalsIgnoreCase(reverse);
//                }
//        );

        System.out.println(names2);

    }


}
// entfernt alle Palindromes
//