
    public class Taxi {

        GenericAPITransportDelegate gAPI;

        public Taxi(double fuel, double fuelCapacity, int seats){
            gAPI = new GenericAPITransportDelegate(
                    "EZTravel",
                    0,
                    1,
                    fuel,
                    fuelCapacity,
                    seats
            );
        }

        public void bookSeats(){

            int s =  gAPI.getSeats();
            int c =  gAPI.getCustomers();

            int availableSeats = ( s - c );
            if (availableSeats <= 0){
                System.out.println("No more available seats.");
            } else {
                System.out.println("Available Seats : " + availableSeats);
            }


        }

        public int getCustomers() { return gAPI.getCustomers();}
        public int getSeats() { return gAPI.getSeats();}
        public double getFuel() { return gAPI.getFuel();}
        public double getFuelCapacity() { return gAPI.getFuelCapacity();}


        public void setCustomers(int customers) { gAPI.setCustomers(customers);}
        public void setSeats(int seats) { gAPI.setSeats(seats);}
        public void setFuel(int fuel) { gAPI.setFuel(fuel);}
        public void setFuelCapacity(int fuelCapacity) { gAPI.setFuelCapacity(fuelCapacity);}

    }



