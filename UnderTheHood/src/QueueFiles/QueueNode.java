package QueueFiles;

public class QueueNode {

    private int ID;
    private QueueNode linkedNode;
    private QueueNode backLink;


    public QueueNode(int ID, QueueNode linkedNode, QueueNode backLink) {
        this.ID = ID;
        this.linkedNode = linkedNode;
        this.backLink = backLink;

    }

    public int getID() {
        return ID;
    }

    public QueueNode getLinkedNode() {
        return linkedNode;
    }

    public void setLinkedNode(QueueNode linkedNode) {
        this.linkedNode = linkedNode;
    }

    public QueueNode getBackLinkNode() {
        return backLink;
    }

    public void setBackLink(QueueNode backLink) {
        this.backLink = backLink;
    }

    @Override
    public String toString() {
        return "\nQueueNode " +
                "ID: " + ID +
                ", linkedNode: " + backLink;
    }
}
