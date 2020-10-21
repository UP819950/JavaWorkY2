public class week2Ex6 {
    public static void main (String[] args) {
        Node [] nodes = new Node[4];

        Node root = new Node(0,null);
        Node n1 = new Node(1,root);
        Node n2 = new Node(2,n1);
        Node n3 = new Node(3,n2);

        nodes[0] = null ;
        nodes[1] = n1 ;
        nodes[2] = n2 ;
        nodes[3] = n3 ;



        nodes[0] = nodes[1];
        nodes[1] = nodes[2];
        nodes[2] = nodes[3];
        nodes[3] = null;

        n1.setLinkedNode(n2);
        n2.setLinkedNode(n1);
        n3.setLinkedNode(root);








        for (Node n: nodes) {

            if (n == null ) {
                System.out.println("Current Node: null" +
                        " - Linked Node: null " );

            }
            else if(n.getLinkedNode() == null){
                System.out.println("Current Node: " + n.getID() +
                        " - Linked Node: null" );

            }
            else {
                System.out.println("Current Node: " + n.getID() + " - Linked Node:" +
                        " " + n.getLinkedNode().getID());
            }
        }

    }
}
