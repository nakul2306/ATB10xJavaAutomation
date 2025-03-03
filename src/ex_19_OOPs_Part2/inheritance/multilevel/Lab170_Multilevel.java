package ex_19_OOPs_Part2.inheritance.multilevel;

public class Lab170_Multilevel {
    public static void main(String[] args) {
        Son pramod = new Son();
        Father f = new Father();
        GrandFather gf = new GrandFather();


        pramod.home();
        f.home();

        //    Son s1 = new GrandFather();   // not possible
        //    Son s1 = new Father();        // not possible

        GrandFather g1 = new Son();
        GrandFather g2 = new Father();
        Father f2 = new Son();



    }
}
