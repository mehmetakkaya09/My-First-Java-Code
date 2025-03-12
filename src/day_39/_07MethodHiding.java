package day_39;

public class _07MethodHiding {

    public static String staticMethod(){
        return "Static Super Class Method";
    }

    public String instanceMethod(){
        return "Instance Super Class Method";
    }

    public void superMethod(){
        System.out.println("Super static method = " + staticMethod());
        System.out.println("Super instance method = " + instanceMethod());
    }

}

class Kinder4 extends _07MethodHiding {

    // Method Hiding
    // Wenn es in Eltern Klasse ein static Method gibt, führt Java nur diese Eltern static Method, Weil static methoden nicht überschrieben werden.


    // static methoden kann man nicht überschreiben
    //@Override
    public static String staticMethod(){
        return "Static Kinder Class Method";
    }
    @Override
    public String instanceMethod(){
        return "Instance Kinder Class Method";
    }

//    public void superMethod(){
//        System.out.println("Super static method = " + staticMethod());
//        System.out.println("Super instance method = " + instanceMethod());
//    }

    public void kinderMethod(){
        System.out.println("Kinder static Method = " + staticMethod());
        System.out.println("Kinder instance Method = " + instanceMethod());
    }
}