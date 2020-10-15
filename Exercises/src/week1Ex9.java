public class week1Ex9 {



    public static void main(String[] args){


        NClass nObject = new NClass(1, "=", true);
        System.out.println(nObject.getIVal() + nObject.getSVal() + nObject.getBVal());


    }


public static class NClass {
        private int iVal;
        private String sVal;
        private Boolean bVal;

        public NClass(int inInt, String inStr, Boolean inBool){

            iVal = inInt ;
            sVal = inStr ;
            bVal = inBool ;

        }

        public int getIVal() {return iVal;}
        public String getSVal(){return sVal;}
        public Boolean getBVal(){return bVal;}


}

























}




