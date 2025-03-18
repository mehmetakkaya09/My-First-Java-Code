package day_42.record;

import java.util.ArrayList;

public class PersonTest {


    public static void main(String[] args) {

        ArrayList<AddresseRecord> sureyyaAddresses = new ArrayList<>();
        AddresseRecord addresse1 = new AddresseRecord("Haupt", "Köln", AddresseEnum.BUSINESS);
        AddresseRecord addresse2 = new AddresseRecord("Bahnhof", "Berlin", AddresseEnum.HOME);

        sureyyaAddresses.add(addresse1);
        sureyyaAddresses.add(addresse2);

        Person person = new Person("Süreyya", "Durak",4954621654l, sureyyaAddresses);

        System.out.println("person.getPhone() = " + person.getPhone());
        System.out.println(person);

        ArrayList<AddresseRecord> vadimAdresse = new ArrayList<>();

        AddresseRecord addresse3 = new AddresseRecord("Park", "Frankfurt", AddresseEnum.SCHOOL);

        vadimAdresse.add(addresse3);

        PersonRecord personRecord = new PersonRecord("Vadim", "Dokuchaev", 49874651651l, vadimAdresse);

        System.out.println("personRecord.firstname() = " + personRecord.firstname());

        System.out.println(personRecord);


    }
}
