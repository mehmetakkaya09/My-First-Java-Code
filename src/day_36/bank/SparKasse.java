package day_36.bank;

public class SparKasse extends Bank {

    public SparKasse(double balance) {
        super(balance);
    }

    public double getInterestRate(){
        return 9;
    }
}
