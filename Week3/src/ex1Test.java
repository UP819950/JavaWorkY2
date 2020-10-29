public class ex1Test {

    public static void main(String[] args) {
        Minibus myRental = new Minibus("BLV", 453, 4, 15, 67, 6);
        System.out.println(myRental.getSeats());
        System.out.println(myRental.getCustomers());
    }


    public static class Minibus extends GenericAPITransportBase {

        public Minibus(
                String organisation,
                int transportID,
                int customers,
                double fuel,
                double fuelCapacity,
                int seats) {
            super();

            setOrganisation(organisation);
            setID(transportID);
            setFuel(fuel);
            setFuelCapacity(fuelCapacity);
            setSeats(seats);
            setCustomers(customers);


        }



        @Override
        protected void setCustomers(int customers) {

            if(fuel < (fuelCapacity / 2)){
                customers = 1 ;
                super.setCustomers(customers);
            } else {super.setCustomers(customers);}


        }



        /* THE FOLLOWING WONT WORK BECAUSE NO OVERRIDE
        public void setCustomers(double fuel, double fuelCapacity){
            if(fuel < (fuelCapacity / 2)){
                int customers = 1;
                super.setCustomers(customers);



            }
        }
*/

        protected void setSeats(int seats) {
            super.setSeats(seats-1);
        }

    }
}
