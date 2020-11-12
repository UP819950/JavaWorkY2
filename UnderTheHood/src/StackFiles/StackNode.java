package StackFiles;

public class StackNode {

    private int ID;
    private StackNode linkedNode;

    public StackNode(int ID, StackNode linkedNode) {
        this.ID = ID;
        this.linkedNode = linkedNode;
    }


    public StackNode getLinkedNode() {
        return linkedNode;
    }

    public void setLinkedNode(StackNode linkedNode) {
        this.linkedNode = linkedNode;
    }

    public int getID() {
        return ID;
    }


    @Override
    public String toString() {
        return "\nStackNode: " +
                "ID: " + ID +
                ", linkedNode: " + linkedNode;
    }
}
