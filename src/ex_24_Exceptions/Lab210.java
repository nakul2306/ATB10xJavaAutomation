package ex_24_Exceptions;

public class Lab210 {
    public static void main(String[] args) {
        int c= 0;
        int b= 0;

        try {
            int d= 10/c;
        }
        catch (Exception e) {      // Use when we are not sure which exception will come
            System.out.println(e.getMessage());
        }

        System.out.println(b);

    }
}
