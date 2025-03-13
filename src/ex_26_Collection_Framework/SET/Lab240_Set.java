package ex_26_Collection_Framework.SET;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Lab240_Set {
    public static void main(String[] args) {

        Set hs = new HashSet();
        Set lhs = new LinkedHashSet();
        Set ts = new TreeSet();

        hs.add("Pramod");
        hs.add("Pramod");     // Duplicates are not allowed
        hs.add("pramod");
        hs.add("dramod");

        System.out.println(hs);

    }

}
