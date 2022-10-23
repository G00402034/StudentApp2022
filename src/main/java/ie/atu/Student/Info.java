package ie.atu.Student;

public class Info {
    private String Student_Name;
    private String Student_Email;
    private String Student_Course;

public Info()
{

}
    public Info(String Student_Name, String Student_Email,String Student_Course)
    {

        this.Student_Name = Student_Name;
        this.Student_Email = Student_Email;
        this.Student_Course = Student_Course;



    }




    public String getStudent_Name() {
        return Student_Name;
    }

    public void setStudent_Name(String student_Name) {
        Student_Name = student_Name;
    }

    public String getStudent_Email() {
        return Student_Email;
    }

    public void setStudent_Email(String student_Email) {
        Student_Email = student_Email;
    }

    public String getStudent_Course() {
        return Student_Course;
    }

    public void setStudent_Course(String student_Course) {
        Student_Course = student_Course;
    }
}
