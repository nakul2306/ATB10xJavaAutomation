package ex_24_Exceptions;

public class Lab206_Checked {
    public static void main(String[] args) {
        System.out.println("1");

        try {
            int a= 10/0;
        } catch (Exception e) {
           //e.printStackTrace();
           System.out.println(e.getMessage());
            System.out.println("Own Massage!");
        }
        System.out.println("2");

    }
}
