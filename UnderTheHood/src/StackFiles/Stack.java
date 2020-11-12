package StackFiles;

import java.util.ArrayList;

public class Stack {

    StackNode firstNode;
    StackNode topNode;
    int stackLength;

    //LIFO algorithm  (Last in First out)


    public Stack(StackNode firstNode, StackNode topNode) {
        this.firstNode = firstNode;
        this.topNode = topNode;
        this. stackLength = 1;
    }

    public void pop(){

        StackNode temp = topNode.getLinkedNode();
        topNode = null;
        topNode = temp;
        this.stackLength -= 1 ;
    }






    public void push(StackNode newNode){
        newNode.setLinkedNode(this.topNode);
        this.topNode = newNode;
        this.stackLength += 1;
    }


@Override
   public String toString(){



       //(topNode.toString());

       String output = null;
       String tn = topNode.toString();
       output = "Number of Nodes in stack: " + this.stackLength + " Nodes in stack: \n" + tn;


        for (int i = 0 ; i < 0  ; i ++ ){

            StackNode temp = topNode.getLinkedNode();
            String sn = temp.toString();
            output += sn ;
            temp = temp.getLinkedNode();

        }

        return  output;

   }












}
