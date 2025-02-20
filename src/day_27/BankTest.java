package day_27;

public class BankTest {

    public static void main(String[] args) {

        Bank bank1 = new Bank();
        System.out.println("bank1.name = " + bank1.name.toUpperCase());

        Bank bank2 = new Bank("ETS Bank", "Oberursel", 5000);

        System.out.println("bank2.name = " + bank2.name.toUpperCase());
        System.out.println("bank2.adresse = " + bank2.adresse);
        System.out.println("bank2.kontoNummer = " + bank2.kontoNummer);

        Kunde kunde1 = new Kunde("John", "Doe");

        bank2.kundeHinzufügen(kunde1);

        Kunde kunde2 = new Kunde("Jane", "White");
        bank2.kundeHinzufügen(kunde2);

        bank1.kundeHinzufügen(kunde2);

        //bank2.kundenListe();

        System.out.println("kunde1.kontostand = " + kunde1.kontostand);

        bank2.geldEinzahlen(kunde1, 10);
        System.out.println("kunde1.kontostand = " + kunde1.kontostand);

        System.out.println("kunde2.kontostand = " + kunde2.kontostand);
        bank2.geldEinzahlen(kunde2,100);
        System.out.println("kunde2.kontostand = " + kunde2.kontostand);

        bank2.geldAbheben(kunde2,100);
        System.out.println("kunde2.kontostand = " + kunde2.kontostand);



    }
}
