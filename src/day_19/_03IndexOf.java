package day_19;

public class _03IndexOf {

    public static void main(String[] args) {

        String str = "Java ist gut, Java ist besser, java ist am besten";

        System.out.println(str.indexOf("ist"));
        System.out.println(str.indexOf("Java"));
        System.out.println(str.indexOf(" "));
        System.out.println(str.indexOf("Python")); // -1
        System.out.println(str.indexOf("java"));
        System.out.println(str.indexOf(","));
        System.out.println(str.indexOf("g"));

        int fromIndex = str.indexOf("Java");

        int idx = str.indexOf("Java", fromIndex + 1);

        System.out.println(idx);

        findIndexOfWord(str, "Java");
        findIndexOfWord(str, "ist");

    }

    public static void findIndexOfWord(String fullString, String word) {

        int anzahl = 0;
        int index = fullString.indexOf(word);

        System.out.println("Satz : " + fullString);
        System.out.println("Wort : " + word);

        while (index != -1) {
            anzahl++;
            index = fullString.indexOf(word, index + 1);
        }
        System.out.println("Anzahl : " + anzahl);

    }


}
