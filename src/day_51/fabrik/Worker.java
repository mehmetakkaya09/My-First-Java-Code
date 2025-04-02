package day_51.fabrik;

public class Worker extends Person implements Payable{

    private String department;

    public Worker(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public void pay(double amount) {
        System.out.println("I get " + amount + " € as a Worker");
    }

    @Override
    public void work() {
        System.out.println("I work as a Worker in "+ this.getDepartment());
    }

    @Override
    public void showInfo() {
        System.out.println("My name is " + super.getName() + " and I am " + super.getAge() + " years old.");
    }

    @Override
    public String toString() {
        return "Worker{" +
                "department='" + department + '\'' +
                '}' + super.toString();
    }
}
