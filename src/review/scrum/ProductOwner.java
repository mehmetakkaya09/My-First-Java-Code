package review.scrum;

public class ProductOwner extends Employee{
    public ProductOwner(String name, int age, char gender,  double salary, String department) {
        super(name, age, gender, "PO", salary, department);
    }

    @Override
    public void work() {
        System.out.println(getName() + " is speaking with Client");
    }

    @Override
    public void sleep(int hours) {
        System.out.println(getJobTitle() + " " + getName() + " is sleeping for " + hours + " hours...");
    }

}