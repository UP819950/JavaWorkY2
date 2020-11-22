package ListFiles;
import java.util.Scanner;

public class ListTest {

    public  static void main (String[] args){


        /////////////////////////////DATA BUILDER/////////////////////////////////////////////////
        List l = new List(null, null);
        BubbleSort sortObjectForl = new BubbleSort(l);
        BinarySearch bsForSortedL = new BinarySearch(l);

        Student st1 = new Student(1, "John", "Smith", 45.6);
        Student st2 = new Student(2, "Matt", "Jones", 65.6);
        Student st3 = new Student(3, "Andy", "Carr", 32.6);
        Student st4 = new Student(4, "Paul", "Fletcher", 76.6);
        Student st5 = new Student(5, "Oliver", "Sampson", 11.9);
        Student st6 = new Student(6, "Jack", "Collins", 57.8);
        Student st7 = new Student(7, "James", "Archer", 23.6);
        Student st8 = new Student(8, "Adam", "Mahon", 24.2);
        Student st9 = new Student(9, "Pete", "Ball", 14.2);

        ListNode ln1 = new ListNode(st1, null);
        ListNode ln2 = new ListNode(st2, null);
        ListNode ln3 = new ListNode(st3, null);
        ListNode ln4 = new ListNode(st4, null);
        ListNode ln5 = new ListNode(st5, null);
        ListNode ln6 = new ListNode(st6, null);
        ListNode ln7 = new ListNode(st7, null);
        ListNode ln8 = new ListNode(st8, null);
        ListNode ln9 = new ListNode(st9, null);

        l.append(ln1);
        l.append(ln2);
        l.append(ln3);
        l.append(ln4);
        l.append(ln5);
        l.append(ln6);
        l.append(ln7);
        l.append(ln8);
        l.append(ln9);
        ////////////////////////////////////////////////////////////////////////////////////////////

/*
        System.out.println(l.toString());
        sortObjectForl.sortByID();
        System.out.println(l.toString());




        System.out.println("\n\n\nSearching for List Node 2 , student 89:\n");
        ListNode foundNode = bsForSortedL.bSearch(ln2);
        System.out.println(foundNode.student.toString());

        System.out.println("\n\n\nSearching for List Node 4 , student 12:\n");
        foundNode = bsForSortedL.bSearch(ln4);
        System.out.println(foundNode.student.toString());
*/


        //l.addStudent();

        l.populateList(20);

        System.out.println(l.toString());

        sortObjectForl.sortByID();
        System.out.println(l.toString());


















    }
}
