package ex_06_Ternary_Operator;

public class Lab062_TO {

    public static void main(String[] args) {
        // result = condition ? expression1 : expression2 ;

        int age = 18;
        String canIVote = age >=18  ? "Yes, You can vote" : "No, You can't vote";

        System.out.println(canIVote);

       int age2 =10;

       String canIVote2 = age2 >=18 ? "Yes, You can vote" : "No, You can't vote";

        System.out.println(canIVote2);
    }

}
