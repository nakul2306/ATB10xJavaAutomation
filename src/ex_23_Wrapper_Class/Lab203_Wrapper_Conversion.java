package ex_23_Wrapper_Class;

public class Lab203_Wrapper_Conversion {
    public static void main(String[] args) {
        String num = "10";

        Integer a = Integer.parseInt(num);  // String to Wrapper Conversion

        int a3 = Integer.parseInt(num);   // String to Primitive

        Integer aa= Integer.valueOf("10");
        System.out.println(aa);

    }

}
