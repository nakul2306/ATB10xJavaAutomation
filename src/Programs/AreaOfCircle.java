package Programs;

import java.util.Scanner;

//public class AreaOfCircle {
//
//    public static void main(String[] args) {
//        double pi = 3.14;
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Enter Radius Of Circle");
//        double r = scan.nextDouble();
//        double Area = pi * (r * r);
//        System.out.println("Area of circle is " + Area);
//        scan.close();
//    }
//
//}


//  Use Below Code Perfect Area


public class AreaOfCircle {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter Radius Of Circle");
        double r = scan.nextDouble();
        double Area = Math.PI * Math.pow(r, 2);
        System.out.println("Area of circle is " + Area);
        scan.close();
    }
}