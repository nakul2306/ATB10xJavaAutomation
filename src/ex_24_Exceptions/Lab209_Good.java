package ex_24_Exceptions;

public class Lab209_Good {
    public static void main(String[] args) {
        int c= 0;
        int b= 0;

        try {
            int d= 10/c;
        }
        catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        System.out.println(b);

    }
}
