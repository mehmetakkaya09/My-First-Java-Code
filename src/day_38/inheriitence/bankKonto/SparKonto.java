package day_38.inheriitence.bankKonto;

public class SparKonto extends BankKonto{

    private double zinssatz;

    public SparKonto(String kontoNummer, double saldo, double zinssatz){
        super(kontoNummer, saldo);
        this.zinssatz = zinssatz;
    }

    public double getZinssatz() {
        return zinssatz;
    }

    public void setZinssatz(double zinssatz) {
        this.zinssatz = zinssatz;
    }

    public void zinsenAnwenden() {
        double zinsen = super.getSaldo() * getZinssatz() / 100;
        super.einzahlen(zinsen);
        System.out.println("Zinsen angewendet. Neues Saldo: €" + super.getSaldo());
    }

}
