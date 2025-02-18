package ex_16_Arrays;

import java.util.Arrays;

public class Lab151_InterviewQ {
    public static void main(String[] args) {
        // Find second largest number

        int [] numbers = {12, 34, 10, 1};
        Arrays.sort(numbers);
        System.out.println(numbers[numbers.length-2]);

    }
}
