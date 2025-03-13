package ex_26_Collection_Framework.Map;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Lab244_Map_P1 {
    public static void main(String[] args) {
        Map m1 = new HashMap();
        // Map is key value
        //name : Pramod
        //rollno : 1
        //phone : 9865321485

        m1.put("name", "Pramod");
        m1.put("roll no", 1);
        m1.put ("phone",986532148);
        System.out.println(m1);

        System.out.println("__________________________________");

        Map m2 = new LinkedHashMap();
        // Map is key value
        //name : Pramod
        //rollno : 1
        //phone : 9865321485

        m2.put("name", "Pramod");
        m2.put("roll no", 1);
        m2.put ("phone", 986532148);

        System.out.println(m2);

        System.out.println("__________________________________");

        Map m3 = new TreeMap();
        // Map is key value
        //name : Pramod
        //rollno : 1
        //phone : 9865321485

        m3.put("name", "Pramod");
        m3.put("roll no", 1);
        m3.put ("phone", 986532148);

        System.out.println(m3);

        System.out.println("__________________________________");

    }
}
