package day_33;

public class _02StaticTest {

    public static void main(String[] args) {

        _01StaticMethods obj = new _01StaticMethods();

        obj.instanceMethod();


        System.out.println(_01StaticMethods.staticVariable);
        _01StaticMethods.staticMethod();


    }
}
