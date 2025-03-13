package ex_26_Collection_Framework.List;

import java.util.Stack;

public class Lab238_Stack {
    public static void main(String[] args) {
        // Stack - Last In First Out

        Stack s = new Stack();

        s.add("Pramod");
        s.add("Dutta");

        System.out.println(s);

        System.out.println("_________________");


        Stack s1 = new Stack();
        s1.push("Pramod");
        s1.push("Dutta");
        s1.push("Amit");
        s1.push("Monu");

        System.out.println(s1);
        System.out.println(s1.size());
        System.out.println(s1.peek());
        System.out.println(s1);
        System.out.println(s1.pop());
        System.out.println(s1);

        System.out.println(s1.isEmpty());
        System.out.println(s1.add("Snehal"));
        System.out.println(s1);

        System.out.println(s.get(0));
        System.out.println(s.get(1));

    }
}
