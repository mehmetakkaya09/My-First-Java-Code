package day_51.fabrik;

public class Driver extends Person implements Payable{

    private String vehicle; //  Fahrzeug

    public Driver(String name, int age, String vehicle) {
        super(name, age);
        this.vehicle = vehicle;
    }

    public String getVehicle() {
        return vehicle;
    }

    public void setVehicle(String vehicle) {
        this.vehicle = vehicle;
    }

    public void driveVehicle(){
        System.out.println("I am a Driver and I drive a/an " + this.getVehicle());
    }

    @Override
    public void pay(double amount) {
        System.out.println("I get " + amount + " € as an Driver");
    }

    @Override
    public void work() {
        System.out.println("I work as an Driver");
    }

    @Override
    public void showInfo() {
        System.out.println("My name is " + super.getName() + " and I am " + super.getAge() + " years old.");
    }
}
