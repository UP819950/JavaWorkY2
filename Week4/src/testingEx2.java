public class testingEx2 {


    public static void main ( String[] args ){

        XNode[] nodes = new XNode[3];
        XNode root = new XNode(0,null);

        nodes[0] = new XNode(1,root);
        nodes[1] = new XNode(2,nodes[0]);
        nodes[2] = new XNode(3,nodes[1]);
        nodes[0] = nodes[2];
        nodes[1] = root;

        for (XNode n: nodes) {
            try {

                System.out.println("Node: " + n.getID() + " - Linked Node: " +
                        n.getLinkedNode().getID());

            } catch (CustomException ce) {
                System.out.println(ce.getMessage());
            }
        }

    }
}
