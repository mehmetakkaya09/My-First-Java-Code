package day_36.bank;

public class CommerzBank extends Bank {

    public CommerzBank(double balance) {
        super(balance);
    }

    public double getInterestRate() {
        return 8;
    }
    public void info() {
        System.out.println("Das ist CommerzBank Klasse method");
    }

    public void infoDetail() {
        this.info();
        super.info();
    }

}
