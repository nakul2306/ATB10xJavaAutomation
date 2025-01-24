package ex_07_Incriment_Decriment_Operator;


import java.sql.SQLOutput;

public class Lab071_PreAndPost_ID {
    public static void main(String[] args) {


        //pre increment
        int a = 10;

        System.out.println(++a);  //11
        System.out.println(a);  //11

        //Post Increment

        int a_post = 10;
        System.out.println(a_post++); //10
        System.out.println(a_post);   //11

    }
}
