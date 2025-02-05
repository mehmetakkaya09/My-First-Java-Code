package day_18;

public class _04CharAt {

    public static void main(String[] args) {

        String str = "Java Course is the best Course ever"; // index number

        // Java String index numbers beginnt mit 0

        System.out.println("str.length() = " + str.length());

        System.out.println("str.charAt(0) = " + str.charAt(0));
        System.out.println("str.charAt(1) = " + str.charAt(1));
        System.out.println("str.charAt(2) = " + str.charAt(2));
        System.out.println("str.charAt(3) = " + str.charAt(3));

        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));
        }
        System.out.println();

        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + ",");
        }
        System.out.println();


        // wenn meine charAt(i) nicht leer zeichen ist, werde ich ein Komma schreiben
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));
            if (str.charAt(i) != ' ') {
                System.out.print(",");
            }
        }

        System.out.println(str.length());
        System.out.println("str.charAt(str.length() - 1) = " + str.charAt(str.length() - 1));
        System.out.println("str.charAt(str.length() - 3) = " + str.charAt(str.length() - 3));


    }



}
