package day_36.bank;

public class Bank {

    double balance; // guthaben

    public Bank(double balance) {
        this.balance = balance;
    }

    // Gibt den Zinssatz zurück (Standartwert ist 0.0)
    public double getInterestRate() {
        return 0;
    }

    public double calculateInterest() {
        //       70         1000  *      %7            / 100
        double interest = balance * (getInterestRate() / 100);
        balance += interest;
        return balance;
    }

    public void info(){
        System.out.println("Das ist Eltern/Parent/Super Klasse method");
    }


}
