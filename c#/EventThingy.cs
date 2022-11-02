using System;
using System.Collections;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace HwDingetje
{
	class Program
    {
        static void Main(string[] args)
        {
            //ik heb dit nooit afgemaakt hahaha. tiis oud.
            
            //okay en nu dit vetlrane vna java naar c#

            //event 1:
            SportEvent event1 = new SportEvent("idk");

            event1.AddStudents(new Student("Raiden")); //en we hebben opeens een metal gear thema
            event1.AddStudents(new Student("Vergil"));
            event1.AddStudents(new Student("Dante"));
            event1.AddStudents(new Student("Leon"));
            event1.AddStudents(new Student("Phoenix")); //best boi

            event1.AddSRecord("Raiden", 32.1);
            event1.AddSRecord("Vergil", 20.2);
            event1.AddSRecord("Dante", 15.3);
            event1.AddSRecord("Leon", 29.4);
            event1.AddSRecord("Phoenix", 11.5);

            //Console.WriteLine(event1.info()); //uhh dis is kinda broken atm ahahajkhdfsd

            //event 2:

            SportEvent event2 = new SportEvent("idk");

            event2.AddStudents(new Student("Raiden", 16.1));
            event2.AddStudents(new Student("Vergil", 32.2));
            event2.AddStudents(new Student("Dante", 64.3));
            event2.AddStudents(new Student("Leon", 128.4));
            event2.AddStudents(new Student("Phoenix", 256.5)); //still best boi

            //Console.WriteLine(event2.info());

            Student s1 = new Student("Raiden", 256.5); //test
            Student s2 = new Student("Hal", 0.5); //test
            Console.WriteLine(s1.info()); //test
            Console.WriteLine(s2.info());
            
            Console.ReadKey();
        }

        class Student
        {
            public string name;
            public double sRecord;

            public Student(string name)
            {
                this.name = name;
            }

            public Student(string name, double sRecord) //overloading ahoyy
            {
                this.name = name;
                this.sRecord = sRecord;
            }

            public string info()
            {
                return this.name + " Record: " + this.sRecord;
            }
        }

        class SportEvent
        {
            public string eventName; 
            public List<Student> student;
            public double sRecord; //voor de records :p

            public SportEvent(string eventName) //waarom is dit ding eigenlijk rood... OH HET WAS EEN BREAKPOINT NVM derp
            {
                this.eventName = eventName;
                this.student = new List<Student>();
            }

            public void AddStudents(Student students)
            {
                this.student.Add(students); //studenten toevoegen aan list
            }

            public void AddSRecord(string sname, double rec)
            {
                this.sRecord = rec;

                for (int i = 0; i < student.Count; i++) //loop door list, kijkt of dingetje matcht
                {
                    if (student[i].Equals(sname))
                    {
                        student[i].sRecord = rec; //en dan record toevoegen of updaten of whateves
                    }
                }
            }

            /*public string info()
            {
                foreach(var students in student){
                    Console.WriteLine(students);
                }
                
                //return string.Join("\n", (object[])student.ToArray()); //there was an attempt lmao
            }*/
        }
	}
}