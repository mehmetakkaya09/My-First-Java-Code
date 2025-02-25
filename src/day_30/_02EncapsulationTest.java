package day_30;

public class _02EncapsulationTest {

    public static void main(String[] args) {

        _01Encapsulation obj1 = new _01Encapsulation("/*/)(/", 23423);

        System.out.println("obj1.name = " + obj1.name);
        System.out.println("obj1.getAge = " + obj1.getAge());

        obj1.setAge(150);

        System.out.println("obj1.getAge = " + obj1.getAge());

    }


}
