package ex_24_Exceptions;

public class Lab205 {
    public static void main(String[] args) {

        int a=10;
        int b=0;

        int c= a/b;

        System.out.println(c);

        //java.lang.ArithmeticException


        String name = null;
        name.trim();  // trim will remove trailing spaces
        //  java.lang.NullPointerException

        // Unchecked Exception: - ArithmeticException, NullPointerException
        // JVM does not know about it

    }
}
