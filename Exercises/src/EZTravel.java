



public class EZTravel {

    GenericAPITransportDelegate gAPI;
    public EZTravel(double fuel, double fuelCapacity, int seats){
        gAPI = new GenericAPITransportDelegate(
                "EZTravel",
                0,
                0,
                fuel,
                fuelCapacity,
                seats
        );
    }



    public int getCustomers() { return gAPI.getCustomers();}
    public int getSeats() { return gAPI.getSeats();}
    public double getFuel() { return gAPI.getFuel();}
    public double getFuelCapacity() { return gAPI.getFuelCapacity();}


    public void setCustomers(int customers) { gAPI.setCustomers(customers);}
    public void setSeats(int seats) { gAPI.setSeats(seats);}
    public void setFuel(double fuel) { gAPI.setFuel(fuel);}
    public void setFuelCapacity(double fuelCapacity) { gAPI.setFuelCapacity(fuelCapacity);}




    public void drive(int id, EZTravel [] array, double fuelUsed) {

        double currentFuel = (array[id].getFuel());
        double newFuel = currentFuel - fuelUsed ;

        array[id].setFuel(newFuel);


    }

    public void notification( EZTravel [] arrayTaxi, EZTravel [] arrayMini) {

        for (int i = 0 ; i < arrayTaxi.length ; i ++){

            double fuelLevel = arrayTaxi[i].getFuel();
            double fuelThreshold = (arrayTaxi[i].getFuelCapacity() / 4);
            if (fuelLevel < fuelThreshold){
                System.out.println("Taxi Number: " + (i+1) + ". Is Critically" +
                        " low on Fuel with " + arrayTaxi[i].getFuel() + " Remaining" );
            }


        }


        for (int i = 0 ; i < arrayMini.length ; i ++){

            double fuelLevel = arrayMini[i].getFuel();
            double fuelThreshold = (arrayMini[i].getFuelCapacity() / 4);
            if (fuelLevel < fuelThreshold){
                System.out.println("Minibus Number: " + (i+1) + ". Is Critically" +
                        " low on Fuel with " + arrayMini[i].getFuel() + " Remaining" );
            }


        }





    }







}






