package day_16;

public class Vehicle {
    // fields
    String brandName;
    String model;
    int year;
    double number;
    static int count;

    public void finalize(){
        double number = 10; // local variable
        String str = "hello";
        System.out.println(count++);
        System.out.println("Vehicle finalized");
    }


}
