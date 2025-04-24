package review.scrum;

public abstract class Employee extends Person {

    private String jobTitle;
    private int id;
    private static int staticId = 1000;
    private double salary;
    private String department;

    public Employee(String name, int age, char gender, String jobTitle, double salary, String department) {
        super(name, age, gender);
        this.id = staticId++;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.department = department;
    }

    public abstract void work();

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public int getId() {
        return id;
    }

    public double getSalary() {
        return salary;
    }

    public String getDepartment() {
        return department;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "jobTitle='" + jobTitle + '\'' +
                ", id=" + id +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }

    //ScrumMaster
    //ProductOwner
    //BusinessAnalyst
    //Developer
    //Tester

}
