public class week1Ex3 {


    public static void main(String[] args) {

    int x = 0;
    boolean isTrue = true ;
    while(isTrue) {

        int y = (-3*x)-2 ;
        System.out.println(x + ", " + y);
        x++;
        if (x > 20){
            isTrue = false ;
        }

    }

    }
}
