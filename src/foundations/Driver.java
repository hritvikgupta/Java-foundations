package foundations;

public class Driver {
    public static void main(String[] args)
    {
        Subject subject1  = new Subject("TFLLNOKN",  "Java Programming");
        Student student1 = new Student("Hritvik Gupta", "18EGICS037");

        ExamPaper examPaper = new ExamPaper(student1,subject1, 100);
        System.out.println(examPaper);

    }
}
