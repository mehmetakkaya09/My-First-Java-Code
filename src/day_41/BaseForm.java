package day_41;

import day_41.enumeration.Farbe;

public abstract class BaseForm {

    //instances ist möglich
    private String name;

    //alle accessmodifiers kann man benutzen
    private Farbe farbe;

    //Constructor ist möglich
    public BaseForm(String name, Farbe farbe){
        this.name = name;
        this.farbe = farbe;
    }

    //public abstract void abstractMethod();

    //Instance Method ist möglich
    public void nonAbstractMethod(){

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Farbe getFarbe() {
        return farbe;
    }

    public void setFarbe(Farbe farbe) {
        this.farbe = farbe;
    }
}
