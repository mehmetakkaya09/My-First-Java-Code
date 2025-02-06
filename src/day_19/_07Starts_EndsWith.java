package day_19;

public class _07Starts_EndsWith {

    public static void main(String[] args) {

        String str =  "Java ist sehr leicht";

        boolean start1 = str.startsWith("Java ist sehr");
        System.out.println("start1 = " + start1);

        boolean start2 = str.startsWith("ist");

        System.out.println("start2 = " + start2);

        boolean end1 = str.endsWith("ist sehr leicht");

        System.out.println("end1 = " + end1);

        boolean end2 = str.endsWith("Java");
        System.out.println("end2 = " + end2);


    }

}
