package ex_26_Collection_Framework.List;

import java.util.ArrayList;
import java.util.List;

public class Lab227_List_ArrayList {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add ("Pramod");
        arrayList.add(null);
        arrayList.add("datta");
        arrayList.add("datta"); // Duplicate is allowed
        arrayList.add(123); // diffrent data type is allowed
        System.out.println(arrayList);
        System.out.println(arrayList.size());


        List l = new ArrayList();  // Dynamic Dispatch
        l.add("123");
        l.add("456");

        System.out.println(l);


    }
}
