package day_15;

public class HeapOverFlow {

    public static void main(String[] args) {

        String str = "Hello";// unveranderbar wir können Strings nicht verandern.
        System.out.println("str = " + str);
        System.out.println("System.identityHashCode(str) = " + System.identityHashCode(str));

        str = "Hello World";
        System.out.println("str = " + str);
        System.out.println("System.identityHashCode(str) = " + System.identityHashCode(str));

        int count = 0;

        while (true){
            System.out.println(++count);
            str += str;
            System.out.println("str = " + str);
            System.out.println("System.identityHashCode(str) = " + System.identityHashCode(str));
        }




    }

}
