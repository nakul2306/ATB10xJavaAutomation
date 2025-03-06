package ex_21_Static;

public class Lab193_Static_P2 {
    public static void main(String[] args) {
        ATB umesh = new ATB( 1236547890, "Umesh");
        ATB anubha = new ATB( 1236547890, "Anubha");

        System.out.println(umesh.phone_np);
        System.out.println(anubha.name);
        System.out.println(ATB.course_name);
        ATB.m1();

    }
}



class ATB{
    static String course_name = "ATB";
    int phone_np;
    String name;

    public ATB(int phone_np, String name) {
        this.phone_np = phone_np;
        this.name = name;
    }
    void display(){
        System.out.println(this.phone_np + this.name + course_name);
    }

    static void m1(){
        System.out.println("Mark Attendance");
    }
}