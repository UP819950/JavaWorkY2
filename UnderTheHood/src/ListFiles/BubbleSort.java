package ListFiles;


public class BubbleSort {


    private List list;

    public BubbleSort(List list) {
        this.list = list;
    }

    public void sortByID(){

        if (list.isEmpty() == true || list.onlyOneItem() == true ){return;}


        ListNode temp = list.getHead();
        ListNode tempNext = temp.getNextNode();


        do {
            if (temp.getStudent().getStudentID() > tempNext.getStudent().getStudentID()) {
                swap(temp,tempNext);
                sortByID();
            }
            temp = tempNext;
            tempNext = tempNext.getNextNode();

            if (temp.getNextNode() == null){
                list.tail = temp ;
            }



            } while ( tempNext != null);



        list.idSorted = true;



        return;

    }

    public void setList(List list) {
        this.list = list;
    }

    public void sortByGrade(){

        if (list.isEmpty() == true || list.onlyOneItem() == true ){return;}


        ListNode temp = list.getHead();
        ListNode tempNext = temp.getNextNode();


        do {
            if (temp.getStudent().getCurrentGrade() < tempNext.getStudent().getCurrentGrade()) {
                swap(temp,tempNext);
                sortByGrade();
            }
            temp = tempNext;
            tempNext = tempNext.getNextNode();

            if (temp.getNextNode() == null){
                list.tail = temp ;
            }



        } while ( tempNext != null);



        list.gradeSorted = true;


        return;

    }


    public ListNode getPreviousNode(ListNode tempNode){

        if (tempNode == list.head){
            return null;
        }

        ListNode temp = list.getHead();
        ListNode previousNode = list.head;

        for (int i = 0 ; i < list.getListSize() ; i ++){
            if (tempNode == temp.getNextNode()){
                previousNode = temp;
            }

            temp = temp.getNextNode();

        }

        return previousNode;

    }



    public void swap(ListNode tempNode, ListNode nextNode){

        ListNode nextNextnode = nextNode.getNextNode();
        ListNode previousNode = getPreviousNode(tempNode);

        if (tempNode == list.head){
            tempNode.setNextNode(nextNextnode);
            nextNode.setNextNode(tempNode);
            list.head = nextNode;

        } else {
            tempNode.setNextNode(nextNextnode);
            nextNode.setNextNode(tempNode);
            previousNode.setNextNode(nextNode);

        }

    }


}
