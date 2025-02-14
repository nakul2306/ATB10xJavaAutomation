package ex_14_Strings;

public class Lab138_InterviewQ2 {
    public static void main(String[] args) {
        String s1 = "Hello" ; //SCP   1
        String s4 = "Hello" ;//SCP    1
        String s10 = "Hello"; //SCP   1

        String s2 = new String("Hello"); // object area 2
        String s3 = new String("Hello"); // OA  3
        String s5 = new String("hello"); //OA   4

        // == comparison of string, -- This check the locations reference

      //  System.out.println(s1==s3);
      //  System.out.println(s1==s2);
      //  System.out.println(s2==s3);

        System.out.println(s1==s4);
        System.out.println(s3==s5);

        // equal (content) -> Value

        // How can I check the values    equals == value

        System.out.println(s1.equals(s2));
        System.out.println(s2.equals(s3));
        System.out.println(s3.equals(s5));
        System.out.println(s3.equalsIgnoreCase(s5));



    }


}
