package ex_19_OOPs_Part2.accessModifier.police;

public class Cop {
    public int gun;
    String iCard;

    public Cop(int gun) {
        this.gun = gun;
    }

    protected void canIshoot(){     //protected
        System.out.println("Yes you Can shoot");
    }
}
