package ex_26_Collection_Framework.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab231_ArrayList {
    public static void main(String[] args) {

        List list = new ArrayList();
        list.add("bread");
        list.add("Milk");
        list.add("Butter");
        list.add("Panner");
        list.add("Jam");
        list.add("Cheeze");
        list.add(123);
        list.add(true);


        System.out.println(list);
        System.out.println(list.size());
        System.out.println(list.isEmpty());
        System.out.println(list.contains("1"));


        System.out.println(list);

        System.out.println("_____-Default For Loop");
        for (int i = 0; i<list.size(); i++){
            System.out.println(list.get(i));
        }

        System.out.println("--------fot each loop");
        for (Object o:list){
            System.out.println(o);
        }

        System.out.println("----To print ArrayList Iterator");

        // Iterator - Anchor - go one by one forward -> get access them
        // HasNext() -> true - If we have next element
        //Next -> element
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
