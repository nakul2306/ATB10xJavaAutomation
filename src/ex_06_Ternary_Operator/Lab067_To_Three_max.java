package ex_06_Ternary_Operator;

public class Lab067_To_Three_max {
    public static void main(String[] args) {

        //Find the largest number , n1, n2, n3 ->>> max(n1,n2,n3)

        int n1 = 2, n2 = 9 , n3 = -11;

        int largest = (n1 >= n2)? ((n1 >= n3) ? n1 : n3) : ((n2 >= n3) ? n2: n3) ;


        System.out.println("largest Number: " + largest);

    }
}
