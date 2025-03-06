package ex_20_OOPs_Super_Abstraction;

public class Lab191 {
    public static void main(String[] args) {
        Dutta d = new Dutta();
        d.display();
        System.out.println(d.a);

        Pramod d1 = new Dutta();  // This is possible, called as dynamic dispatch with interface
    }
}




class Dutta implements Pramod{

    @Override
    public void display() {
        System.out.println(a);
    }
}

interface  Pramod{
    public int a=10;
    void display();
}