package day_41;

public interface Form {

    // In Interfaces können wir NUR public static final variables benutzen
    public static final double PI = 3.14;

    //instances ist nicht möglich
    //private String name;

    // nur public accessmodifier kann man benutzen
    //protected String farbe;


    //Constructor ist möglich
//    public Form(){
//
//    }

    public abstract double umfang(); // public und abstract keywords sind default in Interfaces
    double flaeche();

    // In Interfaces kann man instance methoden nicht benutzen und implementieren
    // um Instance methoden zu implementiereni müssen wir "default" methoden benutzen
    default void info(){
        System.out.println("Ich bin eine Form");
    }

    static void staticMethod(){
        System.out.println("Ich bin eine Static Method der Form-Interface");
    }

    //Instance Method ist nicht möglich
//    public void nonAbstractMethod(){
//
//    }

    private void privatInstanceMethod(){
        System.out.println("Ich bin eine Private Method der Form-Interface");
    }

    private static void privateStaticMethod(){
        System.out.println("Ich bin eine Private Static Method der Form-Interface");
    }

}
