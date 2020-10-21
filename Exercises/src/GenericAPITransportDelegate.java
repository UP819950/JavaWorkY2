public class GenericAPITransportDelegate {


    private String organisation;
    private int transportID;
    private int travellingCustomers;
    private double fuel;
    private double fuelCapacity;
    private int availableSeats;

    public GenericAPITransportDelegate(
            String organisation,
            int transportID,
            int customers,
            double fuel,
            double fuelCapacity,
            int seats)
    {
        this.organisation = organisation;
        this.transportID = transportID;
        this.travellingCustomers = customers;
        this.fuel = fuel;
        this.fuelCapacity = fuelCapacity ;
        this.availableSeats= seats;

    }
    public String getOrganisation(){ return this.organisation;  }
    public int getID(){ return this.transportID; }
    public int getCustomers(){ return this.travellingCustomers; }
    public double getFuel(){ return this.fuel;}
    public double getFuelCapacity(){ return this.fuelCapacity;}
    public int getSeats() { return this.availableSeats;}

    public void setOrganisation(String organisation) { this.organisation = organisation;}
    public void setID(int ID) { this.transportID = ID;}
    public void setCustomers(int customers) {this.travellingCustomers = customers;}
    public void setFuel(double fuel) {this.fuel = fuel;}
    public void setFuelCapacity(double fuelCapacity) {this.fuelCapacity = fuelCapacity;}
    public void setSeats(int seats) {this.availableSeats = seats;}
}
