public class week2Ex1and2and3and5 {

    public static void main (String[] args) {
        Node [] nodes = new Node[4];

        Node root = new Node(0,null);

        Node n1 = new Node(1,root);
        Node n2 = new Node(2,n1);
        Node n3 = new Node(3,n2);

        nodes[0] = root ;
        nodes[1] = n1 ;
        nodes[2] = n2 ;
        nodes[3] = n3 ;

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
