package ex_10_forLoop;

public class Lab115_continue {
    public static void main(String[] args) {
        for (int i = 0; i <= 50; i++) {
            if (i == 5) {
                continue;  // Skip below code , move to top
            }
            System.out.println(i);
        }
    }
}