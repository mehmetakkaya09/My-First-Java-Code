package day_33;

public class _01StaticMethods {

    int instanceVariable = 2;
    static int staticVariable = 3;

    // instance methoden gehören zur Objekten. Jede objekt hat eigene einzelne instance method
    public void instanceMethod() { // um eine instance method zu erstellen, verwenden wir nicht "static" keyword
        System.out.println("instanceVariable = " + instanceVariable);

        //weil jede objekt nur eine static variable oder method verwenden kann,
        // kann man in eine instance method sowohl ein static variable als auch eine static method aufrufen/verwenden
        System.out.println("staticVariable = " + staticVariable);
        staticMethod();
    }

    // static methoden gehören zur Klasse. Jede objekt und alle Klassemitgliedern verwenden nur eine static method
    // static methoden sind NICHT ABHANGIG von Objekten
    public static void staticMethod() {

        System.out.println("StaticMethod wurde ausgeführt");
        //inneehalb einer static Method können wir eine instance variable oder instance Method nicht.
        Math.pow(2,3);
        //System.out.println(instanceVariable);
        //instanceMethod();
    }

    public static void main(String[] args) {

//        System.out.println(instanceVariable);
//        instanceMethod();
        System.out.println(staticVariable);
        staticMethod();
    }


}
