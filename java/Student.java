public class Student{ //quick refresher
    private String name;
    private double studentRecord;

    public Student(String name){ //constructor
        this(name, 0);
    }

    public Student(String name, double studentRecord){ //constructor, overloaded
        this.name = name;
        this.studentRecord = studentRecord;
    }
    
    public void setStudentRecord(double studentRecord) {
        this.studentRecord = studentRecord;
    }

    public String getName(){ //getters
        return this.name;
    }

    public double getStudentRecord(){
        return this.studentRecord;
    }

    public String toString(){ //geeft alles uit deze class terug
        return this.name + " Record: " + this.studentRecord;
    }
}