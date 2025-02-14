package ex_13_Functions;

public class Lab127 {
    public static void main(String[] args) {

        //1. without argument without return type
        greet();

        String s = greet_with_hello();
        System.out.println(s);
        greet_with_name("Datta");
        int total= sum(3,4);
        int total2= sum(6,7);
        int total3= sum(12,2);
        System.out.println(total);
        System.out.println(total2);
        System.out.println(total3);


    }

    //1. without argument without return type
    static void greet() {
        System.out.println("Hi, how are you?");
    }

    // 2.Without parameter but with return type

    static String greet_with_hello() {
        return "Hi , hi are you, Example 2 ";
    }

    // 3. With Parameter and Without return type // 90 percent this use

    static void greet_with_name (String name){
        System.out.println("Your name is "+ name);
    }

    // 4.With parameter and with return type

    static int sum(int a, int b){
        return a+b;
    }


}
