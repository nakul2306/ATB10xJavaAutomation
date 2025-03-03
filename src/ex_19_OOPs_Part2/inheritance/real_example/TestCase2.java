package ex_19_OOPs_Part2.inheritance.real_example;

public class TestCase2 extends CommonTOAllTest{
    void runningTC2(){
        startBrowser();
        readExcelFile();
        readDataBaseFile();
        System.out.println("Running Test Case 2");
        closeBrowser();

    }
}
