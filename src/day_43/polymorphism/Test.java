package day_43.polymorphism;

public class Test {
    public static void main(String[] args) {

        // Wir können nur Referenzklasse Methoden direkt erreichen.
        A obj1 = new B();
        obj1.methodA();

        // um B Klasse methoden zu erreichen
        //downcasting
        ((B) obj1).methodB();

        B obj2 = (B) obj1;
        obj2.methodA();
        obj2.methodB();

        double d = 0;
        int i = 0;

        i = (int) d;

        //upcasting macht man automatisch von Java Compiler
//        B obj2 = new B();
//        obj2.methodA();

        A obj3 = new C();
        obj3.methodA();
//        obj3.methodB();
//        obj3.methodC();

        B obj4 = new C();
        obj4.methodA();
        obj4.methodB();
        //obj4.methodC();

        // upcasting
        A obj5 = obj4;
        obj5.methodA();
//        obj5.methodB();
//        obj5.methodC();

        // eine Class Objekt kann nicht zu einer kleinerer Classe Objekt zugewiesen werden
        A obj6 = new B();
        C obj7 = (C) obj6;
        obj7.methodA();
        obj7.methodB();
        obj7.methodC();

        //C obj8 = (C) new B();

    }
}
