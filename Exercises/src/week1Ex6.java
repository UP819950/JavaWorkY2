import java.util.Scanner;
public class week1Ex6 {


    public static void main(String[] args) {

       Scanner in = new Scanner(System.in);
       System.out.println("Enter upper value for y: ");
       int yLimit = in.nextInt();

       int x = 0 ;
       int y ;

       boolean isTrue = true;
       while(isTrue){

           y = (3*x) + 5;

           if (y > yLimit ){
               isTrue = false;
               continue;
           }
           System.out.println(x + ", " + y);
           x ++ ;






       }

    }

}
