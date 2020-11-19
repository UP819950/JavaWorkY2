package StackFiles;

public class Stack {

    //LIFO algorithm  (Last in First out)

    StackNode topNode;
    int stackLength;

    public Stack( StackNode topNode) {

        this.topNode = topNode;
        this. stackLength = 1;

    }

    public void pop(){

        if (topNode == null){                    // Checks if stack is empty, thus cannot remove from null
            throw new CustomException("Cannot remove from 'null'");
        }

        if (topNode.getLinkedNode() == null){     // If this is the last node in stack then top node is set null
            topNode = null;
            stackLength = 0;
            return;
        }

        StackNode temp = topNode.getLinkedNode();  // normal pop functions
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

        int autoId;

        if (topNode == null){
            autoId = 1 ;
        } else {
            autoId = topNode.getID() + 1;
        }

        StackNode autoNode = new StackNode(autoId, null);
        autoNode.setLinkedNode(this.topNode);

        this.topNode = autoNode;
        this.stackLength += 1;

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


        String output = null;
        StackNode temp ;

       if (topNode == null) {

           return ("\n");

       }

       String tn = topNode.toString();
       output = "\nNumber of Nodes in stack: " + this.stackLength + "\n" + tn  ;
       temp = topNode.getLinkedNode();

        for (int i = 0 ; i < stackLength - 1  ; i ++ ){

            String sn = temp.toString();
            output += sn   ;
            temp = temp.getLinkedNode();

        }

        return  output;

   }












}
