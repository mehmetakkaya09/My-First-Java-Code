package day_32;

public class _02StaticTest {

    public static void main(String[] args) {

        _01StaticVariables obj1 = new _01StaticVariables("Vadim");
        _01StaticVariables obj2 = new _01StaticVariables("Blagoja");
        _01StaticVariables obj3 = new _01StaticVariables("Sureyya");

        obj1.printName();
        obj2.printName();
        obj3.printName();

        System.out.println("_01StaticVariables.name = " + _01StaticVariables.name);

        _01StaticVariables.name = "Mehmet";

        obj1.printName();
        obj2.printName();
        obj3.printName();

        System.out.println("_01StaticVariables.name = " + _01StaticVariables.name);

        //_01StaticVariables.nachname;



    }


}
