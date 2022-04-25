package foundations;

public class Subject
{
    private String subjectCode;
    private String subjectName;

    public Subject(String subjectCode, String subjectName)
    {
        this.subjectCode = subjectCode;
        this.subjectName = subjectName;

    }
    //Create the copy constructor
    public Subject(Subject subject)
    {
        this.subjectCode = subject.subjectCode;
        this.subjectName = subject.subjectName;

    }
    //Getter and setter to get the value and to update the existing values
    public String getSubjectCode() {
        return subjectCode;
    }

    public void setSubjectCode(String subjectCode) {
        this.subjectCode = subjectCode;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    //match the values of  the copy constructor to that of the original one
    public boolean equals(Subject object)
    {
        if(this.subjectName.equals(object.subjectName) && this.subjectCode.equals(object.subjectCode)){
            return true;
        }
        else
        {
            return false;
        }

    }

    @Override
    public String toString()
    {
        return "Subject Name" + subjectName + "\n"+
                "Subject Code" + subjectCode;
    }



}
