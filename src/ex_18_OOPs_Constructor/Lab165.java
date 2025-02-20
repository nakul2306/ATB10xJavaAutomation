package ex_18_OOPs_Constructor;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab165 {
    public static void main(String[] args) {
       ///  Scanner sc = new Scanner(System.in);   User input can be taken
        Car2 tesla = new Car2();

        System.out.println(tesla.model);
        System.out.println(tesla.year);

        System.out.println("-----------------------------------");

        Car2 tesla2 = new Car2("tesla2", 2025);

        System.out.println(tesla2.model);
        System.out.println(tesla2.year);

        System.out.println("---------------------");
        Car2 nano = new Car2("nano", 2024);

        System.out.println(nano.model);
        System.out.println(nano.year);

    }
}
