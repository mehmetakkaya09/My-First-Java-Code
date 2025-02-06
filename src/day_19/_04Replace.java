package day_19;

public class _04Replace {

    public static void main(String[] args) {

        String email = "mehmet@eurotechstudy.com";

        email = email.replace("com", "edu");

        System.out.println("email = " + email);

        email = email.replace("e", "E");

        System.out.println("email = " + email);

        email = email.replace("@", "");

        System.out.println("email = " + email);

        String str = "123abc456xyz";

        str = str.replaceAll("\\d", "");

        System.out.println("str = " + str);

        String str2 = "hello world, hello java, hello everybody";

        str2 = str2.replaceFirst("hello", "bye bye");

        System.out.println("str2 = " + str2);


    }


}
