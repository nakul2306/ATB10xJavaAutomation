package ex_26_Collection_Framework.SET;

import java.util.HashSet;

public class Lab242_Hs {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet();

        set.add("orange");
        set.add("Apple");
        set.add("Banana");
        set.add("orange");

        System.out.println("Set Element "+ set);

    }
}
