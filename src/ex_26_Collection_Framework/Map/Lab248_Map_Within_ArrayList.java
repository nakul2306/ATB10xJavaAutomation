package ex_26_Collection_Framework.Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Lab248_Map_Within_ArrayList {
    public static void main(String[] args) {
        HashMap <String,String> student1 = new HashMap();
        student1.put("name","Pramod");
        student1.put("roll", "1");
        student1.put("phone","9654321020");
        System.out.println(student1);

        HashMap <String,String> student2 = new HashMap();
        student2.put("name","amit");
        student2.put("roll", "2");
        student2.put("phone","9854321025");
        System.out.println(student1);

        List students= new ArrayList();
        students.add(student1);
        students.add(student2);
        System.out.println(students);




    }
}
