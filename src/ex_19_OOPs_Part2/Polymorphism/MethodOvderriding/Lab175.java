package ex_19_OOPs_Part2.Polymorphism.MethodOvderriding;

public class Lab175 {
    public static void main(String[] args) {
        Pramod p = new Pramod();
        p.home();
        p.p1();

        Father f1 = new Father();
        f1.home();

        Father f2 = new Pramod();    // Dyanamic Dispatch
        f2.home(); // Method Overriding ---overridden the father method

      //   Pramod p3 = new Father();   // Not possible

    }
}
