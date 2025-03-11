package day_38.inheriitence.bankKonto;

public class BankKonto {

    private String kontoNummer;
    private double saldo;

    public BankKonto(String kontoNummer, double saldo) {
        this.kontoNummer = kontoNummer;
        this.saldo = saldo;
    }

    public String getKontoNummer() {
        return kontoNummer;
    }

    public void setKontoNummer(String kontoNummer) {
        this.kontoNummer = kontoNummer;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void einzahlen(double betrag) {
        if (betrag > 0) {
            saldo += betrag;
            System.out.println("Einzahlung ist erfolgreich, neues Saldo: €" + saldo);
        }else {
            System.out.println("Ungültiger Einzahlungsbetrag");
        }
    }

    public void abheben(double betrag) {
        if (betrag > 0 && betrag <= saldo) {
            saldo -= betrag;
            System.out.println("Abhebung ist erfolgreich, neues Saldo: €" + saldo);
        }else {
            System.out.println("Ungültiger Abhebungsbetrag oder unzureichendes Saldo");
        }
    }


}
//sparkonto
//girokonto