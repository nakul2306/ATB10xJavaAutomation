package ex_20_OOPs_Super_Abstraction;

public class Lab182 {
    public static void main(String[] args) {
        Car c1 = new Car(100);
        c1.display();

    }
}

class Car extends Vehicle {
    private int maxSpeed = 281;

    Car(){
        super(100);
    }

    Car(int a){
        System.out.println("PC Car");
    }
    void test(){

    }

    @Override
    void display(){
        System.out.println("Override - Car");
        System.out.println(super.maxSpeed);
        System.out.println(this.maxSpeed);
        super.notest();
        this.test();
    }

}


class Vehicle{
    public int maxSpeed = 180;

    public Vehicle() {
        System.out.println("default Constructor");
    }

    public Vehicle(int a) {
        System.out.println("PC Constructor");
    }

    void massage(){
        System.out.println("No Return, No argument");
    }

    void massage(int a){
        System.out.println("method with  argument");
    }

    void display(){
        System.out.println("Vehicle Display");
    }

    void notest(){

    }


}