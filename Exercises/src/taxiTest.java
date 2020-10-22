

public class taxiTest {

    public static void main(String[] args) {

        Taxi t = new Taxi(50, 78, 4);
        // with 1 customer
        t.bookSeats();

        // with 3 customers
        t.setCustomers(3);
        t.bookSeats();

        // with 4 customers
        t.setCustomers(4);
        t.bookSeats();


    }


}
