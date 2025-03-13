package ex_26_Collection_Framework.List;

import java.util.ArrayList;
import java.util.List;

public class Lab232_Nested_ArrayList {
    public static void main(String[] args) {

        List<String> fruits1 = new ArrayList();
        fruits1.add("orange");
        fruits1.add("Apple");
        fruits1.add("Cherry");

        System.out.println(fruits1);

        List fruits2 = new ArrayList();
        fruits2.add("Mango");
        fruits2.add("Grapes");
        fruits2.add("Papaya");

        System.out.println(fruits2);

        List vegatables = new ArrayList();
        vegatables.add("Tamato");
        vegatables.add("Patato");
        vegatables.add("Onion");

        System.out.println(vegatables);

        List all_fruits = new ArrayList();
        all_fruits.add(fruits1);
        all_fruits.add(fruits2);
        all_fruits.add(vegatables);

        System.out.println(all_fruits);
        System.out.println(all_fruits.get(0));

    }
}
