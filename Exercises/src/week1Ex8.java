public class week1Ex8 {


    public static void main(String[] args) {

        for (int i =0 ; i < 5 ; i ++ ){
            for(int j = 0 ; j < 5; j ++){
                DClass myObject = new DClass(i,j);
                System.out.println(myObject.getResults());
            }
        }

    }

    public static class DClass {

        private int m;
        private int c;

        public DClass(int val1, int val2) {

            m = val1 ;
            c = val2 ;

        }


        public int getResults(){

            return (m*m) + c ;

        }


    }
}
