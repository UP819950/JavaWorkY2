public class testingEx4 {

    public static void main ( String[] args ){

        XNode[] nodes = new XNode[5];
        //XNode root = new XNode(0,null);

        nodes[0] = new XNode(1,null);
        nodes[1] = new XNode(2,nodes[0]);
        nodes[2] = new XNode(3,nodes[1]);
        nodes[3] = new XNode(4,nodes[2]);
        nodes[4] = new XNode(5,nodes[3]);
        nodes[0].setLinkedNode(nodes[4]);
/*
        System.out.println(nodes[0].getID());
        System.out.println(nodes[1].getID());
        System.out.println(nodes[2].getID());
        System.out.println(nodes[3].getID());
        System.out.println(nodes[4].getID());
*/
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
