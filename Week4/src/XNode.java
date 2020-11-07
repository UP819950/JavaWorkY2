public class XNode {

    private int nodeID;
    private XNode linkedNode;
    public XNode(int ID, XNode n){
        nodeID = ID;
        linkedNode = n;
    }
    public void setLinkedNode(XNode n){
        {
            if(n == null){
                throw new CustomException("node "+ nodeID + ": No Linked Node");
            }
            else{
                linkedNode = n;
            }
        }
    }
    public XNode getLinkedNode(){
        if(linkedNode == null){
            throw new CustomException("node "+ nodeID + ": No Linked Node");
        }
        else{
            return linkedNode;
        }
    }
    public int getID(){
        return nodeID;
    }
}
