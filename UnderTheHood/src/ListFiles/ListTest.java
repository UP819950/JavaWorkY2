package ListFiles;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class ListTest {

    public  static void main (String[] args){

        BinarySearch s = new BinarySearch(null);
        BubbleSort b = new BubbleSort(null);
        List l = new List(null,null,b, s);
        l.setSort(b);
        l.setSearch(s);
        b.setList(l);
        s.setSortedList(l);


        BinarySearch bsForSortedL = new BinarySearch(l);

        /////////////////////////////DATA BUILDER/////////////////////////////////////////////////
        readCSV(l);
        //////////////////////////////////////////////////////////////////////////////////////////
        System.out.println(l.toString());
/*
        System.out.println("\nSorting By grade ------------------------");
        sortObjectForl.sortByGrade();
        System.out.println(l.toString());

        System.out.println("\nSorting By ID --------------------------");
        sortObjectForl.sortByID();
        System.out.println(l.toString());

        System.out.println("\n\n\nSearching for Student ID 765450:\n");
        ListNode foundNode = bsForSortedL.bSearch(765450);
        System.out.println(foundNode.student.toString());*/

        l.sort.sortByID();
        System.out.println(l.toString());

        System.out.println("\n\n\nSearching for Student ID 765450:\n");
        ListNode foundNode = l.search.bSearch(765450);
        System.out.println(foundNode.student.toString());

       // l.populateList(190);   // adds a random student with random data to the list use args to specify amount.
       // System.out.println(l.toString());

        // l.addStudent();  ---- to console input a new student.

    }
    public static void readCSV(List l){

        String line = "";
        String path = "C:\\Users\\up819\\Documents\\GitHub\\JavaWorkY2\\UnderTheHood\\src\\Data\\dataFile.csv";


        try {
            BufferedReader br = new BufferedReader( new FileReader(path));
            while ((line = br.readLine()) != null){
                String[] values = line.split(",");
                int ID = Integer.parseInt(values[0]);
                String fName = (values[1]);
                String sName = (values[2]);
                double grade = Double.parseDouble(values[3]);


                Student newStudent = new Student(ID,fName,sName,grade);
                ListNode ln1 = new ListNode(newStudent, null);
                l.append(ln1);


            }

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }

    }
}
