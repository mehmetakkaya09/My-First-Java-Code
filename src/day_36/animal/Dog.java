package day_36.animal;

public class Dog extends Animal {

    // Dog Klasse verwendet automatisch Animalklasse Constructor
    // weil Animalklasse constructor parameterlose ist.
//    public Dog(){
//        System.out.println("Dog Parameterlose Constructor");
//    }

    String name;
    int age;

    public Dog(String name, int age){
        super(name,age); //super(); verwendet man um Elternklasse Constructor aufzurufen.
        System.out.println("Dog 1 Parameterisierte Constructor ");
    }

    public void dogInfo() {
        System.out.println("Dog Name : " + this.name);
        System.out.println("Dog Name : " + super.name);
        System.out.println("Dog Age : " + this.age);
        System.out.println("Dog Age : " + super.age);
    }
}
