package ex_16_Arrays;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab152_UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter ther size in integer only");

        int size = scanner.nextInt();

        int[] numbers = new int[size];

        // for (int i = 0; i < size; i++) {
        for (int i = 0; i<numbers.length; i++) {
            System.out.println("Enter the number");
            numbers[i] = scanner.nextInt();
        }
        System.out.println("------------------");

        for (int i = 0; i <numbers.length ; i++) {
            System.out.println(numbers[i]);
        }

    }

}
