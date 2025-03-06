package ex_20_OOPs_Super_Abstraction;

public class Lab187_Interface_P1 {
    public static void main(String[] args) {
        Car1 car1 = new Car1();
        car1.drive();

    }
}


class Car1 implements Engine1, Brakes {

    void drive(){
        startEngine();
        applyBrakes();
        stopEngine();

    }

    @Override
    public void startEngine() {
        System.out.println("Start Engine");
    }

    @Override
    public void stopEngine() {
        System.out.println("Stop Engine");
    }

    @Override
    public void applyBrakes() {
        System.out.println("Apply Brakes");
    }
}

interface Engine1{
    void startEngine();
    void stopEngine();

    default void test(){
        System.out.println("Concrete complete not possible, only possible by using default");
    }
}

interface Brakes{
    void applyBrakes();
}

