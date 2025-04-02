package day_51.fabrik;

public class Engineer extends Person implements Payable{

    private String university;

    public Engineer(String name, int age, String university) {
        super(name, age);
        this.university = university;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public void design(String productName){
        System.out.println("I am en Engineer and I design " + productName);
    }

    @Override
    public void pay(double amount) {
        System.out.println("I get " + amount + " € as en Engineer");
    }

    @Override
    public void work() {
        System.out.println("I work as an Engineer");
    }

    @Override
    public void showInfo() {
        System.out.println("My name is " + super.getName() + " and I am " + super.getAge() + " years old.");
    }
    // Payable und Person Klasse Vererben (Inheritence)
    // private String university; getter setter constructor
    // public void design(String productName){}



}
