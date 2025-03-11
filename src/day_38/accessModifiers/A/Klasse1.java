package day_38.accessModifiers.A;

public class Klasse1 {

    private String privateInstance;
    String defaultInstance;
    protected String protectedInstance;
    public String publicInstance;

    Klasse1(String privateInstance){
        this.privateInstance = privateInstance;
    }

    protected Klasse1(String privateInstance, String defaultInstance){
        this.privateInstance = privateInstance;
        this.defaultInstance = defaultInstance;
    }

    public Klasse1(String privateInstance, String defaultInstance, String protectedInstance){
        this.privateInstance = privateInstance;
        this.defaultInstance = defaultInstance;
        this.protectedInstance = protectedInstance;
    }

    public void method() {
        privateInstance = "private";
        defaultInstance = "default";
        protectedInstance = "protected";
        publicInstance = "public";
    }

    //Method overloading : In gleicher Klasse, mit gleicher Name, mit verschiedenen parametern
    // Zurückgabetyp ist nicht wichtig
    // Access Modifier ist auch nicht wichtig
    public void spiel() {
        System.out.println("Elternklasse spiel method");
    }

    protected String spiel(String spielName) {
        return spielName;
    }



}
