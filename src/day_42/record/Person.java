package day_42.record;

import java.util.ArrayList;

public final class Person {

    private final String firstname;
    private final String lastname;
    private final long phone;
    private final ArrayList<AddresseRecord> addresses;

    public Person(final String firstname, final String lastname, final long phone, final ArrayList<AddresseRecord> addresses) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.phone = phone;
        this.addresses = addresses;
    }

    public ArrayList<AddresseRecord> getAddresses() {
        return addresses;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public long getPhone() {
        return phone;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", phone=" + phone +
                ", addresses=" + addresses +
                '}';
    }
}
