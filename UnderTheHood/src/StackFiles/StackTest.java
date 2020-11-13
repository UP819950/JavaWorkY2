package StackFiles;

import java.util.Scanner;
import javax.swing.*;
import java.awt.event.*;

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

        System.out.println("\nHow many more nodes do you wish to add: ");      //// USER INPUT PUSH TEST
        int nodeAmount = sc.nextInt();

        for (int i = 0 ; i < nodeAmount ; i ++ ){

            System.out.println("Set node ID (cannot be same as pre-existing IDs): ");
            int newID = sc.nextInt();

            while (newID <= st.getStackLength()){
                System.out.println("ID Taken, set a different ID: ");
                newID = sc.nextInt();

            }

            StackNode userAddition = new StackNode(newID, null);
            st.push(userAddition);
        }
        System.out.println(st.toString());



        System.out.println("How many items do you wish to remove from the stack: "); //// USER INPUT POP TEST
        int userDeleteNodes = sc.nextInt();

        for (int i = 0 ; i < userDeleteNodes ; i ++){
            st.pop();
        }

        System.out.println(st.toString());









        JFrame f=new JFrame("Stack Visualized");         ////// CREATES FRAME AND TEXT AREA
        final JTextArea ta = new JTextArea();
        ta.setBounds(50,50, 270,250);
        ta.setText(st.toString());

        JButton b = new JButton("Remove from");           //// BUTTON TO REMOVE FROM STACK VISUALIZER
        b.setBounds(50,300,115,30);
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                st.pop();
                String removeOutput = st.toString();
                ta.setText(removeOutput);
            }
        });

        JButton b2 = new JButton("Add to");             //// BUTTON TO ADD TO STACK VISUALIZER
        b2.setBounds(205,300,115,30);
        b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e2){
                st.autoPush();
                String addToOutput = st.toString();
                ta.setText(addToOutput);
            }
        });




        f.add(b);f.add(ta);f.add(b2);             ////// DRAWS TO FRAME
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);













    }



}
