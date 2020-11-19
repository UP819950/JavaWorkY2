package StackFiles;

import java.awt.*;
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

        Stack st = new Stack(sn1);

        st.push(sn2);
        st.push(sn3);
        st.push(sn4);
        st.push(sn5);

       System.out.println(st.toString());

        Scanner sc = new Scanner(System.in);

        System.out.println("\nHow many more nodes do you wish to add: ");      //// USER INPUT PUSH TEST

        int nodeAmount = sc.nextInt();
        while (nodeAmount < 0) {
            System.out.println("Please enter 0 or a positive integer: ");
            nodeAmount = sc.nextInt();
        }

        if (nodeAmount == 0 ){

        } else {

            System.out.println("Select '0' to use predetermined ID's or '1' to input your own ID's: ");
            int autoOrManual = sc.nextInt();

            while (autoOrManual != 0 && autoOrManual != 1) {

                System.out.println("Invalid option please select again: ");
                autoOrManual = sc.nextInt();

            }

            if (autoOrManual == 0) {

                for (int i = 0; i < nodeAmount; i++) {
                    st.autoPush();
                }

            } else {

                for (int i = 0; i < nodeAmount; i++) {

                    System.out.println("Set node ID (cannot be same as pre-existing IDs): ");
                    int newID = sc.nextInt();

                    while (newID <= st.getStackLength()) {
                        System.out.println("ID Taken, set a different ID: ");
                        newID = sc.nextInt();

                    }

                    StackNode userAddition = new StackNode(newID, null);
                    st.push(userAddition);
                }
            }
        }

        System.out.println(st.toString());

        System.out.println("How many items do you wish to remove from the stack: "); //// USER INPUT POP TEST
        int userDeleteNodes = sc.nextInt();

        if (userDeleteNodes > st.stackLength){
            int maximumRemoval = st.stackLength;
            userDeleteNodes = maximumRemoval;
        }

        for (int i = 0 ; i < userDeleteNodes ; i ++){
            st.pop();
        }

        System.out.println(st.toString());


        JFrame f=new JFrame("Stack Visualized");         ////// CREATES FRAME AND TEXT AREA
        final JTextArea ta = new JTextArea();
        ta.setBackground(Color.black);
        ta.setBounds(50,50, 270,250);

        int newTop = 0;
        try {
            newTop = st.getTopNode().getID();
        } catch (CustomException ce){
            System.out.println(ce.getMessage());
        }

        String newTopDisplay = "";
        if (st.getStackLength() ==  0){
            newTopDisplay = "No Nodes in stack";
            ta.setText(newTopDisplay + "\n" +  st.toString());
            ta.setForeground(Color.red);
        } else {
            newTopDisplay = ("Current top node: " + newTop);
            ta.setText(newTopDisplay + "\n" +  st.toString());
            ta.setForeground(Color.white);
        }


        JButton b = new JButton("Remove from");           //// BUTTON TO REMOVE FROM STACK VISUALIZER
        b.setBounds(50,300,115,30);
        b.setBackground(Color.red);
        b.addActionListener(new ActionListener(){

            public void actionPerformed(ActionEvent e){

                int newTopID;
                StackNode temp = null;

                try {
                    temp = st.getTopNode();
                } catch (CustomException ce) {
                    System.out.println(ce.getMessage());
                }

                try {
                    st.pop();
                } catch (CustomException ce ) {
                    System.out.println(ce.getMessage());
                }

                String newTopDisplay;

                if (st.topNode == null){
                    newTopDisplay = ("No Nodes in stack");
                } else {
                    newTopID = temp.getID();
                    newTopDisplay = ("Current top node: " + (newTopID - 1));
                }

                String removeOutput = newTopDisplay + "\n" + st.toString();
                ta.setText(removeOutput);
                ta.setForeground(Color.red);

            }

        }
        );

        JButton b2 = new JButton("Add to");             //// BUTTON TO ADD TO STACK VISUALIZER
        b2.setBounds(205,300,115,30);
        b2.setBackground(Color.green);
        b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e2){

                st.autoPush();
                int newTop = st.getTopNode().getID();
                String newTopDisplay = ("Current top node: " + newTop);

                String addToOutput = newTopDisplay + "\n" +  st.toString();
                ta.setText(addToOutput);
                ta.setForeground(Color.green);

            }
        });

        f.add(b);f.add(ta);f.add(b2);             ////// DRAWS TO FRAME
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);

    }

}
