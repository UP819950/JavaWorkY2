public class GenericAPITransportBase {

    protected String organisation;
    protected int transportID;
    protected int travellingCustomers;
    protected double fuel;
    protected double fuelCapacity;
    protected int availableSeats;


    public GenericAPITransportBase(){;};

    public GenericAPITransportBase(
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
    protected String getOrganisation(){ return this.organisation;  }
    protected int getID(){ return this.transportID; }
    protected int getCustomers(){ return this.travellingCustomers; }
    protected double getFuel(){ return this.fuel;}
    protected double getFuelCapacity(){ return this.fuelCapacity;}
    protected int getSeats() { return this.availableSeats;}

    protected void setOrganisation(String organisation) { this.organisation = organisation;}
    protected void setID(int ID) { this.transportID = ID;}
    protected void setCustomers(int customers) {this.travellingCustomers = customers;}
    protected void setFuel(double fuel) {this.fuel = fuel;}
    protected void setFuelCapacity(double fuelCapacity) {this.fuelCapacity = fuelCapacity;}
    protected void setSeats(int seats) {this.availableSeats = seats;}





}
