package ex_16_Arrays;


import java.lang.reflect.Array;
import java.util.Arrays;

public class Lab147 {
    public static void main(String[] args) {
        int [] marks = {91,65,89,90, 72};

        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);

        System.out.println("----------------------");

        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }

        Arrays.sort(marks); // Ascending order will be arranged

        System.out.println("----------------------");

        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }

    }
}
