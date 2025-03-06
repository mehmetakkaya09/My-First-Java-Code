package day_36.bank;

public class DeutscheBank extends Bank {

    public DeutscheBank(double balance) {
        super(balance);
    }

    public double getInterestRate(){
        return 7;
    }

}
