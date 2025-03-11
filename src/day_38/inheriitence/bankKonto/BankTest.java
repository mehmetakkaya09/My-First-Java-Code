package day_38.inheriitence.bankKonto;

public class BankTest {

    public static void main(String[] args) {

        SparKonto sparKonto = new SparKonto("1234", 5000,10);

        sparKonto.einzahlen(1000);
        sparKonto.abheben(1000);

        sparKonto.zinsenAnwenden();

        sparKonto.abheben(6000);

        System.out.println("**********************************\n\n");
        GiroKonto giroKonto = new GiroKonto("4321", 5000,1000);

        giroKonto.einzahlen(1000);
        giroKonto.abheben(1000);

        giroKonto.abheben(6000);

    }
}
