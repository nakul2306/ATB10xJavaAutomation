package ex_18_OOPs_Constructor;

public class Lab162_OOPs {
    public static void main(String[] args) {

        Baby b1 = new Baby();
        new Baby();
        new Baby();
        Baby b2;

    }
}


class Baby {
    String name;

    Baby() {
        System.out.println("I am called, Object is created !");

    }

    // Instance Initialization Class
    {
        System.out.println("I am also called, when class is loaded");
    }

}