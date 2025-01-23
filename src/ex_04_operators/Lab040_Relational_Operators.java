package ex_04_operators;

public class Lab040_Relational_Operators {
    public static void main(String[] args) {
        //< less than
        // <=  less than or equal to
        // > = greater or equal
        // == ->  Equal to (but Checking)
        // != -> Not Equal
        // All of them result boolean output.

        int a = 10;
        int b = 30;

        boolean c = a>b ;

        System.out.println(c);

        int age_mamita = 34;
        int age_pramod = 34;

        boolean result = age_pramod >= age_mamita;
        System.out.println(result);

    }
}
