package ex_21_Static;

public class Lab192_Static {
    public static void main(String[] args) {

        // Student s1 = new Student(23);
        // Student s2 = new Student(25);
        // System.out.println(s1.age);
        // System.out.println(s2.age);

        System.out.println(Student.course_name);
        Student.m1();

    }

}

class Student{
    int age;  // Non static
    static String course_name = "ATB";   // class loader level

    public Student(int age) {
        this.age = age;
    }

    static void m1(){
        System.out.println("I am static method");
    }
}
