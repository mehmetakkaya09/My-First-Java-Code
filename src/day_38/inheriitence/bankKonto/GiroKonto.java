package day_38.inheriitence.bankKonto;

public class GiroKonto extends BankKonto{

    private double überziehungLimit; // 1000

    public GiroKonto(String kontoNummer, double saldo, double überziehungLimit){
        super(kontoNummer, saldo);
        this.überziehungLimit = überziehungLimit;
    }

    public double getÜberziehungLimit() {
        return überziehungLimit;
    }

    public void setÜberziehungLimit(double überziehungLimit) {
        this.überziehungLimit = überziehungLimit;
    }

    public void abheben(double betrag) {
                               //5000          //6000
                                        // -1000             -1000
        if (betrag > 0 && super.getSaldo() - betrag >= -überziehungLimit) {
            super.setSaldo(super.getSaldo()-betrag);
            System.out.println("Abhebung ist erfolgreich, neues Saldo: €" + getSaldo());
        }else {
            System.out.println("Ungültiger Abhebungsbetrag oder unzureichendes Saldo");
        }
    }

}
