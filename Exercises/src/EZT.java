import java.util.ArrayList;

public class EZT {

    ArrayList taxis = new ArrayList();
    ArrayList minibuses = new ArrayList();


    public EZT (int tx , int mb){

        minibuses = new ArrayList<Minibus>(mb);
        taxis = new ArrayList<Taxi>(tx);

    }

    public Taxi getTaxi(int index){
        return (Taxi) taxis.get(index);
    }

    public void addTaxi(double fuel, double fuelCapacity, int seats){
        Taxi tx = new Taxi(fuel,fuelCapacity,seats);
        taxis.add(tx);
    }

    public Minibus getMinibus(int index){
        return (Minibus) minibuses.get(index);
    }

    public void addMinibus(double fuel, double fuelCapacity, int seats){
        Minibus mb = new Minibus(fuel,fuelCapacity,seats);
        minibuses.add(mb);
    }

    public void drive(EZT object, int index, int fuelUsed, String vehicle){

        if (vehicle == "Taxi"){
            object.getTaxi(index).setFuel((int) (object.getTaxi(index).getFuel() - fuelUsed));
        } else if ( vehicle == "Minibus"){
            object.getMinibus(index).setFuel((int) (object.getMinibus(index).getFuel() - fuelUsed));
        }

    }

    public void notification(EZT ezt){

        for (int i = 0 ; i < taxis.size() ; i ++){
            int temp = (int) ezt.getTaxi(i).getFuel();

            if (temp < ( ezt.getTaxi(i).getFuelCapacity() / 4 ) ){
                System.out.println("Warning Taxi Index: " + i + " is critically low on fuel ");
            }


        }
        for (int i = 0 ; i < minibuses.size() ; i ++){
            int temp = (int) ezt.getMinibus(i).getFuel();

            if (temp < ( ezt.getMinibus(i).getFuelCapacity() / 4 ) ){
                System.out.println("Warning Minibus Index: " + i + " is critically low on fuel ");
            }


        }




    }




}
