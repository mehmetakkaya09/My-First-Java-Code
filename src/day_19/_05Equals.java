package day_19;

public class _05Equals {

    public static void main(String[] args) {


        String str1 = "Java";
        String str2 = "Java";
        String str3 = "java";

        System.out.println("str1.equals(str2) = " + str1.equals(str2));
        System.out.println("str1.equals(str3) = " + str1.equals(str3));

        System.out.println("str1.equalsIgnoreCase(str3) = " + str1.equalsIgnoreCase(str3));


    }



}
