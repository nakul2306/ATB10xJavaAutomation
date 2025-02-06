package ex_10_forLoop;

public class Lab113_odd_even_50 {
    public static void main(String[] args) {

        // Shruti -- To find even number from 1 to 50

        for (int i=0; i<=50; i++){
            if(i%2==0){
                System.out.println("Even ->"+ i );
            }
            else{
                System.out.println("Odd -> "+i);
            }
        }

    }
}
