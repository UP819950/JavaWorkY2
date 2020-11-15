package QueueFiles;


import java.awt.*;
import java.util.Scanner;
import javax.swing.*;
import java.awt.event.*;

public class QueueTest {
    public static void main (String[] args){

        Queue Q = new Queue(null,null);


        QueueNode q1 = new QueueNode(1,null,null);
        QueueNode q2 = new QueueNode(2,null,null);
        QueueNode q3 = new QueueNode(3,null,null);
        QueueNode q4 = new QueueNode(4,null,null);

        Q.enqueue(q1);
        Q.enqueue(q2);
        Q.enqueue(q3);
        Q.enqueue(q4);

        System.out.println(Q.toString());

        Q.deQueue();
        Q.deQueue();


        System.out.println(Q.toString());



        Scanner sc = new Scanner(System.in);

        System.out.println("\nHow many more nodes do you wish to add: ");      //// USER INPUT PUSH TEST
        int nodeAmount = sc.nextInt();

        for (int i = 0 ; i < nodeAmount ; i ++ ){

            System.out.println("Set node ID (cannot be same as pre-existing IDs): ");
            int newID = sc.nextInt();

            while (newID <= Q.getQueueLength()){
                System.out.println("ID Taken, set a different ID: ");
                newID = sc.nextInt();

            }

            QueueNode userAddition = new QueueNode(newID, null,null);
            Q.enqueue(userAddition);
        }
        System.out.println(Q.toString());


        System.out.println("How many items do you wish to remove from the Queue: "); //// USER INPUT POP TEST
        int userDeleteNodes = sc.nextInt();

        for (int i = 0 ; i < userDeleteNodes ; i ++){
            Q.deQueue();
        }

        System.out.println(Q.toString());





        JFrame f=new JFrame("Queue Visualized");         ////// CREATES FRAME AND TEXT AREA
        final JTextArea ta = new JTextArea();
        ta.setBackground(Color.black);
        ta.setBounds(50,50, 270,250);
        int newFront = Q.getFrontNode().getID();
        String newTopDisplay = ("Current Front Node: " + newFront);
        ta.setText(newTopDisplay + "\n" +  Q.toString());
        ta.setForeground(Color.white);

        JButton b = new JButton("Dequeue");           //// BUTTON TO REMOVE FROM STACK VISUALIZER
        b.setBounds(50,300,115,30);
        b.setBackground(Color.red);
        b.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){


                Q.deQueue();

                int newFront;
                newFront = Q.getFrontNode().getID();

                String newFrontDisplay = ("Current Front Node: " + newFront);

                String removeOutput = newFrontDisplay + "\n" + Q.toString();
                ta.setText(removeOutput);
                ta.setForeground(Color.red);
            }
        });

        JButton b2 = new JButton("Enqueue");             //// BUTTON TO ADD TO STACK VISUALIZER
        b2.setBounds(205,300,115,30);
        b2.setBackground(Color.green);
        b2.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e2){

                Q.autoQueue();
                int newFront = Q.getFrontNode().getID();
                String newFrontDisplay = ("Current Front Node: " + newFront);

                String addToOutput = newFrontDisplay + "\n" +  Q.toString();
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
