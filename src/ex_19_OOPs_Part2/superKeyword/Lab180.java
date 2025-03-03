package ex_19_OOPs_Part2.superKeyword;



public class Lab180 {
    public static void main(String[] args) {
        TestCase1 t1 = new TestCase1("chrome");
        t1.openBrowser();
        System.out.println("TestCase T1 is running");
        t1.closeBrowser();
        System.out.println(t1.getBrowser());

        TestCase1 t2 = new TestCase1("edge");
        System.out.println(t2.getBrowser());




    }
}




class BaseClass {
    String browser;

    public BaseClass(String browser) {
        this.browser = browser;
    }

    public String getBrowser() {
        return browser;
    }

    public void setBrowser(String browser, boolean isAdmin) {
        if (isAdmin) {
            this.browser = browser;
        } else {
            System.out.println("Change browser not allow, Not A admin");
        }

    }

    void openBrowser() {
        System.out.println("opening browser -> ");
    }

    void  openBrowser(String browserName) {
        System.out.println("open browser -> " + browserName);
    }

    void closeBrowser() {
        System.out.println("close browser -> ");

    }

}

class TestCase1 extends BaseClass {

    public TestCase1(String browser) {
        super(browser);
    }

    @Override
    public void setBrowser(String browser, boolean isAdmin) {
        System.out.println("Override parent set browser");
    }
}
