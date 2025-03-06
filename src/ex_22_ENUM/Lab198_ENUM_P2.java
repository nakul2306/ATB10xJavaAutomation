package ex_22_ENUM;

import java.sql.SQLOutput;

public class Lab198_ENUM_P2 {
    public static void main(String[] args) {
        System.out.println(URLS.katalon);
        if (URLS.katalon.equals("Katalon")){
            System.out.println("I want to do something");
        }
    }

}


enum URLS {
    google, katalon, vwologin
}

