package review.scrum;

public class BusinessAnalyst extends Employee {


    public BusinessAnalyst(String name, int age, char gender,  double salary, String department) {
        super(name, age, gender, "BA", salary, department);
    }

    public void work(){
        System.out.println(getName()+ " is analyzing the documents");
    }

    @Override
    public void sleep(int hours) {
        System.out.println(getJobTitle() + " " + getName() + " is sleeping for " + hours + " hours...");
    }


}