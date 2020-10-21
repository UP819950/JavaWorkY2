public class testMinibus {

    public static void main (String[] args) {

        Minibus m = new Minibus(50,78,12);
        // with 1 customer
        m.bookSeats();

        // with 6 customers
        m.setCustomers(6);
        m.bookSeats();

        // with 12 customers
        m.setCustomers(12);
        m.bookSeats();


    }


}
