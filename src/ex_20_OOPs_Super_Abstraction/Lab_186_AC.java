package ex_20_OOPs_Super_Abstraction;

public class Lab_186_AC {
    public static void main(String[] args) {
        WagonR wagnoR = new WagonR();
        wagnoR.drive();

    }
}



class WagonR extends Engine{

    @Override
    void startEngine() {
        System.out.println("Start");
    }

    @Override
    void stopEngine() {
        System.out.println("Stop");
    }

    void drive(){
        startEngine();
        System.out.println("I am starting");
        stopEngine();
    }

}


abstract class Engine{
    abstract void startEngine();
    abstract void stopEngine();
}