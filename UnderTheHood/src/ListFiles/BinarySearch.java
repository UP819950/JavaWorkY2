package ListFiles;

public class BinarySearch {


    private List sortedList;

    public BinarySearch(List sortedList) {
        this.sortedList = sortedList;
    }


    public int getMid(int bottom, int top){
        int length = top - bottom;
        return (length/2) + bottom;
    }
    public ListNode seek(int midIndex){
        ListNode tempNode = sortedList.head;
        for(int steps = 0;steps < midIndex; steps ++){
            tempNode = tempNode.getNextNode();
        }
        return tempNode;
    }


    public ListNode bSearch(ListNode searchItem){

        ListNode tempNode = sortedList.head;

        if (sortedList.idSorted == false){
            System.out.println("Unable to search: List is not sorted.");
        } else if (sortedList.getListSize() <= 1){
            System.out.println("Unable to search: List too short.");
        }else {



            int midpoint = Math.round(sortedList.getListSize() / 2);
            boolean found = false;
            int bottomIndex = 0;
            int topIndex = (sortedList.getListSize() );

            while (!found) {
                //go to mid point
                tempNode = seek(midpoint);
                //check
                if (searchItem == tempNode) {
                    found = true;
                } else if (searchItem.student.getStudentID() >= tempNode.student.getStudentID()) {
                    bottomIndex = midpoint;
                    midpoint = getMid(bottomIndex, topIndex);
                } else {
                    //goDownward
                    bottomIndex = 0;
                    topIndex = midpoint;
                    midpoint = getMid(bottomIndex, topIndex);
                }
            }

        }
        return tempNode;
    }

}
