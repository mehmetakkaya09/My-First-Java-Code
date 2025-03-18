package day_42.record;

public final class Person {

    private final String firstname;
    private final String lastname;
    private final long phone;

    public Person(final String firstname, final String lastname, final long phone) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.phone = phone;
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
                '}';
    }
}
