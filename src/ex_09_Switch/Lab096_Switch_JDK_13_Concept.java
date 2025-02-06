package ex_09_Switch;

public class Lab096_Switch_JDK_13_Concept {
    public static void main(String[] args) {

        // JDK 13 and more
        // Multiple match concept

        int itemcode = 003;

        switch (itemcode) {
            case 001, 002, 005:
                System.out.println("All of the them are electronic gadget");
                break;


            case 004, 000, 006:
                System.out.println("This is mech");
                break;

            default:
                System.out.println("None");

        }

    }
}
