package review.scrum;

public class ScrumMaster extends Employee{
    public ScrumMaster(String name, int age, char gender, double salary, String department) {
        super(name, age, gender, "Scrum Master", salary, department);
    }

    @Override
    public void work() {
        System.out.println(getJobTitle() + " is managing Team");
    }

    @Override
    public void sleep(int hours) {
        System.out.println(getJobTitle() + " " + getName() + " is sleeping for " + hours + " hours...");
    }
}
