package day_39;

public class _01VariableTypes {

    String str = "Hello World";  // Instance Variables gehören zu den Objekten

    //jede Objekt (1_000_000 Student Objekt) hat/verwendet eigene instance Variable
    public String instanceVariable; // Instance Variables haben immer ein default Wert. Wir sollen nicht initialisieren

    // alle Objekten haben/verwenden nur eine static variable
    static String staticVariable;// Static Variables haben immer ein default Wert. Wir sollen sie nicht initialisieren

    public _01VariableTypes() {
        String local = "Local Variable"; // Local Variables gehört zur abhangigen Constructor
        str = "Instance Variable";
        System.out.println(instanceVariable); // gibt "null" zurück, weil String default wert "null" ist.
        //static String staticVariable;
    }

    {
        String initLocal = "Local Variable"; // Local Variables gehört zur abhangigen Block
        //static String staticVariable;
    }

    static {
        String staticLocal = "Local Variable"; // Local Variables gehört zur abhangigen Block
        //static String staticVariable;
        System.out.println("static == " + staticVariable);
    }

    public static void main(String[] args) {

        staticVariable = "static Variable";
        //instanceVariable = "";
        //static String staticVariable;

        String str = "Hello World"; // Local Variables gehört zur abhangigen Method

        String localVariable; // Wir haben noch nicht initialisiert.
        // Local Variables hat keine default Wert.

        //System.out.println(localVariable);  Weil local Variable keine Wert hat, können wir das nicht benutzen

        localVariable = "Local Variable";
        System.out.println(localVariable); //Weil wir ein Wert definiert haben, können wir benutzen

        _01VariableTypes obj = new _01VariableTypes();
        obj.instanceVariable = "Instance Variable";


    }


    public void method() {

        String str = "Hello World"; // Local Variables gehört zur abhangigen Method

        //static String staticVariable;
    }


}
