package ex_26_Collection_Framework;

import java.util.ArrayList;
import java.util.List;

public class Lab228_ArrayList {
    public static void main(String[] args) {

        List list = new ArrayList();
        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add(4);
        list.add(true);

        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.contains("1"));
        System.out.println(list.contains(1));  //integer
        System.out.println(list.contains("1"));

        System.out.println(list.indexOf("3")); // find the first occurrence of element in list
        System.out.println(list.lastIndexOf("3")); // find the first occurance of element in list

        System.out.println(list);

        System.out.println("____________________________________________________________________________________");

        for (int i=0; i<list.size();i++){
            System.out.println(list.get(i));
        }

    }
}
