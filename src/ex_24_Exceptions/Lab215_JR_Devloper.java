package ex_24_Exceptions;

public class Lab215_JR_Devloper {
    public static void main(String[] args) {
        String ip = null;  // java.lang.ArrayIndexOutOfBoundsException
        try {
            ip = args[0];
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        int a = 0;  //java.lang.NumberFormatException.forInputString(
        try {
            a = Integer.parseInt(ip);
        } catch (NumberFormatException e) {
            System.out.println(e.getMessage());
        }
        try {
            int b = 100/a;   // ArithmeticException: / by zero
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }

}
