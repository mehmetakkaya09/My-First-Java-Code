package day_39;

public class _06HidingTest {

    public static void main(String[] args) {

        Kinder3 kinder3 = new Kinder3("John", 12);

        kinder3.method();


        Kinder4 kinder4 = new Kinder4();

        kinder4.superMethod();
        System.out.println("*********************************");
        kinder4.kinderMethod();


    }


}
