package day_16;

public class PersonImpl {

    public static void main(String[] args) {

        // mehmet

        Person person = new Person(); // 80_000_000
        person.firstname = "mehmet"; // + anstatt 1_000_000 Objekt verwendet Java 1 Objekt in String pool.
        person.lastname = "yılmaz"; // + 1_000_000 1 Objekt



        Person person2 = new Person();
        person2.firstname = "mehmet"; // + 1_000_000
        person2.lastname = "yılmaz"; // + 1_000_000

        System.out.println(person);
        System.out.println(person2);
        System.out.println("System.identityHashCode(person.firstname) = " + System.identityHashCode(person.firstname));
        System.out.println("System.identityHashCode(person2.firstname) = " + System.identityHashCode(person2.firstname));
        System.out.println(person.firstname == person2.firstname);

        String firstname = new String("mehmet");
        System.out.println("firstname = " + firstname);

        String firstname2 = "mehmet";

        System.out.println("firstname == firstname2 = " + firstname == firstname2);
        System.out.println("System.identityHashCode(firstname) = " + System.identityHashCode(firstname));
        System.out.println("System.identityHashCode(firstname2) = " + System.identityHashCode(firstname2));


    }
}
