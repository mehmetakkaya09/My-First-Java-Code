package day_40.form;

public abstract class Form {

    private String name;

    public Form(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract double umfang();


    public abstract double flaeche();


}
