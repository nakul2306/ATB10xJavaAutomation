package ex_26_Collection_Framework.List;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab234_ArrayList_Input {
    public static void main(String[] args) {
        // Multiple user from the user and share them in seprate
        //Array List based on user defined categories
        //names, ages - Store them

        Scanner scanner= new Scanner(System.in);

        ArrayList<String> names = new ArrayList<>();
        ArrayList<Integer> ages  = new ArrayList<>();

        String continueInput = "Y"; //Control variable for input loop

        while(continueInput.equalsIgnoreCase("Y")){

            System.out.println("Enter Name: ");
            String name = scanner.nextLine();
            names.add(name);


            System.out.println("Enter age: ");
            int age= scanner.nextInt();
            ages.add(age);

            scanner.nextLine();
            System.out.println("Do you want to enter another record? (Y/N): ");
            continueInput = scanner.nextLine();

        }

        for (Object o1: names){
            System.out.println(o1);
        }

        for (Object o2: ages){
            System.out.println(o2);
        }
        scanner.close();

    }

}
