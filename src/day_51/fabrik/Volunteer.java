package day_51.fabrik;

public class Volunteer extends Person {

    public Volunteer(String name, int age) {
        super(name, age);
    }

    @Override
    public void work() {
        System.out.println("I am a volunteer worker and I have no salary");
    }

    @Override
    public void showInfo() {
        System.out.println("My name is " + super.getName() + " and I am " + super.getAge() + " years old.");
    }
}
