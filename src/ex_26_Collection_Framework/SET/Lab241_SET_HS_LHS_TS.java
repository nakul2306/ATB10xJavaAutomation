package ex_26_Collection_Framework.SET;

import java.sql.SQLOutput;
import java.util.*;

public class Lab241_SET_HS_LHS_TS {
    public static void main(String[] args) {

        Set hs = new HashSet();

        // Hashing mechanisam to store the element
        //no duplicates

        hs.add("Apple");
        hs.add("Orange");
        hs.add("WaterMelon");
        hs.add("WaterMelon");
        hs.add(123);
        hs.add(null);

        System.out.println(hs);

        System.out.println("_______________");

        Set lhs = new LinkedHashSet();
        // LinkedList Mechanism to store the object
        //order will maintain
        // dupliccates not allow

        lhs.add("Dapple");
        lhs.add("Aapple");
        lhs.add("Orange");
        lhs.add("WaterMelon");
        lhs.add("WaterMelon");

        lhs.add(null);
        System.out.println(lhs);
        System.out.println(lhs.isEmpty());
        System.out.println(lhs.contains("Apple"));
        System.out.println(lhs.size());

        System.out.println("__________________________________________");

        Set ts = new TreeSet();
        // Blck and Red tree mechanism to store the element
        //Order is maintain , natural sorting is done.


        ts.add("Dapple");
        ts.add("Aapple");
        ts.add("Orange");
        ts.add("WaterMelon");

      //   ts.add(123);    ClassCastException
       //  ts.add(null);   NullPointerException

        System.out.println(ts);

        System.out.println("____For Each--------");
        for (Object o: ts){
            System.out.println(o);
        }

    }
}
