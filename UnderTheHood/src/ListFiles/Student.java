package ListFiles;

public class Student {

    private int studentID;
    private String firstName;
    private String lastName;
    private double currentGrade;

    public Student(int studentID, String firstName, String lastName, double currentGrade) {
        this.studentID = studentID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.currentGrade = currentGrade;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getCurrentGrade() {
        return currentGrade;
    }

    public void setCurrentGrade(double currentGrade) {
        this.currentGrade = currentGrade;
    }

    @Override
    public String toString() {
        return
                "ID: " + studentID + " \n" +
                "First Name: " + firstName + " \n" +
                "Last Name: " + lastName + " \n" +
                "Current Grade: " + currentGrade+"\n\n";
    }
}
