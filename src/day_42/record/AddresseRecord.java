package day_42.record;

public record AddresseRecord(String street,
                             String city,
                             AddresseEnum addresseEnum) {
    @Override
    public String toString() {
        return "AddresseRecord{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", addresseEnum=" + addresseEnum +
                '}';
    }
}
