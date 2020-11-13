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

        if (topNode.getLinkedNode() == null){
            topNode = null;
            firstNode = null;
            stackLength = 0;
            throw new CustomException("Last node in stack");
        }
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

    public void autoPush(){

        int autoId = topNode.getID() + 1;
        StackNode autoNode = new StackNode(autoId, null);
        autoNode.setLinkedNode(this.topNode);

        this.topNode = autoNode;
        this.stackLength += 1;

    }


    public StackNode getFirstNode() {
        return firstNode;
    }

    public StackNode getTopNode() {
        if(topNode == null){
            throw new CustomException("No Nodes in Stack");
        }
        return topNode;
    }

    public void setTopNode(StackNode topNode) {
        this.topNode = topNode;
    }

    public int getStackLength() {
        return stackLength;
    }

    @Override
   public String toString(){



       //(topNode.toString());

       String output = null;
       String tn = topNode.toString();
       output = "\nNumber of Nodes in stack: " + this.stackLength + " Nodes in stack: \n" + tn;


        for (int i = 0 ; i < 0  ; i ++ ){

            StackNode temp = topNode.getLinkedNode();
            String sn = temp.toString();
            output += sn + "\n" ;
            temp = temp.getLinkedNode();

        }

        return  output;

   }












}
