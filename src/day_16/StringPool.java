package day_16;

public class StringPool {

    public static void main(String[] args) {

        String str1 = "Hello"; // String kann nicht verandern.
        System.out.println("System.identityHashCode(str1) = " + System.identityHashCode(str1));

        System.out.println("str1 = " + str1);

        str1 = str1.concat(" World"); // um eine String zu einer anderen String hinzuzufügen benutzen wir concat() method

        System.out.println("str1 = " + str1);
        System.out.println("System.identityHashCode(str1) = " + System.identityHashCode(str1));

        String str2 = "Hello World";
        System.out.println("str2 = " + str2);
        System.out.println("str1 == str2 = " + str1 == str2);
        System.out.println("System.identityHashCode(str2) = " + System.identityHashCode(str2));

        System.out.println("str1.equals(str2) = " + str1.equals(str2));

        String str3 = new String("Hello World");

        String str4 = "Hello World";

        System.out.println("str2 == str3 = " + str2 == str3);
        System.out.println("str2 == str4 = " + str2 == str4);

        System.out.println("str2.equals(str3) = " + str2.equals(str3));
        System.out.println("str2.equals(str4) = " + str2.equals(str4));

        String str5 = "Hello";

        String str6 = new String("Hello");
        str6 = str6.intern();

        System.out.println(str5 == str6);

        System.out.println("str5.equalsIgnoreCase(str6) = " + str5.equalsIgnoreCase(str6));

        String str7 = "Eurotech";
        String str8 = "eurotech";

        System.out.println("str7.equals(str8) = " + str7.equals(str8));
        System.out.println("str7.equalsIgnoreCase(str8) = " + str7.equalsIgnoreCase(str8));


    }


}
