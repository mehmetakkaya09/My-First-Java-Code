package day_51.fabrik;

import java.util.ArrayList;

public class Company { // Unternehmen

    private String name;
    private String address;

    private ArrayList<Person> personList;

    public Company(String name, String address) {
        this.address = address;
        this.name = name;
        personList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public ArrayList<Person> getAllPersons() {
        return new ArrayList<>(personList);
    }

    public void getAllPersons2() {
        for (Person person : personList) {
            System.out.println(person);
        }
    }

    public void addPerson(Person person) {
        this.personList.add(person);
    }

    public void removePerson(Person person) {
        this.personList.remove(person);
    }

    public Person getPersonByName(String name) {
        for (Person person : personList) {
            if (person.getName().equals(name)) {
                return person;
            }
        }
        return null;
    }


}
