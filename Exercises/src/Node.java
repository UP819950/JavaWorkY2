
public class Node {
    private int nodeID;
    private Node linkedNode;

    public Node(int ID, Node n){
        nodeID = ID;
        if(n!=null){linkedNode = n;}
    }

    public void setLinkedNode(Node n){
        if(n!=null){linkedNode = n;}
    }
    public Node getLinkedNode(){
        return linkedNode;
    }

    public int getID(){
        return nodeID;
    }
}
