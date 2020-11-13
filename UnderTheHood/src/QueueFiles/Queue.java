package QueueFiles;

public class Queue {

    QueueNode frontNode;
    QueueNode backNode;
    int queueLength;

    public Queue(QueueNode frontNode, QueueNode backNode) {
        this.frontNode = frontNode;
        this.backNode = backNode;
    }

    public void enqueue(QueueNode newQueuer) {

        if (frontNode == null && backNode == null) {

            frontNode = newQueuer;
            backNode = newQueuer;
            this.queueLength += 1;

        } else {

            this.backNode.setBackLink(newQueuer);

            newQueuer.setLinkedNode(this.backNode);
            this.backNode = newQueuer;

            this.queueLength += 1;

        }
    }

    public void autoQueue(){
        int autoId = backNode.getID() + 1 ;
        QueueNode autoNode = new QueueNode(autoId,this.backNode,null);

        this.backNode.setBackLink(autoNode);

        this.backNode = autoNode;
        this.queueLength += 1;
    }




    public void deQueue() {

        QueueNode tempFront = frontNode.getBackLinkNode();
        frontNode = null;
        frontNode = tempFront;
        this.queueLength -= 1;
    }

    public int getQueueLength() {
        return queueLength;
    }

    public QueueNode getFrontNode() {
        return frontNode;
    }

    public QueueNode getBackNode() {
        return backNode;
    }

    @Override
    public String toString() {


        String output = null;
        String fn = frontNode.toString();
        output = "\nNumber of Nodes in Queue: " + this.queueLength + " Nodes in Queue: \n" + fn;


        for (int i = 0; i < 0; i++) {

            QueueNode temp = frontNode.getBackLinkNode();
            String sn = temp.toString();
            output += sn + "\n";
            temp = temp.getBackLinkNode();

        }

        return output;


    }
}
