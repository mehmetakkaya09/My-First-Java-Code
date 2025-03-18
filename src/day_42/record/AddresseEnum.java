package day_42.record;

public enum AddresseEnum implements Addressable{
    HOME,
    BUSINESS,
    SCHOOL;

    @Override
    public void printAddress() {
        System.out.println(HOME.name() + " " + HOME.ordinal());
        System.out.println(BUSINESS.name() + " " + BUSINESS.ordinal());
        System.out.println(SCHOOL.name() + " " + SCHOOL.ordinal());
    }

}
