package ex_23_Wrapper_Class;

import java.sql.SQLOutput;

public class Lab202 {
    public static void main(String[] args) {

        int a = 10;
        Integer b = a;      // Boxing -int  to integer , Autoboxing

        System.out.println(Integer.MIN_VALUE);
        System.out.println(b.intValue());

        Integer a2 = 42;
        int v2 = a2;    // Unboxing
        System.out.println(v2);

    }
}