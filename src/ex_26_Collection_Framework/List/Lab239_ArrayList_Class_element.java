package ex_26_Collection_Framework.List;

import java.util.ArrayList;
import java.util.List;

public class Lab239_ArrayList_Class_element {
    public static void main(String[] args) {
        Student s1 = new Student("Amit", "1");
        Student s2 = new Student("Ritwik", "2");
        Student s3 = new Student("Pramod","3");


        List<Student> myStudent = new ArrayList();
        myStudent.add(s1);
        myStudent.add(s2);
        myStudent.add(s3);

        System.out.println(myStudent);

        s1.printDetail();
        s2.printDetail();
        s3.printDetail();

    }
}
