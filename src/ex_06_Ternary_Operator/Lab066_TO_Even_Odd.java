package ex_06_Ternary_Operator;

public class Lab066_TO_Even_Odd {
    public static void main(String[] args) {

        int num = 11;
        // int num = 10;

        String result = (num%2==0) ? "Even": "odd" ;
        System.out.println(result);
    }
}
