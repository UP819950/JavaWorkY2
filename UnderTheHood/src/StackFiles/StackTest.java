package StackFiles;

import java.util.Scanner;

public class StackTest {

    public static void main (String[] args){

        StackNode sn1 = new StackNode(1,null);
        StackNode sn2 = new StackNode(2,null);
        StackNode sn3 = new StackNode(3,null);
        StackNode sn4 = new StackNode(4,null);
        StackNode sn5 = new StackNode(5,null);
        StackNode sn6 = new StackNode(6,null);
        StackNode sn7 = new StackNode(7,null);
        StackNode sn8 = new StackNode(8,null);



        Stack st = new Stack( sn1, sn1);

        st.push(sn2);
        st.push(sn3);
        st.push(sn4);
        st.push(sn5);
        st.push(sn6);
        st.push(sn7);
        st.push(sn8);

        System.out.println(st.toString());


        st.pop();

        System.out.println(st.toString());


        st.pop();

        System.out.println(st.toString());




        Scanner sc = new Scanner(System.in);

        System.out.println("How many more nodes do you wish to add: ");
        int nodeAmount = sc.nextInt();

        for (int i = 0 ; i < nodeAmount ; i ++ ){
            System.out.println("Node ID: ");
            int newID = sc.nextInt();

            StackNode userAddition = new StackNode(newID, null);
            st.push(userAddition);

        }



        System.out.println(st.toString());









    }



}
