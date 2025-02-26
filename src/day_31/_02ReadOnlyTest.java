package day_31;

public class _02ReadOnlyTest {

    public static void main(String[] args) {

        _01ReadOnlyClass obj1 = new _01ReadOnlyClass("           ", "Hamburg");
        _01ReadOnlyClass obj2 = new _01ReadOnlyClass("NRW", "          ");
        _01ReadOnlyClass obj3 = new _01ReadOnlyClass("Niedersachsen", "Hannover");

        System.out.println(obj1);
        System.out.println(obj2);
        System.out.println(obj3);

        System.out.println(obj1.getStaedte());

        //obj1.setStadt() weil es private ist kann man nicht erreichen.


        obj1.getStaedte().set(0,"Berlin");
        obj1.getStaedte().add("Frankfurt");

        System.out.println("System.identityHashCode(obj1.getStaedte()) = " + System.identityHashCode(obj1.getStaedte()));
        System.out.println(obj1.getStaedte());

        obj3.getStaedte2();





    }

}
