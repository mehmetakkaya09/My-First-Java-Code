package review.scrum;

public class Developer extends Employee {


    public Developer(String name, int age, char gender,  double salary, String department) {
        super(name, age, gender, "Developer", salary, department);
    }

    public void work(){
        System.out.println(getJobTitle() +" "+getName()+" is crying");
    }

    @Override
    public void sleep(int hours) {
        System.out.println(getJobTitle() + " " + getName() + " is sleeping for " + hours + " hours...");
    }


}