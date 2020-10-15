public class week1Ex10 {

    public static void main(String[] args){


        MyClass2 myObject = new MyClass2(5,6,"Relevence Factor - ");
        System.out.println(myObject.getTersonomy() + "\n\n" );


        /* TESTING */

        System.out.println("\n\n**Testing start**\n\n");

        System.out.println("Testing for cSetting being less than fBounds. Expectation: tRes will be = false and" +
                " relevence factor disguised.\n----------------------------------");
        MyClass2 testObj = new MyClass2(6,5,"Relevence Factor - ");
        System.out.println("cSetting = " + testObj.myCX +"\n" + "fBounds = " + testObj.fb + "\n\n" +"tRes = " + testObj.tRes + "\n" + testObj.getTersonomy());
        System.out.println("----------------------------------\n\n");

        System.out.println("Testing for cSetting being equal to fBounds. Expectation: tRes will be = false and" +
                " relevence factor disguised.\n----------------------------------");
        MyClass2 testObj2 = new MyClass2(5,5,"Relevence Factor - ");
        System.out.println("cSetting = " + testObj2.myCX +"\n" + "fBounds = " + testObj2.fb + "\n\n" +"tRes = " + testObj2.tRes + "\n" + testObj2.getTersonomy());
        System.out.println("----------------------------------\n\n");

        System.out.println("Testing for cSetting greater than fBounds. Expectation: tRes will be = true and" +
                " relevence factor masked.\n----------------------------------");
        MyClass2 testObj3 = new MyClass2(5,100,"Relevence Factor - ");
        System.out.println("cSetting = " + testObj3.myCX +"\n" + "fBounds = " + testObj3.fb + "\n\n" +"tRes = " + testObj3.tRes + "\n" + testObj3.getTersonomy());
        System.out.println("----------------------------------");

        System.out.println("\n\n**Testing complete**");

        /* TESTING COMPLETE*/

    }

    public static class MyClass2 {
        private int myCX;    /// never used
        private String myPRLayer;
        private Boolean tRes;
        private int fb ;

        public MyClass2 (int fBounds, int cSetting, String uCon){
            fb = fBounds;
            tRes = true ;
            myCX = cSetting;
            myPRLayer = uCon ;
            if (cSetting <= fBounds){ // test this line
                tRes = false;
            }
        }

        public String getTersonomy() {

            if (!tRes){
                return myPRLayer + " - disguised";

            }
            return myPRLayer + " - masked";
        }

        public String getMyPRLayer() {
            return myPRLayer;
        }
    }
























}
