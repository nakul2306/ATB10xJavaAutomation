package ex_09_Switch;

public class Lab098 {
    public static void main(String[] args) {
        char code = 'C';

        switch (code) {
            default:
                System.out.println("hello");
                break;

            case 'A':
                System.out.println("10");
                break;
            case 'B':
                System.out.println("1");
        }
    }

}
