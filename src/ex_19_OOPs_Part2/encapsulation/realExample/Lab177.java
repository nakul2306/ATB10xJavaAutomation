package ex_19_OOPs_Part2.encapsulation.realExample;

public class Lab177 {
    public static void main(String[] args) {
        ICICIBank amit = new ICICIBank("Amit", 100);
        System.out.println(amit.getBal());

       boolean  isCashier =false;

        amit.setBal(1000, isCashier);
        System.out.println(amit.getBal());

    }

}

class ICICIBank{

    private String name;
    private long bal;

    public ICICIBank(String name, long bal) {
        this.name = name;
        this.bal = bal;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBal() {
        return bal;
    }

    public void setBal(long bal, boolean isCashier) {
        if (isCashier){
            this.bal =bal;
        }
        else {
            System.out.println("Not allowed to change the bal");
        }

    }
}
