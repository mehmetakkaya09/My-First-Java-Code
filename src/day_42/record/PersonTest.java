package day_42.record;

public class PersonTest {


    public static void main(String[] args) {

        Person person = new Person("Süreyya", "Durak",4954621654l);

        System.out.println("person.getPhone() = " + person.getPhone());
        System.out.println(person);

        PersonRecord personRecord = new PersonRecord("Vadim", "Dokushaev", 49874651651l);

        System.out.println("personRecord.firstname() = " + personRecord.firstname());


    }
}
