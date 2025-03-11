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

}
