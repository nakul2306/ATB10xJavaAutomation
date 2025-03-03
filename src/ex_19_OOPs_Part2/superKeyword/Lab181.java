package ex_19_OOPs_Part2.superKeyword;

public class Lab181 {
    public static void main(String[] args) {
        Son s1 = new Son();
        s1.t1();

    }
}

class Father{
  int gold = 10;

  Father(){
      System.out.println("DC Father");
  }
    void home(){
        System.out.println("home Father");
    }

}

class Son extends Father {
     Son(){
        super();
    }

    void t1(){
        super.home();
        System.out.println(super.gold);
    }

}

