package ex_21_Static;

public class Lab196_static {
    public static void main(String[] args) {
        Automation t1 = new Automation();
        System.out.println(Automation.driver);
        System.out.println(t1.driver);

        Automation.driver = "Firefox";
        System.out.println(Automation.driver);
        System.out.println(Automation.driver2);

    }
}

class Automation{
    static String driver = "Chrome";
    static String driver2;
}