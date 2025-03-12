package ex_24_Exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Lab218_Interview {
    public static void main(String[] args) {
        try {
            FileReader f = new FileReader("c://abc.text");
        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        }
    }
}
