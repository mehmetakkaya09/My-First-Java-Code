package day_33;

public class House {

    private int houseID;
    private String adresse;
    private String numRooms;
    private double rentAmount; //Mietpries
    private int baujahr;
    private static int nextHouseID;

    static {
        nextHouseID = 1000;
    }

    {
        houseID = nextHouseID++;
        adresse = "unbekannt";
        numRooms = "1";
        rentAmount = 100;
        baujahr = 1990;
    }

    public House() {

    }

    public House(String adresse, String numRooms, double rentAmount, int baujahr) {
        this.adresse = adresse;
        this.numRooms = numRooms;
        this.rentAmount = rentAmount;
        this.baujahr = baujahr;
    }

    public int getHouseID() {
        return houseID;
    }

    public String getAdresse() {
        return adresse;
    }

    public String getNumRooms() {
        return numRooms;
    }

    public double getRentAmount() {
        return rentAmount;
    }

    public int getBaujahr() {
        return baujahr;
    }

    public void setHouseID(int houseID) {
        this.houseID = houseID;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public void setNumRooms(String numRooms) {
        this.numRooms = numRooms;
    }

    public void setRentAmount(double rentAmount) {
        this.rentAmount = rentAmount;
    }

    public void setBaujahr(int baujahr) {
        this.baujahr = baujahr;
    }

    @Override
    public String toString() {
        return "House{" +
                "houseID=" + houseID +
                ", adresse='" + adresse + '\'' +
                ", numRooms='" + numRooms + '\'' +
                ", rentAmount=" + rentAmount +
                ", baujahr=" + baujahr +
                '}';
    }



}
