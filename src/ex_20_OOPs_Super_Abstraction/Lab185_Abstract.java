package ex_20_OOPs_Super_Abstraction;

public class Lab185_Abstract {
    public static void main(String[] args) {
       Child  c = new Child();
       c.loan50K();
       c.loan25k();

      //  Father f1 = new Father(); // Can not create object of abstract class
    }
}


abstract class Father{
    abstract void loan50K();
    void loan25k(){
        System.out.println("Given 20k");
    }
}


class Child extends Father {
    void loan50K(){
        System.out.println("Child will pay the loan");
    }
}