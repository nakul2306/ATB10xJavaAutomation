package ex_26_Collection_Framework.Map;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Hashtable;

public class Lab249_HashTable {
    public static void main(String[] args) {
        Hashtable<Integer,String> ht1 = new Hashtable();
        ht1.put(1, "one");
        ht1.put(2, "two");
        ht1.put(3, "three");
        ht1.put(4, "three");
       // ht1.put(null, "three"); //.NullPointerException
       // ht1.put(null, null);  NullPointerException

        System.out.println(ht1);

        HashMap<Integer,String> ht2 = new HashMap();
        ht2.put(1, "one");
        ht2.put(2, "two");
        ht2.put(3, "three");
        ht2.put(4, "three");
        ht2.put(null, "three");//allowed in Hashmap
        ht2.put(null, null);  // allowed in HashMap
        System.out.println(ht2);


        Enumeration<Integer> e = ht1.keys();
        while(e.hasMoreElements()){
            System.out.println(e.nextElement());
        }




    }
}
