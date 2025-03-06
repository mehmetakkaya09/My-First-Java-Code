package day_36.bank;

public class Main {

    public static void main(String[] args) {

        DeutscheBank deutscheBank = new DeutscheBank(1000);
        CommerzBank commerzBank = new CommerzBank(1000);
        SparKasse sparKasse = new SparKasse(1000);

        System.out.println("deutscheBank.getInterestRate() = " + deutscheBank.getInterestRate());
        System.out.println("commerzBank.getInterestRate() = " + commerzBank.getInterestRate());
        System.out.println("sparKasse.getInterestRate() = " + sparKasse.getInterestRate());

        System.out.println("deutscheBank.calculateInterest() = " + deutscheBank.calculateInterest());
        System.out.println("commerzBank.calculateInterest() = " + commerzBank.calculateInterest());
        System.out.println("sparKasse.calculateInterest() = " + sparKasse.calculateInterest());

        commerzBank.infoDetail();


    }
}
