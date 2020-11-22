package ListFiles;

public class ListNode {


    Student student;
    private ListNode nextNode;

    public ListNode(Student student, ListNode nextNode) {
        this.student = student;
        this.nextNode = nextNode;
    }


    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public ListNode getNextNode() {
        return nextNode;
    }

    public void setNextNode(ListNode nextNode) {
        this.nextNode = nextNode;
    }

    @Override
    public String toString() {
        return "\nStudent: " + " \n" +
                student.toString() + " \n" +
                "nextNode: " + nextNode;
    }
}
