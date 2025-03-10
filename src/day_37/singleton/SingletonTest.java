package day_37.singleton;

public class SingletonTest {

    public static void main(String[] args) {

//        Singleton singleton = new Singleton();
//        Singleton singleton2 = new Singleton();
//        Singleton singleton3 = new Singleton();
//        Singleton singleton4 = new Singleton();
//        Singleton singleton5 = new Singleton();
//
//        System.out.println("System.identityHashCode(singleton) = " + System.identityHashCode(singleton));
//        System.out.println("System.identityHashCode(singleton2) = " + System.identityHashCode(singleton2));
//        System.out.println("System.identityHashCode(singleton3) = " + System.identityHashCode(singleton3));
//        System.out.println("System.identityHashCode(singleton4) = " + System.identityHashCode(singleton4));
//        System.out.println("System.identityHashCode(singleton5) = " + System.identityHashCode(singleton5));
        //Singleton singleton = new Singleton();
        Singleton singleton = Singleton.createObjekt();
        Singleton singleton2 = Singleton.createObjekt();
        Singleton singleton3 = Singleton.createObjekt();
        Singleton singleton4 = Singleton.createObjekt();

        System.out.println("System.identityHashCode(singleton) = " + System.identityHashCode(singleton));
        System.out.println("System.identityHashCode(singleton2) = " + System.identityHashCode(singleton2));
        System.out.println("System.identityHashCode(singleton3) = " + System.identityHashCode(singleton3));
        System.out.println("System.identityHashCode(singleton4) = " + System.identityHashCode(singleton4));

    }


}
