package day_39;

public class _03FinalMethods {

    // Final Methods kann man nicht überschreiben(Overriding)

    public  void finalMethod() {
        System.out.println("finalMethod");
    }


}

class Kinder extends _03FinalMethods{

    public final void finalMethod() {
        System.out.println("finalMethod");
    }

}

class Sub extends Kinder{
//    public final void finalMethod() {
//        System.out.println("finalMethod");
//    }
}