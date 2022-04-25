package foundations;

public class Student
{
    private String studentName;
    private String studentNumber;

    public Student(String studentName, String studentNumber)
    {
        this.studentName = studentName;
        this.studentNumber = studentNumber;
    }
    //Again Create the copy constructor
    public Student(Student student)
    {
        this.studentNumber = student.studentNumber;
        this.studentName = student.studentName;

    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }
    public boolean equals(Student object)
    {
        return(this.studentNumber.equals(object.studentNumber) && this.studentName.equals(studentName));
    }
    @Override
    public String toString()
    {
        return "Student Information" + "\n" +
                "Student Name" + studentName+
                "Student Number" + studentNumber;
    }
}
