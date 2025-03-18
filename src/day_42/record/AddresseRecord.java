package day_42.record;

public record AddresseRecord(String street,
                             String city,
                             AddresseEnum addresseEnum) implements Addressable{
    @Override
    public String toString() {
        return "AddresseRecord{" +
                "street='" + street + '\'' +
                ", city='" + city + '\'' +
                ", addresseEnum=" + addresseEnum +
                '}';
    }

    @Override
    public void printAddress() {
        System.out.println("street = " + street);
        System.out.println("city = " + city);
        System.out.println("addresseEnum = " + addresseEnum);
    }
}
