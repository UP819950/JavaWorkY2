public class EZTest {

    public static void main (String[] args){
        EZT ezt = new EZT(15,12);

        for (int i = 0 ; i < 15; i++){
            ezt.addTaxi(100,100,4);
        }

        for (int i = 0 ; i < 12; i++){
            ezt.addMinibus(100,100,8);
        }



        Taxi temp = ezt.getTaxi(3);
        temp.setFuel((int) (temp.getFuel() - 1));



        for (int i = 0 ; i < 15; i++) {

            System.out.println("Taxi:" + " fuel: " + ezt.getTaxi(i).getFuel() + " fuel capacity: " + ezt.getTaxi(i).getFuelCapacity());
        }
        for (int i = 0 ; i < 12; i++) {

            System.out.println("Minibus:" + " fuel: " + ezt.getMinibus(i).getFuel() + " fuel capacity: " + ezt.getMinibus(i).getFuelCapacity());
        }


        ezt.drive(ezt, 4, 25, "Taxi");
        ezt.drive(ezt, 12, 94, "Taxi");
        ezt.drive(ezt, 4, 30, "Minibus");
        ezt.drive(ezt, 5, 86, "Minibus");



        for (int i = 0 ; i < 15; i++) {

            System.out.println("Taxi:" + " fuel: " + ezt.getTaxi(i).getFuel() + " fuel capacity: " + ezt.getTaxi(i).getFuelCapacity());
        }
        for (int i = 0 ; i < 12; i++) {

            System.out.println("Minibus:" + " fuel: " + ezt.getMinibus(i).getFuel() + " fuel capacity: " + ezt.getMinibus(i).getFuelCapacity());
        }

        ezt.notification(ezt);







    }




}
