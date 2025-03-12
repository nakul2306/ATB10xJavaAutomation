package ex_24_Exceptions;

public class Lab216_EC {
    public static void main(String[] args) {
        try {
            String ip = args[0];  // java.lang.ArrayIndexOutOfBoundsException

            int a = Integer.parseInt(ip);  //java.lang.NumberFormatException.forInputString(
            int b = 100/a;   // ArithmeticException: / by zero
            System.out.println(b);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
