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


        System.out.println("please enter student email");
        String Student_Email = input.next();
        Student.setStudent_Email(Student_Email);


        System.out.println("please enter a course title");
        String Student_Course = input.next();
        Student.setStudent_Course(Student_Course);



        //Created second instance of Info
        Info Student2 = new Info();
        System.out.println("please enter a second student name");
        String Student_Name2 = input.next();
        Student2.setStudent_Name(Student_Name2);


        System.out.println("please enter a second student email");
        String Student_Email2 = input.next();
        Student2.setStudent_Email(Student_Email2);


        System.out.println("please enter a second course title");
        String Student_Course2 = input.next();
        Student2.setStudent_Course(Student_Course2);


        //Created third instance of Info
        Info Student3 = new Info();
        System.out.println("please enter a third student name");
        String Student_Name3 = input.next();

        System.out.println("please enter a third student email");
        String Student_Email3 = input.next();

        System.out.println("please enter a third course title");
        String Student_Course3 = input.next();


        //Created contructor to store Student 3
        Info Student4 = new Info(Student_Name3,Student_Email3,Student_Course3);
        System.out.println("\nYou entered for first name :" + Student.getStudent_Name() );
        System.out.println("You entered for first Email:" + Student.getStudent_Email() );
        System.out.println("You entered for first course title:" + Student.getStudent_Course() );
        System.out.println("\nYou entered for second name:" + Student2.getStudent_Name() );
        System.out.println("You entered for second Email:" + Student2.getStudent_Email() );
        System.out.println("You entered for second course title:" + Student2.getStudent_Course() );
        System.out.println("\nYou entered for third name:" + Student4.getStudent_Name() );
        System.out.println("You entered for third Email:" + Student4.getStudent_Email() );
        System.out.println("You entered for third course title:" + Student4.getStudent_Course() );








    }
    }
