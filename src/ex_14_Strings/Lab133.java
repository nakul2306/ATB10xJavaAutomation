package ex_14_Strings;

import java.sql.SQLOutput;

public class Lab133 {
    public static void main(String[] args) {
        String s1 ="Hello";
        s1.concat("World");
        System.out.println(s1);

        s1 = s1.concat("World");
        System.out.println(s1);

    }
}
