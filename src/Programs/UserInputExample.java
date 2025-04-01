package Programs;

import java.util.Scanner;

public class UserInputExample {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // String User Input
        System.out.println("Enter a Name ");
        String name = scan.nextLine();
        System.out.println("my name is " + name);
        // Integer User Input
        System.out.println("Enter a age");
        int age = scan.nextInt();
        System.out.println("My age is " + age);
        scan.close();
    }
}
