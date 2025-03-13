package ex_26_Collection_Framework.List;

import java.util.LinkedList;
import java.util.List;

public class Lab229_LinkedList {
    public static void main(String[] args) {
        List list = new LinkedList();

        list.add("Pramod");
        list.add("Dutta");
        list.add("Amit");
        list.add("Meenu");
        list.add("Ritwik");
        list.add("Ritwik");
        list.add(null);
        list.add(true);
        list.add(123);

        System.out.println(list);
        System.out.println(list.isEmpty());
        System.out.println(list.size());
        System.out.println(list.contains("Dutta"));
        System.out.println(list.indexOf("Dutta"));


    }
}
