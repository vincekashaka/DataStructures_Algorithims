package OPP.ClassesObjectsConstructorsKeywords;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // store 5 roll nos
        int[] numbers = new int[5];

        // store 5 names
        String[] names = new String[5];

        //data of 5 students: { roll no, name, marks}
        int[] rno = new int[5];
        String[] name = new String[5];
        float[] marks = new float[5];

        Student[] students = new Student[5];


        Student vincent = new Student();

//        vincent.rno = 14;
//        vincent.name = "Vincent Kashaka";
//        vincent.marks = 67.7f;
//        vincent.changeName("Vince Kayz");
//        vincent.greeting();
//
//
//        System.out.println(vincent.rno);
//        System.out.println(vincent.name);
//        System.out.println(vincent.marks);

        Student random = new Student(vincent);

        Student random2 = new Student();
        System.out.println(random2.name);
//        System.out.println(random.name);

    }
}
    // create a class
// data type of every student
    class Student {
        int rno ;
        String name ;
        float marks = 90;
        // we need a way to add the values of the above
        // properties object by object

        // we need one word to access every object
        void changeName(String newName){
            this.name = newName;
        }

        void greeting(){
            System.out.println("hello my name is " + this.name);
        }
        Student (Student other){
            this.rno = other.rno;
            this.name = other.name;
            this.marks = other.marks;
        }
        Student () {
            // this is how you call a constructor from another constructor
            this(12, "default person", 19.0f);
        }
        //Student vince = new Student(17, "vince", 77.8f);
        // here, this will be replaced with vince
        Student (int rno, String name, float marks) {
            this.rno = rno;
            this.name = name;
            this.marks = marks;
        }
    }

