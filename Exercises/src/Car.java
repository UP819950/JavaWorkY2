public class Car {

    GenericAPITransportDelegate gAPI;

    public Car(double fuel, double fuelCapacity, int seats){
        gAPI = new GenericAPITransportDelegate(
                null,
                0,
                0,
                fuel,
                fuelCapacity,
                seats
        );
    }

    public int getSeats() { return gAPI.getSeats();}
    public double getFuel() { return gAPI.getFuel();}
    public double getFuelCapacity() { return gAPI.getFuelCapacity();}



    public void setSeats(int seats) { gAPI.setSeats(seats);}
    public void setFuel(int fuel) { gAPI.setFuel(fuel);}
    public void setFuelCapacity(int fuelCapacity) { gAPI.setFuelCapacity(fuelCapacity);}

}
