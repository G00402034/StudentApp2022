package ie.atu;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        System.out.println("please enter student name");
        Scanner input = new Scanner(System.in);
        String Student_Name = input.next();
        System.out.println("You entered :" + Student_Name );

        System.out.println("please enter student email");
        String Student_Email = input.next();
        System.out.println("You entered :" + Student_Email );

        System.out.println("please enter your course title");
        String Student_Course = input.next();
        System.out.println("You entered :" + Student_Course );


    }
    }
