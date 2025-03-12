package ex_24_Exceptions;

public class Lab214 {
    public static void main(String[] args) {
        System.out.println("Start The program");
        try {
            String ip = args[0];  // java.lang.ArrayIndexOutOfBoundsException
            int a = Integer.parseInt(ip);  //java.lang.NumberFormatException.forInputString(
            int b = 100 / a;   // ArithmeticException: / by zero
            System.out.println(b);
        } catch (NumberFormatException | ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}
