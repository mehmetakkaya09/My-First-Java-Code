package day_36.person;

public class Developer extends Person{

    public Developer(String name){
        super(name);
    }

    //method overriding --> gleiche parent class Method mit unterschiedliche Implementation
    public void introduce(){
        System.out.println("Ich bin ein Developer");
    }

}
