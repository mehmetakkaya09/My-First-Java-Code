package review.scrum;

public class Tester extends Employee{ //Tester IS A Employee,  Tester IS A Person


    public Tester(String name, int age, char gender,  double salary, String department) {
        super(name, age, gender, "Tester", salary, department);
    }

    public void work(){
        System.out.println(getJobTitle() + " " + getName() + "is creating ticket");
    }

    @Override
    public void sleep(int hours) {
        System.out.println(getJobTitle() + " " + getName() + " is sleeping for " + hours + " hours...");
    }

}