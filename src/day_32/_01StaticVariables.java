package day_32;

public class _01StaticVariables {

    // static variables gehören zur Klassen
    // alle objekten verwenden nur ein werte
    // static variables sind nicht abhangig von Objekten
    // wenn wir einmal diese static variable verandern, verandert man alle variables gleichzeitig
     static String name;
     public String nachname;

    public _01StaticVariables(String name) {
        this.name = name;
    }

    public void printName(){
        System.out.println("name = " + name);
    }


}
