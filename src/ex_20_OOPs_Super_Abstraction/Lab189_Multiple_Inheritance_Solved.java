package ex_20_OOPs_Super_Abstraction;

public class Lab189_Multiple_Inheritance_Solved {
    public static void main(String[] args){
        Child1 child1 = new Child1();
        child1.money();

    }
}

class Child1 implements FatherF, MotherM {

    @Override
    public void money() {
        System.out.println("only one money");
    }

    @Override
    public void m1() {

    }

    @Override
    public void ff() {

    }
}


interface MotherM{
    void money();
    void m1();

}



interface FatherF{
    void money();
    void m1();

    default void ff(){
        System.out.println("This is only allowed!");
    }

}