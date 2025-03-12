package day_39;

public class _04FinalClass {

    // Final Classes kann man nicht vererbt. (Inheritence ist verbot)
    // Final Classes kann Kinder Class sein
    // Final Classes kann Eltern Class nicht sein

    public void print() {
        System.out.println("Hello World");
    }

}

final class Kinder2 extends _04FinalClass {

    public static void main(String[] args) {
        _04FinalClass obj = new _04FinalClass();
        obj.print();
    }

}

//class Sub2 extends Kinder2{
//
//}