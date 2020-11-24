package ListFiles;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;

public class List {


    ListNode head;
    ListNode tail;
    int listSize;
    boolean idSorted;
    boolean gradeSorted;
    BubbleSort sort;


    public List(ListNode head, ListNode tail , BubbleSort sort) {
        this.head = head;
        this.tail = tail;
    }

    public void setSort(BubbleSort sort) {
        this.sort = sort;
    }

    public ListNode getHead() {
        return head;
    }

    public void setHead(ListNode head) {
        this.head = head;
    }

    public ListNode getTail() {
        return tail;
    }

    public void setTail(ListNode tail) {
        this.tail = tail;
    }

    public boolean isIdSorted() {
        return idSorted;
    }

    public void append(ListNode ln){

        if (head == null){

            this.head = ln;
            this.tail = ln;

        }

        if (ln.getNextNode() == null){

            tail.setNextNode(ln);
            this.tail = ln;
            listSize ++ ;

        }

    }




    public ListNode addStudent(){

        String studentFN = null;

        Scanner sc = new Scanner(System.in);
        System.out.println("\n\nAdd a new Student:\n");

        System.out.println("Input student ID: ");
        int studentID = sc.nextInt();
        sc.nextLine();

        System.out.println("Input student First Name: ");
        studentFN = sc.nextLine();


        System.out.println("Input student Second Name: ");
        String studentSN = sc.nextLine();

        System.out.println("Input student Current Grade: ");
        double studentGrade = sc.nextDouble();

        Student student = new Student(studentID,studentFN,studentSN,studentGrade);
        ListNode newNode = new ListNode(student, null);
        append(newNode);

        return newNode;

    }


    public int getListSize() {
        return listSize;
    }

    public boolean isEmpty(){
        boolean isListEmpty;

        if (this.head == null && this.tail == null){
            isListEmpty = true;
        } else {isListEmpty = false;}

        return isListEmpty;
    }

    public boolean onlyOneItem(){
        boolean isThereOneItem ;

        if (this.head != null && this.head.getNextNode() == null){
            isThereOneItem = true ;

        } else {isThereOneItem = false;}

        return isThereOneItem;
    }



    @Override
    public String toString() {

        String output = null;
        ListNode temp ;

        if (this.head == null) {
            return ("\n");
        }

        String hn = head.toString();
        output = "\nNumber of items in List: " + this.listSize + "\n" + hn ;
        temp = head.getNextNode();


        for (int i = 0 ; i > this.listSize ; i ++ ){

            String sn = temp.toString();
            output += sn;
            temp = temp.getNextNode();

        }
        return  output;
    }

/*
    public int checkForDuplicates(ArrayList unavailable , int id, int addNum, int index ){


        int theoTotal = (addNum + listSize);


        for (index = 0 ; index < unavailable.size() ; index++){

            int check = (int) unavailable.get(index);

            if (id == check ){
                id = (int) Math.floor(Math.random() * theoTotal);


                checkForDuplicates(unavailable,id,addNum, 0);
                if (index == unavailable.size()){
                    return  id;
                }
            }





        }


        return theoTotal;
    }
*/


    public void populateList(int addNum){

        String[] firstName =   { "Adam", "Alex", "Aaron", "Ben", "Carl", "Dan", "David", "Edward", "Fred", "Frank", "George", "Hal", "Hank", "Ike", "John", "Jack", "Joe", "Larry", "Monte", "Matthew", "Mark", "Nathan", "Otto", "Paul", "Peter", "Roger", "Roger", "Steve", "Thomas", "Tim", "Ty", "Victor", "Walter","Matt","Mary","Mo","Susan","Sally"};
        String[] lastName =  { "Anderson", "Ashwoon", "Aikin", "Bateman", "Bongard", "Bowers", "Boyd", "Cannon", "Cast", "Deitz", "Dewalt", "Ebner", "Frick", "Hancock", "Haworth", "Hesch", "Hoffman", "Kassing", "Knutson", "Lawless", "Lawicki", "Mccord", "McCormack", "Miller", "Myers", "Nugent", "Ortiz", "Orwig", "Ory", "Paiser", "Pak", "Pettigrew", "Quinn", "Quizoz", "Ramachandran", "Resnick", "Sagar", "Schickowski", "Schiebel", "Sellon", "Severson", "Shaffer", "Solberg", "Soloman", "Sonderling", "Soukup", "Soulis", "Stahl", "Sweeney", "Tandy", "Trebil", "Trusela", "Trussel", "Turco", "Uddin", "Uflan", "Ulrich", "Upson", "Vader", "Vail", "Valente", "Van Zandt", "Vanderpoel", "Ventotla", "Vogal", "Wagle", "Wagner", "Wakefield", "Weinstein", "Weiss", "Woo", "Yang", "Yates", "Yocum", "Zeaser", "Zeller", "Ziegler", "Bauer", "Baxster", "Casal", "Cataldi", "Caswell", "Celedon", "Chambers", "Chapman", "Christensen", "Darnell", "Davidson", "Davis", "DeLorenzo", "Dinkins", "Doran", "Dugelman", "Dugan", "Duffman", "Eastman", "Ferro", "Ferry", "Fletcher", "Fietzer", "Hylan", "Hydinger", "Illingsworth", "Ingram", "Irwin", "Jagtap", "Jenson", "Johnson", "Johnsen", "Jones", "Jurgenson", "Kalleg", "Kaskel", "Keller", "Leisinger", "LePage", "Lewis", "Linde", "Lulloff", "Maki", "Martin", "McGinnis", "Mills", "Moody", "Moore", "Napier", "Nelson", "Norquist", "Nuttle", "Olson", "Ostrander", "Reamer", "Reardon", "Reyes", "Rice", "Ripka", "Roberts", "Rogers", "Root", "Sandstrom", "Sawyer", "Schlicht", "Schmitt", "Schwager", "Schutz", "Schuster", "Tapia", "Thompson", "Tiernan", "Tisler" };


        HashSet<Integer> unavailableIDs = new HashSet<Integer>();
        int data;
        ListNode tempNode = head;
        for(int steps = 0;steps < listSize; steps ++){
            data = tempNode.student.getStudentID();
            unavailableIDs.add(data);
            tempNode = tempNode.getNextNode();
        }


        for (int i = 0 ; i < addNum ; i ++ ){

            int idIndex = 0;
            int firstIndex;
            int secondIndex;
            double grade;
            String fName;
            String lName;
            //int itemToCheck;
           // int theoTotal = (addNum + listSize);
            //int[] check = new int[unavailableIDs.size()];

            //idIndex = (int) Math.floor(Math.random() * listSize);






            idIndex = (int) (Math.random() * listSize + 2);
            while (unavailableIDs.contains(idIndex)){
                idIndex = (int) (Math.random() * listSize + 2);
            }
            unavailableIDs.add(idIndex);







            firstIndex = (int) Math.floor(Math.random() * firstName.length);
            secondIndex = (int) Math.floor(Math.random() * lastName.length);


            fName = firstName[firstIndex];
            lName = lastName[secondIndex];

            grade = (Math.random() * 100);
            double roundOffGrade = (double) Math.round(grade * 100) / 100;

            Student tempStu = new Student(idIndex,fName,lName,roundOffGrade);
            ListNode tempNewNode = new ListNode(tempStu,null);

            append(tempNewNode);


        }


    }


}









