package day_30;

public class _02EncapsulationTest {

    public static void main(String[] args) {

        _01Encapsulation obj1 = new _01Encapsulation("/*/)(/", 23423);

        System.out.println("obj1.getName = " + obj1.getName());
        System.out.println("obj1.getAge = " + obj1.getAge());

        obj1.setAge(150);
        obj1.setName("+%/+%");

        System.out.println("obj1.getName = " + obj1.getName());
        System.out.println("obj1.getAge = " + obj1.getAge());

        obj1.setName("        Joe     ");

        System.out.println("obj1.getName = " + obj1.getName());
    }


}
