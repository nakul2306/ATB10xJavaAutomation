package ex_05_TypeCasting;

public class Lab061_typeCasting_Used {
    public static void main(String[] args) {

        // GST - 18.45

        int course = 100;
        float  GST = 18.45f;

       // int total_int2  = course+GST; // Narrow-Implicit

        int total_int  = course+(int)GST; // Narrow-Explicit

        float total = course+GST;  // widening - implicit

        float total2 =(float) course+GST;  // widening - Explicit

        System.out.println(total_int);
        System.out.println(total);

    }
}
