import java.util.Scanner;

public class week1ex7 {

    public static void main(String[] args) {

        int x = 0 ;
        int y ;

        Scanner in = new Scanner(System.in);
        System.out.println("Enter line gradient: ");
        int m = in.nextInt();
        System.out.println("Enter line intercept: ");
        int c = in.nextInt();

        boolean isTrue = true;
        while(isTrue) {
            y = ( m * x ) + c ;




            if (y > 50) {

                isTrue = false ;
                continue;

            } else { x ++ ;}

            System.out.println(x + ", " + y);

        }


    }


}
