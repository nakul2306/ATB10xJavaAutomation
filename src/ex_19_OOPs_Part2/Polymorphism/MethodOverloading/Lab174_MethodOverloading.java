package ex_19_OOPs_Part2.Polymorphism.MethodOverloading;

public class Lab174_MethodOverloading {
    public static void main(String[] args) {
        MathOperations m1 = new MathOperations();
        int r = m1.add(3,4);
        System.out.println(r);

        int r1 = m1.add(3,4, 5);
        System.out.println(r1);

        double r2 = m1.add(5.5,12.5);
        System.out.println(r2);


    }
}
