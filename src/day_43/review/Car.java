package day_43.review;

public record Car(String marke, String model, int year) {
    // data classes
    // alle instances muss final sein
    // es soll nur getter methods geben.
    // als parent oder child soll diese Klassen nicht verwendet werden.
    // sind final Klassen
    // niemand kann diese Klassen erreichen, vererben oder klass DATA verandern;
}
class Test{
    public static void main(String[] args) {
        Car car = new Car("BMW", "M5", 2018);
        System.out.println("car.marke() = " + car.marke()); // getter
        System.out.println("car.model() = " + car.model());
        System.out.println("car.year() = " + car.year());
    }
}