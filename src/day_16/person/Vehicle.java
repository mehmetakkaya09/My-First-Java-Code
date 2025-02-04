package day_16.person;

public class Vehicle {
    // fields
    public String brandName;
    public String model;
    public int year;
    public double number;
    public static int count;

    public void finalize(){
        double number = 10; // local variable
        String str = "hello";
        System.out.println(count++);
        System.out.println("Vehicle finalized");
    }


}
