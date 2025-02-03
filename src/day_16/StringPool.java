package day_16;

public class StringPool {

    public static void main(String[] args) {

        String str1 = "Hello"; // String kann nicht verandern.
        System.out.println("System.identityHashCode(str1) = " + System.identityHashCode(str1));

        System.out.println("str1 = " + str1);

        str1 = str1.concat(" World"); // um eine String zu einer anderen String hinzuzufügen benutzen wir concat() method

        System.out.println("str1 = " + str1);
        System.out.println("System.identityHashCode(str1) = " + System.identityHashCode(str1));



    }


}
