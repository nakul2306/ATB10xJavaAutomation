package ex_09_Switch;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Lab092 {

    // Web Automation
    //  I will ask user which browser you want me to run the code
    // Chrome -> execute code
    // Firefox -> execute  firefox
    //edge browser cases

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a the browser");
        String browser = sc.next();

        switch (browser) {
            case "Chrome":
                System.out.println("Starting the chrome");
                // code to start the chrome
                System.out.println(".......");
                System.out.println("TC");
                break;

            case "Firefox":
                System.out.println("Starting the firefox browser");
                // code to start the firefox
                System.out.println(".......");
                System.out.println("TC");
                break;

            case "edge":
                System.out.println("Starting the edge browser");
                break;
            default:
                System.out.println("I have no idea which browser is this");


        }

    }


}
