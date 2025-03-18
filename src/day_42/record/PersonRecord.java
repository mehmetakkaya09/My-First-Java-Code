package day_42.record;

import java.util.ArrayList;

public record PersonRecord(String firstname,
                           String lastname,
                           long phone,
                           ArrayList<AddresseRecord> addresses) {
    @Override
    public String toString() {
        return "PersonRecord{" +
                "firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", phone=" + phone +
                ", addresses=" + addresses +
                '}';
    }
}
