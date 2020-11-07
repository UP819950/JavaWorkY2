public class Calculator {

    private int FirstNum;
    private int SecondNum;
/*
    public Calculator(int a, int b){
        a = FirstNum;
        b = SecondNum;
    }
*/


    public void add(double firstNum , double secondNum ){
/*
        if (firstNum.hasNextLine()){

        }
*/


        double ans = (firstNum + secondNum);
        System.out.println(firstNum + " + " + secondNum + " = " + ans);
    }

    public void subtract(double firstNum , double secondNum ){
        double ans = (firstNum - secondNum);
        System.out.println(firstNum + " - " + secondNum + " = " + ans);
    }

    public void divide(double firstNum , double secondNum ){

        if (secondNum == 0 ){
            throw new CustomException("Cannot divide by Zero");
        }
        else{

            double ans = (firstNum / secondNum);
            System.out.println(firstNum + " / " + secondNum + " = " + ans);

        }



    }

    public void multiply(double firstNum , double secondNum ){
        double ans = (firstNum * secondNum);
        System.out.println(firstNum + " * " + secondNum + " = " + ans);
    }


}
