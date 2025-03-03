package ex_19_OOPs_Part2.Polymorphism.MethodOvderriding;

public class Pramod extends Father {

    @Override
    void home(){
        System.out.println("3BHK");
    }
    void p1(){
        System.out.println("Pramod - P1");
    }
}
