public class week1Ex5 {

    public static void main(String[] args) {

        int y1 = 0 ;
        int y2 = 0 ;
        int x = 0;


        boolean isTrue = true ;
        while(isTrue){
            y1 = (3*x) - 8 ;
            y2 = (-4*x) + 6 ;

            if (y1 == y2){
                isTrue = false ;
            } else {x ++ ;}

        }
        System.out.println(x + ", " + y2 );

    }
}
