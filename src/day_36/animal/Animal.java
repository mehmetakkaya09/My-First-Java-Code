package day_36.animal;

public class Animal {

    String name;
    int age;

//    public Animal(){
//        System.out.println("Animal Parameterlose Constructor");
//    }

    // Constructor verkettung/chaining --- Constructor Overloading
    public Animal(String name){
        this.name = name;
        System.out.println("Animal 1 Parameterisierte Constructor ");
    }

    //Constructor Overloading
    public Animal(String name, int age){
        this(name); // Constructor verkettung/chaining
        //this.name = name;
        this.age = age;
        System.out.println("Animal 2 Parameterisierte Constructor ");
    }

    public void animalInfo(){
        System.out.println("Animal Name : " + name);
        System.out.println("Animal Age : " + age);
    }



}
