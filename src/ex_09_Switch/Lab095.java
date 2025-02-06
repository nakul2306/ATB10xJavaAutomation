package ex_09_Switch;

public class Lab095 {
    public static void main(String[] args) {
        int itemCode = 004;    // JDK 13

        switch (itemCode){
            case 001 -> System.out.println("001"); // -> act as a break;
            case 002 -> System.out.println("002");
            case 003 -> System.out.println("003");
            default -> System.out.println("Default");

        }
    }
}
