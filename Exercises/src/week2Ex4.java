public class week2Ex4 {
    public static void main (String[] args) {
        Node [] nodes = new Node[3];

        Node root = new Node(0,null);

        Node n1 = new Node(0,root);
        Node n2 = new Node(1,root);
        Node n3 = new Node(2,root);


        nodes[0] = n1 ;
        nodes[1] = n2 ;
        nodes[2] = n3 ;

        /*
        nodes[0] = nodes[2] ;
        nodes[2] = nodes[1] ;

        */


        nodes[0] = nodes[1] ;
        nodes[1] = nodes[2] ;
        nodes[0] = nodes[1] ;

        for (Node n: nodes) {
            System.out.println("Current Node: " + n.getID() + " - Linked Node:" +
                    " " + n.getLinkedNode().getID());

        }

    }
}
