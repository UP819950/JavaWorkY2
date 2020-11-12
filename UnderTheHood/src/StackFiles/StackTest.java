package StackFiles;

public class StackTest {

    public static void main (String[] args){

        StackNode sn1 = new StackNode(1,null);
        StackNode sn2 = new StackNode(2,null);
        StackNode sn3 = new StackNode(3,null);



        Stack st = new Stack( sn1, sn1);

        st.push(sn2);
        st.push(sn3);
        st.pop();



        System.out.println(sn1.toString());






    }



}
