package lab9.singletonpattern.singletonexample;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {

        Student student1 = new Student("Dung",1);
        Student student2 = new Student("Tuyen",2);
        Student student3 = new Student("Hai",3);
        Student student4 = new Student("Duc",4);
        Student student5 = new Student("Luffy",5);

        StudentManager studentManager = StudentManager.getInstance();

        studentManager.addStudent(student1);
        studentManager.addStudent(student2);
        studentManager.addStudent(student3);
        studentManager.addStudent(student4);


        System.out.println(studentManager.getStudents());
        System.out.println(studentManager);

        StudentManager s2 = StudentManager.getInstance();
        s2.addStudent(student5);


        System.out.println(s2);


    }
}
