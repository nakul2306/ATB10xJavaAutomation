package ex_21_Static;

import java.sql.Statement;

public class Lab195_Real {

}

class ATB1 {
    {
        System.out.println("This is called when object is created");
        // What is the purpose
        //here you can write code related to
        //start a website or anything before starting anything
        //web automation or api automation
    }
    static {
        System.out.println("load the class , I will be execute");
    }

    private String name;
    private String phone;
    static String courseName= "ATB10x";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    void  readDocuments(){
        System.out.println("Non static method");
        System.out.println(courseName);      //not static method  can access static variable
    }

    static void doAssignment(){
       // System.out.println(phone);   // Static Method can not access the non-static variables
        System.out.println("Do Assignment");
    }

}
