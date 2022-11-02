import java.awt.*;
import java.util.ArrayList;

public class EventThingy{
    private String eventName;
    private double sRecord;
    private ArrayList<Student> students; //arraylist met studenten die meedoen

    public EventThingy(String eventName){
        this.eventName = eventName;
        this.students = new ArrayList<>();
    }

    public String getEventName(){ //getters
        return this.eventName;
    }

    public void addStudent(Student student){
        students.add(student); //voegt studenten toe aan arraylist
    }

    public void addStudentRecord(String sName, double records){
        this.sRecord = records;

        for(int i = 0; i < students.size(); i++){ //whee for loop
            if(students.get(i).getName().equals(sName)){ //lopot foor list n kwjkt of naam matchet me t studnet naam.
                students.get(i).setStudentRecord(records); //dna udpate ie de record
            }
        }
    }

    public Student bestRecord(){ 

        Student bestRecord = students.get(0); //referentiedingpunt

        for(Student s: students){
            if(s.getStudentRecord() > bestRecord.getStudentRecord()){ //kijkt f record hoger/btr is dna ref en cpoypsta dat erin ald dat do is
                bestRecord = s;
            }
        }

        return bestRecord;
    }

    public String toString(){
        String sName = ""; //init

        for(Student s: students){
            sName += " " + s.getName() + " Record: " + s.getStudentRecord() + "\n"; //loopt door lijst, haalt alle studenten op
        }

        return sName;
    }
}