package ex_19_OOPs_Part2.encapsulation;


public class Lab176 {
    public static void main(String[] args) {
        VWOLogin vwoLogin = new VWOLogin("admin", "pass123");
        System.out.println("vwoLogin.password");
        vwoLogin.password = "345";
        System.out.println(vwoLogin.password);

        GoodEcapVWOLogin vwoLogin1 = new GoodEcapVWOLogin("admin", "456");
        vwoLogin1.setUsername("Sushma");
        //set password
        System.out.println(vwoLogin1.getUsername());

        boolean  isAdmin = true;
        vwoLogin1.setPassword("123", false);
        System.out.println(vwoLogin1.getPassword());

    }


}

class VWOLogin {

    String username;
    String password;


    public VWOLogin(String usr, String pwd) {
        this.username = usr;
        this.password = pwd;
    }


}

class GoodEcapVWOLogin {
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password, boolean isAdmin) {
        if(isAdmin) {
            this.password = password;
        }
        else{
            System.out.println("Not allowed to change password !");
        }
    }

    public GoodEcapVWOLogin(String usr, String pwd) {
        this.username = usr;
        this.password = pwd;


    }
}