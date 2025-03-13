package ex_26_Collection_Framework.List;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab237_AL_iteration {
    public static void main(String[] args) {
        List<String> list = new ArrayList();
        list.add("Pramod");
        list.add("Amit");
        list.add("Dutta");


        System.out.println(list);



        System.out.println("--------To print ArrayList 1");
        for (String  str :list){
            System.out.println(str);
        }



        System.out.println("----To print ArrayList 2 ");

        // Iterator - Anchor - go one by one forward -> get access them
        // HasNext() -> true - If we have next element
        //Next -> element
        Iterator iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }

        System.out.println("_____To print ArrayList 3");
        for (int i = 0; i<list.size(); i++){
            System.out.println(list.get(i));
        }


    }
}
