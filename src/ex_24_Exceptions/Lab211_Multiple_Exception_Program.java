package ex_24_Exceptions;

public class Lab211_Multiple_Exception_Program {
    public static void main(String[] args) {
        int a = 0;
        int c = 0;

        try {
            int b = 10/a;
            String s1 = null;
            s1.trim();
        }

        catch (ArithmeticException | NullPointerException e){
            System.out.println(e.getMessage());
        }


//        //catch (Exception e) {
//            System.out.println(e.getMessage());
//      //  }

    }
}
