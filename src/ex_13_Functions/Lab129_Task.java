package ex_13_Functions;

import java.util.Scanner;

public class Lab129_Task {
    public static void main(String[] args) {
        // Create a function of sub, Sum, MUl and Div, modulus
        // With parameter a, b ( Take a parameter from the user)

        // Step 1 : Input output declaration
        // a & b is int  input
        // variable output is also int

        // step 2 rough Logic
        // Create function
        // Function -- type $ with return and with argument type

        // Step 3 : Write the code and fix edge cases

        Scanner scanner = new Scanner(System.in);
        System.out.println(" Enter a num1");
        int a = scanner.nextInt();
        System.out.println("Enter a num2");
        int b = scanner.nextInt();

        int result_sum = sum(a, b);
        int result_sub = sub(a, b);
        int result_mul = mul(a, b);
        int result_div = div(a, b);
        int result_mod = modulus(a, b);

        System.out.println(result_sum);
        System.out.println(result_sub);
        System.out.println(result_mul);
        System.out.println(result_div);
        System.out.println(result_mod);


    }

        static int sum(int a, int b) {
            return a+b;
        }

        static int sub(int a, int b) {
            return a-b;
        }


        static int mul(int a, int b) {
            return a*b;
        }

        static int div(int a, int b) {
            return a/b;
        }

        static int modulus(int a, int b) {
            return a%b;
        }

        // Edge cases : Big number -- Use BigIntegerClass
       //2. String input user enter


    }


