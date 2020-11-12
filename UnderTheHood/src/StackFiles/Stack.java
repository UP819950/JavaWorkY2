package StackFiles;

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


    /*
   public String toString(){

        for (int i = 0 ; i < stackLength ; i ++ ){





            //loop round stack and return each nodes tostring
        }




   }

*/










}
