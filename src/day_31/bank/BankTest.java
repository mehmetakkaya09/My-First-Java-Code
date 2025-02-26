package day_31.bank;

public class BankTest {

    public static void main(String[] args) {

        Konto konto1 = new Konto("dollar", "1234", 100000);
        Konto konto2 = new Konto("euro", "4321", 200000);
        Konto konto3 = new Konto("pound", "5678", 150000);
        Konto konto4 = new Konto("tl", "9874", 1000000);

        System.out.println(konto1);
        System.out.println(konto2);
        System.out.println(konto3);

        Kunde kunde1 = new Kunde("Blagoja");
        Kunde kunde2 = new Kunde("Sureyya");
        Kunde kunde3 = new Kunde("Vadim");

        kunde1.addKonto(konto1);
        kunde1.addKonto(konto2);

        kunde2.addKonto(konto4);
        kunde2.addKonto(konto1);

        kunde3.addKonto(konto1);
        kunde3.addKonto(konto2);
        kunde3.addKonto(konto4);

        System.out.println(kunde1);
        System.out.println(kunde2);
        System.out.println(kunde3);


        Bank bank1 = new Bank("ABC", "Berlin");
        bank1.addKunde(kunde1);
        bank1.addKunde(kunde2);
        bank1.addKunde(kunde3);
        System.out.println("***********************************************");
        System.out.println(bank1);

        kunde1.einzahlen(konto2,50000);

        kunde2.abheben(konto4, 200000);

        kunde3.abheben(konto1, 80000);
        System.out.println("**************************");
        System.out.println(kunde1);
        System.out.println(kunde2);
        System.out.println(kunde3);

    }


}
