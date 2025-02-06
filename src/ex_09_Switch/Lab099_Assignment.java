package ex_09_Switch;

import java.util.Scanner;

public class Lab099_Assignment {
    public static void main(String[] args) {

        // Take user input --- name , age, Salary and print them in the end

        // create a scanner object fir reading input
        Scanner scanner = new Scanner (System.in);

        // Prompt the user for there name
        System.out.println("Enter a name ");
        String name = scanner.next();


        System.out.println("Enter a age ");
        int  age = scanner.nextInt();

        System.out.println("Enter a salary ");
        double  sal  = scanner.nextDouble();

        System.out.println(name);
        System.out.println(age);
        System.out.println(sal);



    }
}
