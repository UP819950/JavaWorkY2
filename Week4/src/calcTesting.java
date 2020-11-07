import java.util.Scanner;

public class calcTesting {


    public static void main (String[] args ){
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();




        System.out.println("Please enter your first number: ");

        double num1 = sc.nextDouble();








        System.out.println("Operation: \n Add (1) \n Sub (2) \n Divide (3) \n Multiply (4)");
        int op = sc.nextInt();
        while (op > 4){
            System.out.println("Try again \n Operation: \n Add (1) \n Sub (2) \n Divide (3) \n Multiply (4)");
            op = sc.nextInt();
        }






        System.out.println("Please enter your second number: ");

        double num2 = sc.nextDouble();




        if (op == 1){
            calc.add(num1,num2);
        }

        if (op == 2){
            calc.subtract(num1,num2);
        }

        try{
            if (op == 3){
                calc.divide(num1,num2);
            }
        }
        catch(CustomException ce) {
            System.out.println(ce.getMessage());
        }

        if (op == 4){
            calc.multiply(num1,num2);
        }



        /*
        calc.add(1,5);
        calc.subtract(5,3);
        calc.divide(20,5);
        calc.multiply(5,20);
        calc.add(4,6);
        calc.subtract(8,2);
        calc.divide(5,77);
        calc.multiply(2,43);
        calc.divide(4.0/0.0);
*/

    }



}
