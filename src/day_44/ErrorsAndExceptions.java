package day_44;

public class ErrorsAndExceptions {

    public static void main(String[] args) {

        System.out.println("hello"); // checked Exception/Error   // compile-time Error

        //System.out.println(7 / 0); // unchecked Exception/Error     // run-time Error
        try {
            System.out.println(7 / 0); // unchecked Exception/Error     // run-time Error
        } catch (ArithmeticException fehler) {
            System.out.println("0 kann man nicht dividieren! = " + fehler.getMessage()); // getMessage gibt kurze Definition von Exception
        }


        // StaleElementException : mansche locators können wir nicht immer ERSTMAL identifizieren. In diesem Fall sollen wir diese locator nochmal identifizieren

        System.out.println("weiter");


    }


}
