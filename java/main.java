import java.awt.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        //nou, wacht eens ff. volgens mij denk ik te moeilijk na hierover :thonk:

        //event 1: kan records per student toevoegen dmv methode
        EventThingy event1 = new EventThingy("event1");

        event1.addStudent(new Student("Raiden")); 
        event1.addStudent(new Student("Vergil"));
        event1.addStudent(new Student("Dante"));
        event1.addStudent(new Student("Leon"));
        event1.addStudent(new Student("Phoenix")); 

        event1.addStudentRecord("Raiden", 32.1);
        event1.addStudentRecord("Vergil", 20.2);
        event1.addStudentRecord("Dante", 15.3);
        event1.addStudentRecord("Leon", 29.4);
        event1.addStudentRecord("Phoenix", 11.5);
        
        System.out.println(event1);

        Student brecord = event1.bestRecord(); //doet per event kijken nog hmmmmmmmmmmmmmmmmmmm
        System.out.println("> Student w/ best record for " + event1.getEventName() + " is: " + brecord);

        System.out.println(" ");
        System.out.println("*-*-*"); //for teh lulz
        System.out.println(" ");

        //event 2: kan records toevoegen door deze mee te geven tijdens aanmaken obj 

        EventThingy event2 = new EventThingy("event2");

        event2.addStudent(new Student("Raiden", 16.1));
        event2.addStudent(new Student("Vergil", 32.2));
        event2.addStudent(new Student("Dante", 64.3));
        event2.addStudent(new Student("Leon", 128.4));
        event2.addStudent(new Student("Phoenix", 256.5));

        System.out.println(event2);

        Student bsrecord = event2.bestRecord();
        System.out.println("> Student w/ best record for " + event2.getEventName() + " is: " + bsrecord);
        
//      ArrayList<Student> students = new ArrayList<>();
//        for(Student s : students ){
//            System.out.println(s); //uitprinten
//        }
//
//        
//      Student s1 = new Student("Raiden", 25);
//      Student s2 = new Student("Hal");
//      System.out.println(s1);
//      System.out.println(s2);
    }
}