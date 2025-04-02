package day_51.fabrik;

public class Teacher extends Person implements Payable{

    public Teacher(String name, int age){
        super(name,age);
    }

    @Override
    public void pay(double amount) {
        System.out.println("I get " + amount + " € as a Teacher");
    }

    @Override
    public void work() {
        System.out.println("I work in this company as a Teacher");
    }

    @Override
    public void showInfo() {
        System.out.println("My name is " + super.getName() + " and I am " + super.getAge() + " years old");
    }

    public void teach(String lesson){
        System.out.println("I teach " + lesson + " in this company");
    }
}
