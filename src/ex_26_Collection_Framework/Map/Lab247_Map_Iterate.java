package ex_26_Collection_Framework.Map;

import java.util.HashMap;
import java.util.Map;

public class Lab247_Map_Iterate {
    public static void main(String[] args) {
        Map< String, Integer> map = new HashMap();
        map.put("id", 1);
        map.put("id", 2);
        map.put("id2", 2);
        map.put("id3", 34);
        map.put("id6", 34);
        map.put("id4", null);
        map.put("id5", null);
        map.put(null, 102);

        // Terate over map

        for (Map.Entry<String, Integer> item : map.entrySet()){
            System.out.println(item.getKey() + "->"+ item.getValue());
        }
    }

}
