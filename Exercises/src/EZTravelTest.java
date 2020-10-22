public class EZTravelTest {


    public static void main(String[] args)
    {

        EZTravel [] taxiArray = new EZTravel[15];
        EZTravel [] miniArray = new EZTravel[12];

        EZTravel triggerObject = new EZTravel(100,100,100);

        EZTravel m1 = new EZTravel(100,100,12); miniArray[0] = m1 ;
        EZTravel m2 = new EZTravel(100,100,12); miniArray[1] = m2 ;
        EZTravel m3 = new EZTravel(100,100,12); miniArray[2] = m3 ;
        EZTravel m4 = new EZTravel(100,100,12); miniArray[3] = m4 ;
        EZTravel m5 = new EZTravel(100,100,12); miniArray[4] = m5 ;
        EZTravel m6 = new EZTravel(100,100,12); miniArray[5] = m6 ;
        EZTravel m7 = new EZTravel(100,100,12); miniArray[6] = m7 ;
        EZTravel m8 = new EZTravel(100,100,12); miniArray[7] = m8 ;
        EZTravel m9 = new EZTravel(100,100,12); miniArray[8] = m9 ;
        EZTravel m10 = new EZTravel(100,100,12); miniArray[9] = m10 ;
        EZTravel m11 = new EZTravel(100,100,12); miniArray[10] = m11 ;
        EZTravel m12 = new EZTravel(100,100,12); miniArray[11] = m12 ;

        EZTravel t1 = new EZTravel(100,100,4); taxiArray[0] = t1;
        EZTravel t2 = new EZTravel(100,100,4); taxiArray[1] = t2;
        EZTravel t3 = new EZTravel(100,100,4); taxiArray[2] = t3;
        EZTravel t4 = new EZTravel(100,100,4); taxiArray[3] = t4;
        EZTravel t5 = new EZTravel(100,100,4); taxiArray[4] = t5;
        EZTravel t6 = new EZTravel(100,100,4); taxiArray[5] = t6;
        EZTravel t7 = new EZTravel(100,100,4); taxiArray[6] = t7;
        EZTravel t8 = new EZTravel(100,100,4); taxiArray[7] = t8;
        EZTravel t9 = new EZTravel(100,100,4); taxiArray[8] = t9;
        EZTravel t10 = new EZTravel(100,100,4); taxiArray[9] = t10;
        EZTravel t11 = new EZTravel(100,100,4); taxiArray[10] = t11;
        EZTravel t12 = new EZTravel(100,100,4); taxiArray[11] = t12;
        EZTravel t13 = new EZTravel(100,100,4); taxiArray[12] = t13;
        EZTravel t14 = new EZTravel(100,100,4); taxiArray[13] = t14;
        EZTravel t15 = new EZTravel(100,100,4); taxiArray[14] = t15;


        // testing to drop fuel of taxi 4
        System.out.println("Taxi 4 fuel level before 20 removed : " + t4.getFuel());
        System.out.println("Running drive function");
        t4.drive(3,taxiArray, 20);
        System.out.println("Taxi 4 fuel level after 20 removed : " + t4.getFuel() + "\n");


        for (int i = 0 ; i < taxiArray.length ; i ++){
            System.out.println( "Taxi Number: " + (i+1) + ". Fuel Remaining: " + taxiArray[i].getFuel() + "\n");
        }

        // testing to drop fuel of minibus 9
        System.out.println("Minibus 9 fuel level before 85 removed : " + m9.getFuel());
        System.out.println("Running drive function");
        m9.drive(8,miniArray, 85);
        System.out.println("Minibus 9 fuel level after 85 removed : " + m9.getFuel() + "\n");


        for (int i = 0 ; i < miniArray.length ; i ++){
            System.out.println( "Minibus Number: " + (i+1) + ". Fuel Remaining: " + miniArray[i].getFuel() + "\n");
        }

        System.out.println("\n----------------------------------\n\n");


        triggerObject.notification(taxiArray,miniArray);

        System.out.println("\n----------------------------------\n\n");
        t4.drive(3,taxiArray,79);
        triggerObject.notification(taxiArray,miniArray);




    }













}
