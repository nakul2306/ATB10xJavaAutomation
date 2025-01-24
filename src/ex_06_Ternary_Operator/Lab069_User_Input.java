package ex_06_Ternary_Operator;

public class Lab069_User_Input {
    public static void main(String[] args) {

        //Take Input  --- Edit Configuration and Run or apply //CLI --comand line

        String age_string = args[0];
        int age = Integer.parseInt(age_string);

        System.out.println(age);

        String canIGOGoa = age>=24 ? "Yes": "No";
        System.out.println(canIGOGoa);

    }
}
