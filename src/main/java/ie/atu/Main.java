package ie.atu;
import ie.atu.Student.Info;

import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        //Created first instance of Info
        System.out.println("please enter student name");
        Scanner input = new Scanner(System.in);
        String Student_Name = input.next();
        Info Student = new Info();
        Student.setStudent_Name(Student_Name);
        System.out.println("You entered :" + Student.getStudent_Name() );

        System.out.println("please enter student email");
        String Student_Email = input.next();
        Student.setStudent_Email(Student_Email);
        System.out.println("You entered :" + Student.getStudent_Email() );

        System.out.println("please enter a course title");
        String Student_Course = input.next();
        Student.setStudent_Course(Student_Course);
        System.out.println("You entered :" + Student.getStudent_Course() );


        //Created second instance of Info
        Info Student2 = new Info();
        System.out.println("please enter  a second student name");
        String Student_Name2 = input.next();
        Student2.setStudent_Name(Student_Name2);
        System.out.println("You entered :" + Student2.getStudent_Name() );

        System.out.println("please enter a second student email");
        String Student_Email2 = input.next();
        Student2.setStudent_Email(Student_Email2);
        System.out.println("You entered :" + Student2.getStudent_Email() );

        System.out.println("please enter a second course title");
        String Student_Course2 = input.next();
        Student2.setStudent_Course(Student_Course2);
        System.out.println("You entered :" + Student2.getStudent_Course() );

        Info Student3 = new Info(Student,Student2);
        System.out.println("You entered :" + Student3.getStudent_Name() );
        System.out.println("You entered :" + Student3.getStudent_Email() );
        System.out.println("You entered :" + Student3.getStudent_Email() );






    }
    }
