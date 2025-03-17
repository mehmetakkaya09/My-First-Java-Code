package day_41;

public abstract class BaseForm {

    //instances ist möglich
    private String name;

    //alle accessmodifiers kann man benutzen
    private String farbe;

    //Constructor ist möglich
    public BaseForm(String name, String farbe){
        this.name = name;
        this.farbe = farbe;
    }

    public abstract void abstractMethod();

    //Instance Method ist möglich
    public void nonAbstractMethod(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFarbe() {
        return farbe;
    }

    public void setFarbe(String farbe) {
        this.farbe = farbe;
    }
}
