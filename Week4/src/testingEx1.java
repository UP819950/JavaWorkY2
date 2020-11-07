public class testingEx1 {

    public static void main ( String[] args ){

        XNode root = new XNode(1,null);

        System.out.println(root.getID());

        try{

            System.out.println(root.getLinkedNode());


        }
        catch(CustomException ce) {
            System.out.println(ce.getMessage());
        }


    }



}
